import logo from './assets/logo.png';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" style={{width: '100px', height:'75px'}} />
        <p>
          Wipro Technologies Limited
        </p>
        <a
          className="App-link"
          href="https://www.wipro.com"
          target="_blank"
          rel="noopener noreferrer"
        >
          ...more
        </a>
      </header>
    </div>
  );
}

export default App;
