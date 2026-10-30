import { ANTLRInputStream, CommonTokenStream } from 'antlr4ts';
import { CFG_DEVS_MODELLexer } from '../ANTLR/CFG_DEVS_MODELLexer';
import { CFG_DEVS_MODELParser, DevsSpecificationContext } from '../ANTLR/CFG_DEVS_MODELParser';
import DevsErrorListener, { IDevsLangError } from './DevsErrorListener';

function parse(code: string): { ast: DevsSpecificationContext; errors: IDevsLangError[] } {
  const input = new ANTLRInputStream(code);
  const lexer = new CFG_DEVS_MODELLexer(input);
  lexer.removeErrorListeners();
  const listener = new DevsErrorListener();
  lexer.addErrorListener(listener);

  const tokens = new CommonTokenStream(lexer);
  const parser = new CFG_DEVS_MODELParser(tokens);
  parser.removeErrorListeners();
  parser.addErrorListener(listener);

  const ast = parser.devsSpecification();
  return { ast, errors: listener.getErrors() };
}

export function parseAndGetSyntaxErrors(code: string): IDevsLangError[] {
  return parse(code).errors;
}

export function parseAndGetASTRoot(code: string): DevsSpecificationContext {
  return parse(code).ast;
}
