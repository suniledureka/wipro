import './App.css';
import EnvironmentSetup from './components/EnvironmentSetup';
import TopicsCard from './components/TopicsCard';

function App() {
  return (
    <div>     
        <h2 className="navbar">React.js Certification Training @ Wipro Academy</h2>
        <TopicsCard />
        <EnvironmentSetup />
    </div>
  );
}

export default App;
