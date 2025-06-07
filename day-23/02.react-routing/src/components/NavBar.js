import { NavLink } from 'react-router-dom'

const NavBar = () => {
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
    //console.log(isActive)
    return ({
        fontWeight: isActive ? 'bold': 'normal',
        textTransform: isActive ? 'uppercase' : 'none',
        color: isActive ? 'yellow' : 'white'
    })    
  } 

  return (
    <nav className="navbar navbar-dark bg-dark mb-5 p-3">
      <NavLink to='/' style={navLinkStyles} className="text-decoration-none"> Home </NavLink>
      <NavLink to='/about' style={navLinkStyles} className="text-decoration-none">About</NavLink>
      <NavLink to='/contact' style={navLinkStyles} className="text-decoration-none">Contact</NavLink>
     <NavLink to='/products' style={navLinkStyles} className="text-decoration-none">Products</NavLink>
    </nav>
  )
}

export default NavBar
