import './App.css';
import EventHandlerClassComponent from './components/EventHandlerClassComponent';
import EventHandlerFunctionComponent from './components/EventHandlerFunctionComponent';

function App() {
  return (
    <div>
      <EventHandlerFunctionComponent />
      <EventHandlerClassComponent />
    </div>
  );
}

export default App;
