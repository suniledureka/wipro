import React, { useState } from 'react'
import TaskCard from './TaskCard';

const TaskList = () => {
  let [tasks, setTasks] = useState([
    { id: 1001, name: "Introduction to ReactJS", completed: true },
    { id: 1002, name: "Environment Setup", completed: false },
    { id: 1003, name: "Creating React Application", completed: false }
  ]);

  let [show, setShow] = useState(true);

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
          <button className='trigger' onClick={() => setShow(!show)}> {show ? 'Hide Tasks' : 'Show Tasks'}</button>

          {
            show && tasks.map(task =>
              <TaskCard key={task.id} task={task} handleDelete={handleDelete} />
            )
          }
        </ul>
      </div>
    </div>
  );
}

export default TaskList
