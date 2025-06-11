import { useMemo, useState } from 'react';
import './App.css';

function App() {
  const [num, setNum] = useState(0)
  const [name, setName] = useState('')

  //const factorialResult = factorial(num)
  const factorialResult = useMemo(() => {
      return factorial(num)
  }, [num])

  return (
    <div className="App">
      <h2>Factorial of {num} = {factorialResult}</h2>

      <button onClick={() => setNum(num + 1)}>Increment</button>
      &nbsp; &nbsp;
      <button onClick={() => setNum(num - 1)}>Decrement</button>
      <hr />
      <div>
        <input
          type="text"
          autoFocus="autofocus"
          placeholder='enter name'
          autoComplete='off'
          value={name}
          onChange={(evt) => setName(evt.target.value)}
        />
      </div>
    </div>
  );
}

export default App;


function factorial(n) {
  //console.log('inside factorial')
  let i = 1;
  while(i <= 2000000000){i++}

  if (n < 0)
    return -1;
  else if (n === 0)
    return 1;
  else {
    return n * factorial(n - 1)
  }
}
