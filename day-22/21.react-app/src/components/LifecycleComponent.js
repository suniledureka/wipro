import React, { Component } from 'react'

export default class LifecycleComponent extends Component {

  constructor(props) {
    console.log('inside constructor')
    super(props)
  
    this.state = {
       favoriteColor: 'yellow'
    }
  }
    
  render() {
    console.log('inside render')
    return (
      <div>
        <h3>Lifecycle Component</h3>
        <h3>My Favourite Color: {this.state.favoriteColor}</h3>
      </div>
    )
  }

  static getDerivedStateFromProps(){
    console.log(`inside getDerivedStateFromProps`)
    return null
  } 

 /*
  static getDerivedStateFromProps(props, state){
    console.log(`inside getDerivedStateFromProps`)
    return {
        favoriteColor: props.favoriteColor
    }
  } 
  */

  componentDidMount(){
    console.log(`inside componentDidMount`)
    setTimeout(() => {
        this.setState({
            favoriteColor: 'red'
        })
    },6000)
  }
}

