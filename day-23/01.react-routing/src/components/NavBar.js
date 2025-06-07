import { Link } from 'react-router-dom'
import './NavBar.css'
const NavBar = () => {
  return (
    <nav>
      <Link to='/'> Home </Link>
      <Link to='/about'>About</Link>
      <Link to='/contact'>Contact</Link>
      <a href="https://www.google.com" target="_blank">Google</a>
    </nav>
  )
}

export default NavBar
