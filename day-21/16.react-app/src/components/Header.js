import React, { Component } from 'react'

class Header extends Component {
  render() {
    return (
      <nav className='navbar navbar-dark bg-danger'>
        <a className='navbar-brand' href="#">
            <i className="fa fa-home"></i> &nbsp;
            Product Management
        </a>
      </nav>
    )
  }
}

export default  Header;
