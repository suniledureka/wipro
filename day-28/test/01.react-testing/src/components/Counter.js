import React, { useState } from 'react'

const Counter = ({ title }) => {
  const[count, setCount] =  useState(0)

  const handleClick = () => {
    setCount(count + 1)
  }

  return (
    <div>
      <h1 data-testid="title">{ title }</h1>
      <h2 data-testid="count">{count}</h2>
      <button data-testid="btnClick" onClick = {handleClick}>Increase</button>
    </div>
  )
}

export default Counter
