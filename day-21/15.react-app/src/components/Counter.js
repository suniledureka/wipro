import React from 'react'

const Counter = () => {
  let count = 0  

  function handleIncrement(){
    count = count + 1
    console.log(count)
  }

  return (
    <div className="box">
      <p>Count: {count}</p>
      <button className="btn_add" onClick={handleIncrement}>Increment</button>
    </div>
  )
}

export default Counter
