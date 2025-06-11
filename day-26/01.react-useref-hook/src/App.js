import { useState, useRef } from 'react';
import './App.css';

function App() {
  const [name, setName] = useState("")

  const inputElementRef = useRef('')
  //console.log(inputElement)
  //console.log(inputElement.current)
  //console.log(inputElement.current.value)

  const resetInputField = () => {
    setName('')
    //document.querySelector('input').focus()
    inputElementRef.current.focus();
    inputElementRef.current.style.backgroundColor = 'yellow'
  }

  return (
    <div className="App">
      <label>Enter Name: </label>
      <input 
        type="text"
        autoFocus = "autofocus"
        placeholder='enter name'
        autoComplete='off'
        value = {name}
        onChange={(evt) => setName(evt.target.value)}
        ref={inputElementRef}
      />
    &nbsp; &nbsp; 
      <button onClick={resetInputField}>Reset</button>
      <p>
        Name entered = {name}
      </p>
    </div>
  );
}

export default App;
