import React, { useState } from 'react'
import TaskCard from './TaskCard';
import BoxCard from './BoxCard';

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
        
        {/*   
            <div className="box success">
              <p className="title">Offerings</p>
              <p className="description">Lorem ipsum dolor sit amet consectetur adipisicing elit. Reprehenderit quod ab, excepturi fuga delectus minus nostrum quos, ad numquam facilis, repellat modi nesciunt itaque deserunt exercitationem inventore error sapiente tempora?</p>
            </div>

            <div className="box alert">
              <p className="title">Cookies</p>
              <p className="description">Lorem ipsum dolor sit amet consectetur adipisicing elit. Reprehenderit quod ab, excepturi fuga delectus minus nostrum quos, ad numquam facilis, repellat modi nesciunt itaque deserunt exercitationem inventore error sapiente tempora?</p>
            </div> 

            <div className="box warning">
              <p className="title">New Launches</p>
              <p className="description">Lorem ipsum dolor sit amet consectetur adipisicing elit. Reprehenderit quod ab, excepturi fuga delectus minus nostrum quos, ad numquam facilis, repellat modi nesciunt itaque deserunt exercitationem inventore error sapiente tempora?</p>
            </div> 
            */}
        <BoxCard result="success">
          <p className="title">Offerings</p>
          <p className="description">Lorem ipsum dolor sit amet consectetur adipisicing elit. Reprehenderit quod ab, excepturi fuga delectus minus nostrum quos, ad numquam facilis, repellat modi nesciunt itaque deserunt exercitationem inventore error sapiente tempora?</p>
        </BoxCard>

        <BoxCard result="alert">
          <p className="title">Cookies</p>
          <p className="description">Lorem ipsum dolor sit amet consectetur adipisicing elit. Reprehenderit quod ab, excepturi fuga delectus minus nostrum quos, ad numquam facilis, repellat modi nesciunt itaque deserunt exercitationem inventore error sapiente tempora?</p>
        </BoxCard>

        <BoxCard result="warning">
          <p className="title">New Launches</p>
          <p className="description">Lorem ipsum dolor sit amet consectetur adipisicing elit. Reprehenderit quod ab, excepturi fuga delectus minus nostrum quos, ad numquam facilis, repellat modi nesciunt itaque deserunt exercitationem inventore error sapiente tempora?</p>
        </BoxCard>

      </div>
    </div>
  );
}

export default TaskList
