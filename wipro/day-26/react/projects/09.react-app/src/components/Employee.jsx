import React, { Component } from 'react'
import { Fragment } from 'react'

export default class Employee extends Component {
    constructor(props){
        super(props)
    }

  render() {
    return (
      <Fragment>
        <div className="card m-5 text-center bg-warning" style={{width: '300px'}}>
            <h2>Employee</h2>
            <div className="card-body">
                <p className="card-text">Name:  
                    <span style={{color: 'white', fontWeight: 'bolder'}}>
                        {this.props.emp_name} 
                    </span></p>
                <p className="card-text">Age: {this.props.emp_age}</p>
            </div>
        </div>
      </Fragment>
    )
  }
}
