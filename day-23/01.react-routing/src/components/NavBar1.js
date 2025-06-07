import { NavLink } from 'react-router-dom'
import './NavBar.css'

const NavBar1 = () => {
  return (
    <nav>
      <NavLink to='/'> Home </NavLink>
      <NavLink to='/about'>About</NavLink>
      <NavLink to='/contact'>Contact</NavLink>
      <a href="https://www.google.com" target="_blank">Google</a>
    </nav>
  )
}

export default NavBar1
