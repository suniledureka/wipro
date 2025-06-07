import { NavLink } from 'react-router-dom'
import './NavBar.css'

const NavBar2 = () => {
  /*  
  const navLinkStyles = (link) => {
    console.log(link)
    return ({
        fontWeight: link.isActive ? 'bold': 'normal',
        textTransform: link.isActive ? 'uppercase' : 'none',
        color: link.isActive ? 'blue' : 'white'
    })
    */

  const navLinkStyles = ({isActive}) => {
    console.log(isActive)
    return ({
        fontWeight: isActive ? 'bold': 'normal',
        textTransform: isActive ? 'uppercase' : 'none',
        color: isActive ? 'yellow' : 'white'
    })    
  } 

  return (
    <nav>
      <NavLink to='/' style={navLinkStyles}> Home </NavLink>
      <NavLink to='/about' style={navLinkStyles}>About</NavLink>
      <NavLink to='/contact' style={navLinkStyles}>Contact</NavLink>
      <a href="https://www.google.com" target="_blank">Google</a>
    </nav>
  )
}

export default NavBar2
