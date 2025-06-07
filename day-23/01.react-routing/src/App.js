import { Route, Routes } from 'react-router-dom';
import './App.css';
import Home from './components/Home';
import About from './components/About';
import Contact from './components/Contact';
import NavBar from './components/NavBar';
import NavBar1 from './components/NavBar1';
import NavBar2 from './components/NavBar2';

function App() {
  return (
    <div className="App">
      {/* <NavBar />  */}
      {/* <NavBar1 /> */}
      <NavBar2 />

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="home" element={<Home />} />
        <Route path="about" element={<About />} />
        <Route path="contact" element={<Contact />} />
      </Routes>

    </div>
  );
}

export default App;
