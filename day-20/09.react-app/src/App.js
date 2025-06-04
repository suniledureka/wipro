import { Fragment } from 'react/jsx-runtime';
import './App.css';
import MessageCard from './components/MessageCard';

function App() {
  return (
    <Fragment>
      <nav className="navbar">
        <h2>React with Redux Training</h2>
      </nav>

      <MessageCard />
      <MessageCard/>
      <MessageCard/>
    </Fragment>
  );
}

export default App;
