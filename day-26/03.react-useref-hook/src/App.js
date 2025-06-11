import { useRef } from 'react';
import './App.css';

function App() {
  //const [name, setName] = useState("")
  const inputElementRef = useRef('')

  return (
    <div className="App">
      <label>Enter Name: </label>
      <input 
        type="text"
        autoFocus = "autofocus"
        placeholder='enter name'
        autoComplete='off'
        //value = {name}
        onChange={(evt) => console.log(inputElementRef.current.value)}
        ref={inputElementRef}
      />
    
      <p>
        Name entered = {inputElementRef.current.value}
      </p>
    </div>
  );
}

export default App;
