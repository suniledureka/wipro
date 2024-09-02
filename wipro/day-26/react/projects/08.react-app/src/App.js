import logo from './logo.svg';
import './App.css';
import { Fragment } from 'react';
import Header from './components/Header';
import Employee from './components/Employee';
import MessageCard from './components/MessageCard';

function App() {
  return (
    <Fragment>
      <Header />
      <Employee emp_name="Sunil Joseph" emp_age={40}/>
      <Employee emp_name="Praveen Kumar" emp_age="32"/>

      <MessageCard message="Welcome to Wirpo"/>
      <MessageCard message="Greetings Wirpo"/>
    </Fragment>
  );
}

export default App;
