import React from 'react'
import './AddTask.css'
import { useState, useRef } from 'react'
//import { useRef } from 'react'

const AddTask = ({handleAdd}) => {
    //const [taskName, setTaskName] = useState("")
    let [progress, setProgress] = useState(false)

    const taskValueRef = useRef("")

    const handleChange = (event) => {
        console.log(taskValueRef.current.value)
    }

    const handleReset = () => {
         taskValueRef.current.value = ""
         setProgress(false)
    }

    const handleSubmit = (e) => {
        e.preventDefault()
        const newTask = {
            id: Math.floor(Math.random() * 1000),
            name: taskValueRef.current.value,
            //completed: false
            completed: progress
        }
        
        handleAdd(newTask);

        handleReset();
        setProgress(false)
    }
  return (
    <section className='addtask'>
        <form onSubmit={handleSubmit}>
            {/*<label htmlFor='task_name'>Task Name:</label>*/}
            
            <input type="text" name="task_name" id="task_name" placeholder='New Task Name' autoComplete='off' maxLength={40} autoFocus="autofocus" onChange={handleChange} ref={taskValueRef} />

            <select onChange={(event) => setProgress(event.target.value)} value={progress}>
                <option value="false">Pending</option>
                <option value="true">Completed</option>
            </select>

            <button type="submit">Add Task</button>
            <span className="reset" onClick={handleReset}>Reset</span>
        </form>

        {taskValueRef.current.value} - {progress}
    </section>    
  )
}

export default AddTask