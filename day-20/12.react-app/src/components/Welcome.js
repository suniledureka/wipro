import React, { Component } from 'react'

export default class Welcome extends Component {
  
  render() {
    console.log(this.props)
    return (
      <div className="w-25 h-25 d-inline-block bg-info m-3 text-center p-3">
        <h3>Welcome {this.props.guest_name} , from {this.props.location}</h3>
      </div>
    )
  }
}
