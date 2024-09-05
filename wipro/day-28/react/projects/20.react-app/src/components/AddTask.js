import React from 'react'
import './AddTask.css'
import { useState } from 'react'

const AddTask = ({tasks, setTasks}) => {
    const [taskName, setTaskName] = useState("")
    const [progress, setProgress] = useState(false)

    const handleChange = (event) => {
        setTaskName(event.target.value)
    }

    const handleReset = () => {
        setTaskName("")        
    }

    const handleSubmit = (e) => {
        e.preventDefault()
        if(taskName.trim().length > 0) {
         const newTask = {
            id: Math.floor(Math.random() * 1000),
            name: taskName,
            //completed: false
            completed: progress
        }
        //setTasks([...tasks, newTask])
        setTasks(tasks.concat(newTask))

        handleReset();
        setProgress(false)
     }else{
        alert('Please enter task name')
     }
    }
  return (
    <section className='addtask'>
        <form onSubmit={handleSubmit}>
            {/*<label htmlFor='task_name'>Task Name:</label>*/}
            
            <input type="text" name="task_name" id="task_name" placeholder='New Task Name' autoComplete='off' maxLength={40} autoFocus="autofocus" onChange={handleChange} value={taskName}/>

            <select onChange={(event) => setProgress(event.target.value)} value={progress}>
                <option value="false">Pending</option>
                <option value="true">Completed</option>
            </select>

            <button type="submit">Add Task</button>
           {/* <span className="reset" onClick={() => setTaskName("")}>Reset</span> */}
           <span className="reset" onClick={handleReset}>Reset</span>
        </form>
        {taskName.length}
    </section>    
  )
}

export default AddTask
