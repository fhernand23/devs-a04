import { IDevsLangError } from './DevsErrorListener';
import { parseAndGetSyntaxErrors } from './parser';

export default class DevsLanguageService {
  validate(code: string): IDevsLangError[] {
    return parseAndGetSyntaxErrors(code);
  }
}
