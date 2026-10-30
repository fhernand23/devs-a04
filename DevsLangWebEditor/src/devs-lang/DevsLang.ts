import * as monaco from 'monaco-editor-core';

export const richLanguageConfiguration: monaco.languages.LanguageConfiguration = {
  comments: { lineComment: '//' },
  brackets: [['{', '}'], ['[', ']'], ['(', ')']],
  autoClosingPairs: [
    { open: '{', close: '}' },
    { open: '[', close: ']' },
    { open: '(', close: ')' },
    { open: '"', close: '"' }
  ]
};

export const monarchLanguage = <monaco.languages.IMonarchLanguage><any>{
  defaultToken: '',
  keywords: [
    '\\where', '\\delExt', '\\delInt', '\\lambda', '\\ta', '\\select',
    '\\if', '\\then', '\\otherwise', '\\inOtherCase',
    '\\true', '\\false', '\\infinity', '\\emptySet', '\\emptyTuple',
    '\\Z', '\\N', '\\R', '\\B'
  ],
  operators: [
    '\\assign', '\\in', '\\notIn', '\\product', '\\union', '\\intersection',
    '\\setDifference', '\\not', '\\and', '\\or', '\\equalTo', '\\notEqualTo',
    '\\greaterThan', '\\lessThan', '\\greaterThanOrEqualTo', '\\lessThanOrEqualTo',
    '\\sqrt', '\\addition', '\\substraction', '\\multiplication', '\\division', '\\power'
  ],
  tokenizer: {
    root: [
      [/\/\/.*$/, 'comment'],
      [/#[_a-z][\w]*/, 'parameter'],
      [/\\[A-Za-z]+/, {
        cases: {
          '@keywords': 'keyword',
          '@operators': 'operator',
          '@default': 'invalid'
        }
      }],
      [/"[A-Za-z][A-Za-z_0-9]*"/, 'string'],
      [/\d+\.\d+/, 'number.float'],
      [/\d+/, 'number'],
      [/[A-Z][A-Z_0-9]*/, 'type.identifier'],
      [/[A-Za-z][A-Za-z_0-9]*/, 'identifier'],
      [/[{}()\[\],;:=|']/, 'delimiter']
    ]
  }
};

monaco.editor.defineTheme('devsTheme', {
  base: 'vs',
  inherit: true,
  rules: [
    { token: 'keyword', foreground: '6F42C1', fontStyle: 'bold' },
    { token: 'operator', foreground: '005CC5' },
    { token: 'parameter', foreground: 'B31D28' },
    { token: 'type.identifier', foreground: '116329', fontStyle: 'bold' },
    { token: 'string', foreground: 'A31515' },
    { token: 'number', foreground: '098658' },
    { token: 'number.float', foreground: '098658' },
    { token: 'comment', foreground: '6A737D', fontStyle: 'italic' }
  ],
  colors: {
    'editor.background': '#FFFFFF',
    'editorLineNumber.foreground': '#9AA0A6',
    'editor.lineHighlightBackground': '#F6F8FA'
  }
});
