import './App.css';
import {useState} from 'react'
import DataEntry from './components/DataEntry';

function App() {
  let [count, setCount] = useState(0);
  //console.log(useState(0))

  function incrementCount(){
    setCount(count + 1)
    /*
    setCount(count + 1);  //0 +1  
    setCount(count + 1);  //0 +1 
    setCount(count + 1);  //0 +1  
    */

    //setCount((c) => c+1) //0+1
    //setCount(c => c+1) //1+1
   //setCount(c => c+1) //2+1
  }

  let decrementCount = () =>{
    if(count > 0)
      setCount(count - 1)
  }

  let resetCount = () =>{
    setCount(0)
  } 

  return (
    <div className="App">
     <div className="box">
      <p>{count}</p>

      <button onClick = {incrementCount} className="inc">Increment</button>

      <button onClick = {() => decrementCount()} className="dec">Decrement</button>

      <button onClick = {resetCount} className="reset">Reset Count</button>
     </div> 

     <div className="box">
      <DataEntry/>
     </div>
    </div>
  );
}

export default App;
