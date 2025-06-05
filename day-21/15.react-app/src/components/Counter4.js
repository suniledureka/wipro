import { useState } from 'react'

const Counter4 = () => {
  const [count, setCount] = useState(0);  //java script array destructuring

  function handleIncrement() {
    setCount(count + 1)
  }

  function handleDecrement() {
    if (count > 0)
      setCount(count - 1)
  }

  return (
    <div className="box">
      <p>Count: {count}</p>
      <button className="btn_add" onClick={handleIncrement}>Increment</button>
      <button className="btn_sub" onClick={handleDecrement}>Decrement</button>
      <button className="btn_reset" onClick={() => setCount(0)}>Reset</button>
    </div>
  )
}

export default Counter4
