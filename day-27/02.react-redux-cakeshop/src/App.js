import './App.css';
import CakeContainer from './components/CakeContainer';
import { Provider } from 'react-redux';
import store from './redux/store';
import HooksCakeContainer from './components/HooksCakeContainer';
import NewCakeContainer from './components/NewCakeContainer';

function App() {
  return (
   <Provider store = {store}>
    <div className="App">
      <CakeContainer />
      <hr/>
      <HooksCakeContainer />
      <hr/>
      <NewCakeContainer /> 
    </div>
   </Provider> 
  );
}

export default App;
