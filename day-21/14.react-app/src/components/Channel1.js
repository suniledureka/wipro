import React, { Component } from 'react'

export default class Channel1 extends Component {

  constructor() {
    super()
    this.state = {
      message: 'Subscribe to my Channel!!!',
      btnLabel: 'Subscribe'
    }
  }

  changeMessage() {
    if (this.state.btnLabel == 'Subscribe') {
      this.setState({
        message: 'Thanks for Subscription!',
        btnLabel: 'Unsubscribe'
      })
    } else {
      this.setState({
        message: 'Subscribe to my Channel!!!',
        btnLabel: 'Subscribe'
      })
    }  
}

render() {
  return (
    <div>
      <h2> {this.state.message} </h2>
      <button onClick={() => this.changeMessage()}>{this.state.btnLabel}</button>
      {/* <button onClick={this.changeMessage.bind(this)}>Subscribe</button> */}
    </div>
  )
}
}
