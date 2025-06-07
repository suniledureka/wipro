import { Route, Routes } from 'react-router-dom';
import './App.css';
import Home from './components/Home';
import About from './components/About';
import Contact from './components/Contact';
import NavBar from './components/NavBar';
import OrderSummary from './components/OrderSummary';
import PageNotFound from './components/PageNotFound';
import Products from './components/Products';
import FeaturedProducts from './components/products/FeaturedProducts';
import NewProducts from './components/products/NewProducts';

function App() {
  return (
    <div className="App">

      <NavBar />

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="home" element={<Home />} />
        <Route path="about" element={<About />} />
        <Route path="contact" element={<Contact />} />
        <Route path="order-summary" element={<OrderSummary />} />
        <Route path="*" element={<PageNotFound />} />

        <Route path="products" element={<Products />} >
          <Route index element={<FeaturedProducts />} />
          <Route path="featured" element={<FeaturedProducts />} />
          <Route path="new" element={<NewProducts />} />
       </Route>
      </Routes>

    </div>
  );
}

export default App;
