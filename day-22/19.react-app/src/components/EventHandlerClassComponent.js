import React, { Component } from 'react'

export default class EventHandlerClassComponent extends Component {
  constructor(props) {
    super(props)
  
    this.state = {
       message: 'Good Morning'
    }

   this.changeMessageHandler = this.changeMessageHandler.bind(this);
  }
    
  clickHandler(){
    console.log('class component button clicked')
  } 

  changeMessageHandler(){
   // console.log(this);    
    this.setState({
        message: 'Good Evening'
    })
  }

  changeMessageHandler1 = () => {
    console.log(this);    
    this.setState({
        message: 'Good Afternoon'
    })
  }

  render() {
    return (
    <div>
      <h2>Event Handling in Class Component</h2> 

      <p>{this.state.message}</p> 

      <button onClick={this.clickHandler}>Click Me</button>
      <button onClick={() => this.clickHandler()}>Click Me</button>

      <button onClick={this.changeMessageHandler.bind(this)}>Change Greetings</button>

      <button onClick={this.changeMessageHandler}>Change Greetings</button>
      
      <button onClick={this.changeMessageHandler1}>Change Greetings</button>
      <hr/>
    </div>
    )
  }
}
