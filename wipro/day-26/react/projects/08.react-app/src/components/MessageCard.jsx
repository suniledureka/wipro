import React from 'react'

const MessageCard = (props) => {
  return (
    <div className='card'>
      <h2>Message Card</h2>
      <div>
        {props.message}
      </div>
    </div>
  )
}

export default MessageCard
