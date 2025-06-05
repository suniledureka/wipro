import React, { Component } from 'react'
import PropTypes from 'prop-types'

export default class Employee extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         employee: {
            empno: 10001,
            ename: 'Sanjay Patil',
            salary: 25000.75
         }
      }
    }
    

  render() {
    return (
      <div>
        <p>Employee ID: {this.state.employee.empno}</p>
        <p>Name: {this.state.employee.ename}</p>
        <p>Salary: {this.state.employee.salary}</p>
      </div>
    )
  }
}
