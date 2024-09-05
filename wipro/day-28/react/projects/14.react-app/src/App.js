import { Fragment } from 'react';
import './App.css';
import Header from './components/Header';
import EmployeesList from './components/EmployeesList';
import Lessons from './components/Lessons';

function App() {
  return (
    <Fragment>
      <Header />
      <EmployeesList />
      <Lessons />
    </Fragment>
  );
}

export default App;
