import * as monaco from 'monaco-editor-core';
import { DevsLangWorker } from './devsLangWorker';
import { languageID } from './config';

export class WorkerManager {
  private worker?: monaco.editor.MonacoWebWorker<DevsLangWorker>;
  private workerClientProxy?: Promise<DevsLangWorker>;

  private getClientProxy(): Promise<DevsLangWorker> {
    if (!this.workerClientProxy) {
      this.worker = monaco.editor.createWebWorker<DevsLangWorker>({
        moduleId: 'DevsLangWorker',
        label: languageID,
        createData: { languageId: languageID }
      });
      this.workerClientProxy = this.worker.getProxy();
    }
    return this.workerClientProxy;
  }

  async getLanguageServiceWorker(...resources: monaco.Uri[]): Promise<DevsLangWorker> {
    const client = await this.getClientProxy();
    await this.worker!.withSyncedResources(resources);
    return client;
  }
}
