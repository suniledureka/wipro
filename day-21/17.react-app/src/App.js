import './App.css';
import NamesList from './components/NamesList';
import ProductsList from './components/ProductsList';
import ProductsList1 from './components/ProductsList1';

function App() {
  return (
    <div className="App">
        <NamesList />
        <hr />
        <ProductsList />
        <hr/>
        <ProductsList1 />
    </div>
  );
}

export default App;
