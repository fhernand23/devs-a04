import * as worker from 'monaco-editor-core/esm/vs/editor/editor.worker';
import { DevsLangWorker } from './devsLangWorker';

self.onmessage = () => {
  worker.initialize((ctx) => new DevsLangWorker(ctx));
};
