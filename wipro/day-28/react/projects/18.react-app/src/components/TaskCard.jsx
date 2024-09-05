import React from 'react'

//const TaskCard = (props) => {
const TaskCard = ({task, handleDelete}) => {    
  return (
      <li className={task.completed ? "completed" : "incomplete"}>
        {/*<span>{props.task.id} - {props.task.name}</span> */}
        <span>
            {task.id} &nbsp; &nbsp; &nbsp; {task.name}
        </span>

        <button className="delete" onClick={() => handleDelete(task.id)}>Delete</button>
      </li>
  )
}

export default TaskCard

