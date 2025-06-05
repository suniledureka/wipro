import './App.css';
import Channel from './components/Channel';
import Channel1 from './components/Channel1';
import Employee from './components/Employee';

function App() {
  
  return (
    <div className="App">
      <Channel />
      <hr/>
      <Channel1/>
      <hr/>
      <Employee />
    </div>
  );
}

export default App;
