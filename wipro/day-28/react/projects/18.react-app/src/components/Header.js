import React from 'react'
import Logo from '../assets/logo.png'
const Header = () => {
  return (
    <header>
      <img src={Logo} alt="company logo"/>
      <a href='#'>HOME</a>
    </header>
  )
}

export default Header
