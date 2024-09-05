import './App.css';
import React, {useState} from 'react'

import Header from './components/Header';
import TaskList from './components/TaskList';
import Footer from './components/Footer';
import AddTask from './components/AddTask';

function App() {
  let [tasks, setTasks] = useState([
    { id: 1001, name: "Introduction to ReactJS", completed: true },
    { id: 1002, name: "Environment Setup", completed: false },
    { id: 1003, name: "Creating React Application", completed: false }
  ]);

  return(
    <div className="App">
      <Header/>
      <AddTask  tasks={tasks} setTasks={setTasks}/>
      <TaskList tasks={tasks} setTasks={setTasks}/>
      <Footer/>
    </div>
  )
}

export default App;