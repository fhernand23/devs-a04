import * as monaco from 'monaco-editor-core';
import { languageExtensionPoint, languageID } from './config';
import { richLanguageConfiguration, monarchLanguage } from './DevsLang';
import { DevsLangWorker } from './devsLangWorker';
import { WorkerManager } from './WorkerManager';
import DiagnosticsAdapter from './DiagnosticsAdapter';

export type WorkerAccessor = (...uris: monaco.Uri[]) => Promise<DevsLangWorker>;

export function setupLanguage(): void {
  (window as any).MonacoEnvironment = {
    getWorkerUrl: (_moduleId: string, label: string) =>
      label === languageID ? './devsLangWorker.js' : './editor.worker.js'
  };

  monaco.languages.register(languageExtensionPoint);
  monaco.languages.onLanguage(languageID, () => {
    monaco.languages.setMonarchTokensProvider(languageID, monarchLanguage);
    monaco.languages.setLanguageConfiguration(languageID, richLanguageConfiguration);
    monaco.editor.setTheme('devsTheme');

    const manager = new WorkerManager();
    const worker: WorkerAccessor = (...uris) => manager.getLanguageServiceWorker(...uris);
    new DiagnosticsAdapter(worker);
  });
}
