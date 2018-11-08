import React, { Fragment } from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import registerServiceWorker from './registerServiceWorker';


import { connect, Provider } from 'react-redux';
import { createStore, combineReducers } from 'redux';
import find from 'lodash/find';

const mySwitch = (state = false, action) => {
  switch (action.type) {
    case 'TURNED_ON': return true;
    case 'TURNED_OFF': return false;
    case 'TOGGLED': return !state;
    default: return state;
  }
}

const rootReducer = combineReducers({
  mySwitch,
});

const store = createStore(
  rootReducer,
  window.__REDUX_DEVTOOLS_EXTENSION__ && window.__REDUX_DEVTOOLS_EXTENSION__()
);


const Title = ({ title = '' }) => (
  <h1>{ title }</h1>
);

const DummyLight = ({ isTurnedOn = false }) => (
  <div className={
    `
      light
      ${ isTurnedOn ? 'on' : 'off' }
    `
  }/>
);

const Light = connect(
  state => ({
    isTurnedOn: state.mySwitch,
  }),
  undefined,
)(DummyLight);

const LightSwitchDummy = ({ onClick, title = '' }) => (
  <button onClick={onClick}>
    { title }
  </button>
);

const LightSwitch = connect(
  undefined,
  dispatch => ({
    onClick() {
      dispatch({ type: 'TOGGLED' });
    },
  })
)(LightSwitchDummy);

const LightApp = () => (
  <Fragment>
    <Title title="Luz!" />
    <Light />
    <LightSwitch title="Encender / Apagar" />
  </Fragment>
);

ReactDOM.render(
  <Provider store={store}>
    <LightApp />
  </Provider>,
  document.getElementById('root'),
);
registerServiceWorker();
