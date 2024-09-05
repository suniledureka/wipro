import React from 'react'
import { Fragment } from 'react'
import logo from '../assets/logo.png'

const Header = () => {
  return (
    <Fragment>
      <nav class="navbar navbar-dark bg-primary ">
        <a class="navbar-brand" href="#">
          <img src={logo} width="30" height="30" class="d-inline-block align-top" alt=""/> &nbsp; &nbsp;
            Employees @ Wipro
        </a>
      </nav>
    </Fragment>
  )
}

export default Header
