import { useState, useEffect } from 'react';
import './App.css';

function App() {
  const initialValue = 0;
  const [count, setCount] = useState(initialValue)

  const [count5, setCount5] = useState(initialValue)
  /*
  //case-1 useEffect without dependencies - gets executed whenever component renders
  useEffect(() => {
    console.log(`inside useEffect`)
    document.title = `${count} Messages`
  })
  */

  /*
  //case-2 useEffect with an empty array dependency - gets executed only once when our components renders for the first time
  useEffect(() => {
    console.log(`inside useEffect`)
    document.title = `${count} Messages`
  }, [])
  */

  //case-3 useEffect with dependency - gets executed whenever the variable changes
  useEffect(() => {
    console.log(`inside useEffect`)
    document.title = `${count} Messages`
  }, [count5])  

  return (
    <div className="App">
      <h3>{count} New Messages!!!</h3>

      <button onClick={() => setCount(prevCount => prevCount + 1)}>Increase</button>

      <button onClick={() => setCount5(prevCount => prevCount + 5)}>Increase by 5</button>
    </div>
  );
}

export default App;
