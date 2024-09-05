import {useState} from 'react'
import './App.css';

function App() {
  let [tasks, setTasks] = useState([
    { id: 1001, name: "Introduction to ReactJS", completed: true },
    { id: 1002, name: "Environment Setup", completed: false },
    { id: 1003, name: "Creating React Application", completed: false }
  ]);

  let handleDelete = (id) => {
    setTasks(
      tasks.filter(task => task.id != id)
    )
  }

  return (
    <div className="App">
      <div>
        <h1>Tasks List</h1>
        <ul>
          {
            tasks.map((task) =>
              <li key={task.id} className={task.completed ? "completed" : "incomplete"}>
                <span>{task.id} &nbsp; &nbsp; &nbsp; {task.name} </span>
                <button className='delete' onClick={() => handleDelete(task.id)}>Delete</button>
              </li>
            )
          }
        </ul>
      </div>
    </div>
  );
}

export default App;
