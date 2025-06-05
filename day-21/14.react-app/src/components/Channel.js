import React, { Component } from 'react'

export default class Channel extends Component {

  constructor() {
    super()
    this.state = {
       message: 'Subscribe to my Channel!!!'
    }
  }
  
  changeMessage(){
    this.setState({
        message: 'Thanks for Subscription!'
    })
  }

  render() {    
    return (
      <div>
        <h2> {this.state.message} </h2>
        {/* <button onClick={() => this.changeMessage()}>Subscribe</button> */}
        <button onClick={this.changeMessage.bind(this)}>Subscribe</button>
      </div>
    )
  }
}
