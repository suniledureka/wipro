import React from 'react'

const EventHandlerFunctionComponent = () => {
  /*
  function clickHandler(){
    console.log('functional component button clicked')
  }  
  */

  /*
  const clickHandler = function(){
    console.log('functional component button clicked')
  }
  */

 const clickHandler = () => {
    console.log('functional component button clicked')
 }

  return (
    <div>
      <h2>Event Handling in Functional Component</h2>  
      <button onClick={clickHandler}>Click Me</button>
      <button onClick={() => clickHandler()}>Click Me</button>
      <hr/>
    </div>
  )
}

export default EventHandlerFunctionComponent
