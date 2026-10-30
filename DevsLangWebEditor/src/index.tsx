import * as React from 'react';
import * as ReactDOM from 'react-dom';
import { setupLanguage } from './devs-lang/setup';
import { Editor } from './components/Editor/Editor';
import { languageID } from './devs-lang/config';
import './styles.css';

setupLanguage();

ReactDOM.render(<Editor language={languageID} />, document.getElementById('root'));
