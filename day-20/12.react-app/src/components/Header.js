import React, { Component } from 'react'

class Header extends Component {
  render() {
    return (
      <nav className='navbar navbar-dark bg-dark'>
        <a className='navbar-brand' href="#">
            <i className="fa fa-home"></i> &nbsp;
            React Properties
        </a>
      </nav>
    )
  }
}

export default  Header;
