import { ANTLRErrorListener, RecognitionException, Recognizer } from 'antlr4ts';

export interface IDevsLangError {
  startLineNumber: number;
  startColumn: number;
  endLineNumber: number;
  endColumn: number;
  message: string;
  code: string;
}

export default class DevsErrorListener implements ANTLRErrorListener<any> {
  private readonly errors: IDevsLangError[] = [];

  syntaxError(
    recognizer: Recognizer<any, any>,
    offendingSymbol: any,
    line: number,
    charPositionInLine: number,
    message: string,
    e: RecognitionException | undefined
  ): void {
    const startColumn = charPositionInLine + 1;
    this.errors.push({
      startLineNumber: line,
      endLineNumber: line,
      startColumn,
      endColumn: startColumn + 1,
      message,
      code: 'DEVS_SYNTAX'
    });
  }

  getErrors(): IDevsLangError[] {
    return this.errors;
  }
}
