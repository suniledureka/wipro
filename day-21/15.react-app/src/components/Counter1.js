import { useState } from 'react'

const Counter1 = () => {
  /*
  const array = useState(0);
  //console.log(array);

  let count = array[0];
  //console.log(count)

  let setCount = array[1];
  //console.log(setCount)
  */
  const [count, setCount] = useState(0);  //java script array destructuring

  function handleIncrement(){
    setCount(count + 1)
  }

  return (
    <div className="box">
      <p>Count: {count}</p>
      <button className="btn_add" onClick={handleIncrement}>Increment</button>
    </div>
  )
}

export default Counter1
