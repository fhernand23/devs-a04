import * as React from 'react';

interface ModelAttribute {
  name: string;
  value: string;
}

interface ModelNode {
  id: string;
  element: string;
  namespace: string;
  type: string;
  label: string;
  attributes: ModelAttribute[];
  text: string;
  children: ModelNode[];
}

interface ParsedModel {
  root: ModelNode;
  nodes: Map<string, ModelNode>;
}

const XSI_NAMESPACE = 'http://www.w3.org/2001/XMLSchema-instance';

function parseXmi(source: string): ParsedModel {
  const document = new DOMParser().parseFromString(
    source,
    'application/xml'
  );

  const parserError = document.getElementsByTagName('parsererror')[0]
    || document.getElementsByTagNameNS('*', 'parsererror')[0];

  if (parserError || !document.documentElement) {
    throw new Error(
      'No se pudo interpretar el XMI. Consultá la vista XML para revisar el contenido.'
    );
  }

  const nodes = new Map<string, ModelNode>();

  function visit(element: Element, id: string): ModelNode {
    const attributes: ModelAttribute[] = Array.from(
      element.attributes
    ).map(attribute => ({
      name: attribute.name,
      value: attribute.value
    }));

    const declaredType = element.getAttributeNS(
      XSI_NAMESPACE,
      'type'
    );

    const type = declaredType
      ? declaredType.split(':').pop() || declaredType
      : element.localName;

    const name = element.getAttribute('name');
    const value = element.getAttribute('value');

    const description = name !== null && name !== ''
      ? name
      : value !== null
        ? JSON.stringify(value)
        : '';

    // Conserva el nombre de la relación cuando difiere del tipo.
    const baseLabel = declaredType && element.localName !== type
      ? `${element.localName} · ${type}`
      : type;

    const text = Array.from(element.childNodes)
      .filter(child =>
        child.nodeType === 3 || child.nodeType === 4
      )
      .map(child => child.nodeValue || '')
      .join('')
      .trim();

    const node: ModelNode = {
      id,
      element: element.tagName,
      namespace: element.namespaceURI || '',
      type,
      label: description
        ? `${baseLabel}: ${description}`
        : baseLabel,
      attributes,
      text,
      children: []
    };

    nodes.set(id, node);

    node.children = Array.from(element.children).map(
      (child, index) => visit(child, `${id}/${index}`)
    );

    return node;
  }

  return {
    root: visit(document.documentElement, 'root'),
    nodes
  };
}

interface BranchProps {
  node: ModelNode;
  depth: number;
  selectedId: string;
  onSelect: (id: string) => void;
}

const Branch: React.FC<BranchProps> = ({
  node,
  depth,
  selectedId,
  onSelect
}) => {
  const label = (
    <button
      type="button"
      className={
        `model-node-label${selectedId === node.id ? ' selected' : ''}`
      }
      aria-pressed={selectedId === node.id}
      onClick={event => {
        event.stopPropagation();
        onSelect(node.id);
      }}
    >
      {node.label}
    </button>
  );

  return (
    <li>
      {node.children.length > 0 ? (
        <details open={depth < 2}>
          <summary>
            {label}
            <span className="model-node-count">
              {node.children.length}
            </span>
          </summary>

          <ul>
            {node.children.map(child => (
              <Branch
                key={child.id}
                node={child}
                depth={depth + 1}
                selectedId={selectedId}
                onSelect={onSelect}
              />
            ))}
          </ul>
        </details>
      ) : (
        <div className="model-node-leaf">
          {label}
        </div>
      )}
    </li>
  );
};

const TreeContent: React.FC<{ model: ParsedModel }> = ({ model }) => {
  const [selectedId, setSelectedId] = React.useState(model.root.id);
  const selected = model.nodes.get(selectedId) || model.root;

  return (
    <div className="model-viewer">
      <p className="model-tree-help">
        Desplegá las flechas para explorar el modelo.
        Seleccioná un elemento para ver sus propiedades.
      </p>

      <nav className="model-tree" aria-label="Estructura del modelo">
        <ul>
          <Branch
            node={model.root}
            depth={0}
            selectedId={selected.id}
            onSelect={setSelectedId}
          />
        </ul>
      </nav>

      <section
        className="model-properties"
        aria-label="Propiedades del elemento seleccionado"
      >
        <h3>Propiedades</h3>

        <dl className="model-node-info">
          <dt>Elemento</dt>
          <dd>{selected.element}</dd>

          <dt>Tipo</dt>
          <dd>{selected.type}</dd>

          {selected.namespace && (
            <>
              <dt>Namespace</dt>
              <dd>{selected.namespace}</dd>
            </>
          )}
        </dl>

        {selected.attributes.length > 0 ? (
          <table>
            <caption>Atributos del elemento</caption>
            <thead>
              <tr>
                <th scope="col">Atributo</th>
                <th scope="col">Valor</th>
              </tr>
            </thead>
            <tbody>
              {selected.attributes.map(attribute => (
                <tr key={attribute.name}>
                  <td>{attribute.name}</td>
                  <td>
                    {attribute.value === ''
                      ? '""'
                      : attribute.value}
                  </td>
                </tr>
              ))}
            </tbody>
          </table>
        ) : (
          <p className="muted">Sin atributos.</p>
        )}

        {selected.text && (
          <div className="model-node-text">
            <h4>Contenido textual</h4>
            <pre>{selected.text}</pre>
          </div>
        )}
      </section>
    </div>
  );
};

export const ModelTree: React.FC<{ xmi: string }> = ({ xmi }) => {
  const result = React.useMemo(() => {
    try {
      return { model: parseXmi(xmi), error: '' };
    } catch (error) {
      return {
        model: null,
        error: error instanceof Error
          ? error.message
          : 'Error al interpretar el XMI.'
      };
    }
  }, [xmi]);

  if (!result.model) {
    return (
      <div className="diagnostics" role="alert">
        {result.error}
      </div>
    );
  }

  // Un nuevo XMI reinicia selección y expansión.
  return <TreeContent key={xmi} model={result.model} />;
};