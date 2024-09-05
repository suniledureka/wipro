import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.css'
import {useEffect, useState} from 'react'

function App() {
  const[count, setCount] = useState(0)

  /*
  useEffect(() => {
    console.log('inside useEffect')
  }, [])
  */

  useEffect(() => {
    console.log('inside useEffect')
  }, [count])

  const handleClick = () => setCount(count + 1)

  return (
    <div className="App">
      <h2>useEffect() Hook</h2>
      
      <p className='fw-bolder text-danger'>{count}</p>
      <button className='btn btn-primary btn-lg' onClick={handleClick}> Increment</button>
    </div>
  );
}

export default App;
