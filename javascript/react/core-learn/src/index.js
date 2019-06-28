import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import Hello from './Hello';
import StateComRerender from './StateComRerender';
import ExternalComponentUse from './ExternalComponentUse';
import Clocks from './Clocks';
import LoginComponent from './condition_render/LoginComponent';
import * as serviceWorker from './serviceWorker';

ReactDOM.render(<LoginComponent />, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
