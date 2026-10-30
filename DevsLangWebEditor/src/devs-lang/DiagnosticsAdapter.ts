import * as monaco from 'monaco-editor-core';
import { WorkerAccessor } from './setup';
import { languageID } from './config';
import { IDevsLangError } from '../language-service/DevsErrorListener';

export default class DiagnosticsAdapter {
  constructor(private readonly worker: WorkerAccessor) {
    const onModelAdd = (model: monaco.editor.IModel) => {
      let handle: ReturnType<typeof setTimeout>;
      model.onDidChangeContent(() => {
        clearTimeout(handle);
        handle = setTimeout(() => this.validate(model.uri), 350);
      });
      this.validate(model.uri);
    };

    monaco.editor.onDidCreateModel(onModelAdd);
    monaco.editor.getModels().forEach(onModelAdd);
  }

  private async validate(resource: monaco.Uri): Promise<void> {
    const worker = await this.worker(resource);
    const errors = await worker.doValidation();
    const model = monaco.editor.getModel(resource);
    if (!model) return;
    monaco.editor.setModelMarkers(model, languageID, errors.map(toDiagnostic));
  }
}

function toDiagnostic(error: IDevsLangError): monaco.editor.IMarkerData {
  return { ...error, severity: monaco.MarkerSeverity.Error };
}
