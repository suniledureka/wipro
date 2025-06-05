import './App.css';
import Header from './components/Header';
import Product from './components/Product';
import Product1 from './components/Product1';
import Product2 from './components/Product2';

function App() {
  return (
    <div className="App">
      <Header/>
      <Product />
      <Product1 />
      <Product2 />
    </div>
  );
}

export default App;
