import * as monaco from 'monaco-editor-core';
import DevsLanguageService from '../language-service/LanguageService';
import { IDevsLangError } from '../language-service/DevsErrorListener';

export class DevsLangWorker {
  private readonly languageService = new DevsLanguageService();

  constructor(private readonly ctx: monaco.worker.IWorkerContext) {}

  doValidation(): Promise<IDevsLangError[]> {
    return Promise.resolve(this.languageService.validate(this.getTextDocument()));
  }

  private getTextDocument(): string {
    const model = this.ctx.getMirrorModels()[0];
    return model ? model.getValue() : '';
  }
}
