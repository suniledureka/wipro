import React, { useState } from 'react'
import TaskCard from './TaskCard';
import AddTask from './AddTask';

const TaskList = () => {
  let [tasks, setTasks] = useState([]);
  let [show, setShow] = useState(true);

  let handleDelete = (id) => {
    setTasks(
      tasks.filter(task => task.id != id)
    )
  }

  let handleAdd = (newTask) => {
    setTasks([...tasks, newTask]);
  }

  return (
    <div className="App">
      <AddTask handleAdd = {handleAdd}/>

      <div>
       {/* <h1>Tasks List</h1> */}
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
