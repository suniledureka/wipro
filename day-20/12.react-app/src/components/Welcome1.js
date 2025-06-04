import React, { Component } from 'react'

export default class Welcome1 extends Component {
  
  render() {
    //console.log(this.props)
    const {guest_name, location} = this.props; //destructuring
    return (
      <div className="w-25 h-25 d-inline-block bg-success  m-3 text-center p-3">
        <h3>Welcome &nbsp; 
          <span className="text-white">{guest_name} </span> , from 
          <span className="text-white"> {location} </span>
      </h3>
      </div>
    )
  }
}
