import React, { Component } from 'react'
import { Fragment } from 'react'

export default class Employee extends Component {
    constructor(props){
        super(props)
    }

  render() {
    return (
      <Fragment>
        <div className="card">
            <h2>Employee</h2>
            <div className="card-body">
                <p>Name: 
                    <span style={{color: 'yellow', fontWeight: 'bolder'}}>
                        {this.props.emp_name} 
                    </span></p>
                <p>Age: {this.props.emp_age}</p>
            </div>
        </div>
      </Fragment>
    )
  }
}
