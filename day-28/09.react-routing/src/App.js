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
import Users from './components/Users';
import UserDetails from './components/UserDetails';
import Admin from './components/Admin';
import Profile from './components/Profile';
import { AuthProvider, useAuth } from './components/auth';
import Login from './components/Login';
import RequireAuth from './components/RequireAuth';

function App() {
  const auth = useAuth();

  return (
    <AuthProvider>

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

        <Route path="users" element={<Users />} >
          <Route path=":userId" element={<UserDetails />} />
          <Route path="admin" element={<Admin />} />
        </Route>

        <Route path="profile" element={<RequireAuth> <Profile /> </RequireAuth> }/>

        <Route path="login" element={<Login />} />

      </Routes>

    </AuthProvider>
  );
}

export default App;
