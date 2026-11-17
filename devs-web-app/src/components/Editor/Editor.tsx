import * as React from 'react';
import * as monaco from 'monaco-editor-core';
import DevsLanguageService from '../../language-service/LanguageService';
import { DevsMappingResponse, mapDevs } from '../../api/MapperDevsApi';
import { ModelTree } from './ModelTree';

interface IEditorProps {
  language: string;
}

type OutputTab = 'summary' | 'intermediate' | 'computational';
type ModelView = 'tree' | 'xml';

const example = `DETECTOR = (X, Y, S, \\delExt, \\delInt, \\lambda, \\ta)

\\where

X = { (p,action) | p \\in {"action_in"}, action \\in ACTIONS};
Y = { (p,signal) | p \\in {"signal_out"}, signal \\in SIGNALS};
S = { (signal,sent) | signal \\in SIGNALS, sent \\in {\\true,\\false}};

\\delExt((signal,sent),e,(p,action)) =
    ("moving",\\false) \\if p \\equalTo "action_in" \\and action \\in {"typing","waving"} \\and signal \\equalTo "still",
    ("still",\\false) \\if p \\equalTo "action_in" \\and action \\in {"gone","reading"} \\and signal \\equalTo "moving",
    (signal,\\true) \\if p \\equalTo "action_in";

\\delInt((signal,sent)) =
    (signal,\\true) \\if sent \\equalTo \\false;

\\lambda((signal,sent)) =
    ("signal_out",signal) \\if sent \\equalTo \\false;

\\ta((signal,sent)) =
    0 \\if \\not sent,
    \\infinity \\if sent`;

export const Editor: React.FC<IEditorProps> = ({ language }) => {
  const editorNode = React.useRef<HTMLDivElement | null>(null);
  const editorRef = React.useRef<monaco.editor.IStandaloneCodeEditor | null>(null);

  const [busy, setBusy] = React.useState(false);
  const [response, setResponse] = React.useState<DevsMappingResponse | null>(null);
  const [clientErrors, setClientErrors] = React.useState<string[]>([]);
  const [requestError, setRequestError] = React.useState('');
  const [tab, setTab] = React.useState<OutputTab>('summary');
  const [intermediateView, setIntermediateView] = React.useState<ModelView>('tree');
  const [computationalView, setComputationalView] = React.useState<ModelView>('tree');

  const isIntermediate = tab === 'intermediate';
  const activeXmi = isIntermediate
    ? response?.devsModelXmi
    : response?.devsComputationalModelXmi;
  const activeView = isIntermediate ? intermediateView : computationalView;
  const setActiveView = isIntermediate ? setIntermediateView : setComputationalView;

  React.useEffect(() => {
    if (!editorNode.current) return;

    const editor = monaco.editor.create(editorNode.current, {
      value: example,
      language,
      automaticLayout: true,
      minimap: { enabled: false },
      fontSize: 14,
      lineHeight: 22,
      wordWrap: 'on',
      glyphMargin: true,
      scrollBeyondLastLine: false
    });

    editorRef.current = editor;

    return () => {
      editor.dispose();
      editorRef.current = null;
    };
  }, [language]);

  const validateClient = (): boolean => {
    const source = editorRef.current?.getValue() ?? '';
    const errors = new DevsLanguageService().validate(source);

    setClientErrors(
      errors.map(e => `Línea ${e.startLineNumber}:${e.startColumn} — ${e.message}`)
    );

    return errors.length === 0;
  };

  const process = async () => {
    setRequestError('');
    setResponse(null);

    if (!validateClient()) return;

    setBusy(true);

    try {
      const source = editorRef.current?.getValue() ?? '';
      const result = await mapDevs(source);
      setResponse(result);
      setTab('summary');
    } catch (e) {
      setRequestError(
        e instanceof Error ? e.message : 'Error inesperado al invocar Mapper_DEVS.'
      );
    } finally {
      setBusy(false);
    }
  };

  const download = (content: string | null | undefined, filename: string) => {
    if (!content) return;

    const blob = new Blob([content], { type: 'application/xml;charset=utf-8' });
    const url = URL.createObjectURL(blob);
    const a = document.createElement('a');

    a.href = url;
    a.download = filename;
    a.click();

    URL.revokeObjectURL(url);
  };

  const diagnostics = [
    ...(response?.intermediateValidation?.diagnostics ?? []),
    ...(response?.computationalValidation?.diagnostics ?? [])
  ];

  return (
    <div className="app-shell">
      <header className="topbar">
        <div>
          <div className="eyebrow">DEVS · MDE</div>
          <h1>DEVS Web Text Editor</h1>
          <p>Editor textual → Mapper_DEVS → devsModel → ATL → devsComputationalModel</p>
        </div>
        <div className="backend-pill">Mapper_DEVS API</div>
      </header>

      <main className="workspace">
        <section className="panel editor-panel">
          <div className="panel-header">
            <div>
              <h2>Especificación DEVS</h2>
              <span>Validación sintáctica ANTLR en el navegador</span>
            </div>
            <button className="secondary" onClick={validateClient}>
              Validar sintaxis
            </button>
          </div>

          <div ref={editorNode} className="editor" />

          <div className="actions">
            <button className="primary" disabled={busy} onClick={process}>
              {busy ? 'Procesando…' : 'Procesar con Mapper_DEVS'}
            </button>
          </div>

          {clientErrors.length > 0 && (
            <div className="diagnostics error-box">
              <strong>Errores sintácticos</strong>
              {clientErrors.map((error, index) => (
                <div key={index}>{error}</div>
              ))}
            </div>
          )}
        </section>

        <section className="panel result-panel">
          <div className="panel-header">
            <div>
              <h2>Resultado del pipeline</h2>
              <span>Respuesta de POST /api/devs/map</span>
            </div>
            {response && (
              <span className={`status ${response.success ? 'ok' : 'fail'}`}>
                {response.stage}
              </span>
            )}
          </div>

          <div className="tabs">
            <button
              className={tab === 'summary' ? 'active' : ''}
              onClick={() => setTab('summary')}
            >
              Resumen
            </button>
            <button
              className={tab === 'intermediate' ? 'active' : ''}
              onClick={() => setTab('intermediate')}
            >
              devsModel.xmi
            </button>
            <button
              className={tab === 'computational' ? 'active' : ''}
              onClick={() => setTab('computational')}
            >
              Computacional
            </button>
          </div>

          <div className="result-content">
            {!response && !requestError && (
              <div className="empty-state">
                Ejecutá el mapper para ver validaciones y modelos generados.
              </div>
            )}

            {requestError && (
              <div className="diagnostics error-box">{requestError}</div>
            )}

            {response && tab === 'summary' && (
              <div>
                <h3>{response.message}</h3>

                <div className="stage-grid">
                  <Stage label="Intermedio" value={response.intermediateValidation} />
                  <Stage label="Computacional" value={response.computationalValidation} />
                </div>

                {diagnostics.length > 0 && (
                  <div className="diagnostics">
                    <strong>Diagnósticos</strong>
                    {diagnostics.map((diagnostic, index) => (
                      <div key={index}>{diagnostic}</div>
                    ))}
                  </div>
                )}

                <div className="download-row">
                  <button
                    className="secondary"
                    disabled={!response.devsModelXmi}
                    onClick={() => download(response.devsModelXmi, 'devsModel.xmi')}
                  >
                    Descargar devsModel.xmi
                  </button>

                  <button
                    className="secondary"
                    disabled={!response.devsComputationalModelXmi}
                    onClick={() =>
                      download(
                        response.devsComputationalModelXmi,
                        'devsComputationalModel.xmi'
                      )
                    }
                  >
                    Descargar computacional
                  </button>
                </div>
              </div>
            )}

            {response && tab !== 'summary' && (
              <div>
                <div
                  className="model-view-switch"
                  role="group"
                  aria-label={
                    isIntermediate
                      ? 'Vista del modelo intermedio'
                      : 'Vista del modelo computacional'
                  }
                >
                  <button
                    type="button"
                    className={`secondary${activeView === 'tree' ? ' active' : ''}`}
                    aria-pressed={activeView === 'tree'}
                    onClick={() => setActiveView('tree')}
                  >
                    Árbol
                  </button>

                  <button
                    type="button"
                    className={`secondary${activeView === 'xml' ? ' active' : ''}`}
                    aria-pressed={activeView === 'xml'}
                    onClick={() => setActiveView('xml')}
                  >
                    XML
                  </button>
                </div>

                {!activeXmi ? (
                  <p className="muted">No generado.</p>
                ) : activeView === 'tree' ? (
                  <ModelTree key={tab} xmi={activeXmi} />
                ) : (
                  <pre>{activeXmi}</pre>
                )}
              </div>
            )}
          </div>
        </section>
      </main>
    </div>
  );
};

const Stage: React.FC<{
  label: string;
  value?: { valid: boolean; severity: number; diagnostics: string[] } | null;
}> = ({ label, value }) => (
  <div className="stage-card">
    <div className="stage-name">{label}</div>
    {!value ? (
      <div className="muted">No ejecutado</div>
    ) : (
      <>
        <div className={value.valid ? 'valid' : 'invalid'}>
          {value.valid ? 'Válido' : 'Inválido'}
        </div>
        <div className="muted">Severidad: {value.severity}</div>
      </>
    )}
  </div>
);