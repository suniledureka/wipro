import { useState } from 'react'

const Counter5 = () => {
  const initialState = 0;

  const [count, setCount] = useState(initialState);  //java script array destructuring

  function handleIncrement() {
    setCount(count + 1)
  }

  function handleDecrement() {
    if (count > 0)
      setCount(count - 1)
  }

  const handleIncrement5 = () => {
    for(let i=1; i<=5; i++){
      console.log(i, count)
      //setCount(count + 1)  //---- this still increment by 1 only
      setCount(prevCount => prevCount + 1) //--- setCount(function)
    }
  }

  return (
    <div className="box">
      <p>Count: {count}</p>
      <button className="btn_add" onClick={handleIncrement}>Increment</button>
      <button className="btn_sub" onClick={handleDecrement}>Decrement</button>
      <button className="btn_reset" onClick={() => setCount(initialState)}>Reset</button>
      <button className="btn_reset" onClick={() => handleIncrement5()}>Increment By 5</button>
    </div>
  )
}

export default Counter5
