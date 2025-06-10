import React, { useEffect, useState } from 'react'
import { allEmployees, deleteEmployeeById } from '../services/EmployeeService';
import { useNavigate } from 'react-router-dom'

const EmployeesList = () => {
  let [employees, setEmployees] = useState([])

  const navigator = useNavigate();

  useEffect(() => {
    allEmployees().then((response) => {
      setEmployees(response.data)
    })
      .catch(err => console.log(err));
  })

  const addNewEmployee = () => {
    navigator('/add-employee')
  }

  const updateEmployee = (eid) => {
    navigator(`/edit-employee/${eid}`)
  }

  function removeEmployee(eid) {
    let deleteStatus = window.confirm(`do you want to delete this employee (${eid}) ?`);
   if(deleteStatus)
   { 
    deleteEmployeeById(eid)
      .then((response) => {
        allEmployees().then((response) => {
          setEmployees(response.data)
        })
          .catch(err => console.log(err));
      })
      .catch(err => console.error(err))
    }
  }


  return (
    <div className="container table-responsive">
      <h2 className="text-warning fw-bolder mb-4 text-center">Employees List</h2>

      <button className='btn btn-primary mb-3' onClick={addNewEmployee}>+++ New  Employee</button>

      <table className="table table-bordered table-hover table-secondary table-stripped" style={{ width: '850px' }}>
        <thead className="table-dark">
          <tr>
            <th>EMP ID</th>
            <th>EMP NAME</th>
            <th>DEPARTMENT</th>
            <th>SALARY</th>
            <th>ACTIONS</th>
          </tr>
        </thead>

        <tbody>
          {
            employees.map(emp =>
              <tr key={emp.employeeId}>
                <td>{emp.employeeId}</td>
                <td>{emp.employeeName}</td>
                <td>{emp.employeeDept}</td>
                <td>{emp.employeeSal}</td>
                <td><button className="btn btn-info me-2" onClick={() => updateEmployee(emp.employeeId)}>Update</button>

                  <button className="btn btn-danger" onClick={() => removeEmployee(emp.employeeId)}>Delete</button></td>
              </tr>
            )
          }
        </tbody>
      </table>
    </div>
  )
}

export default EmployeesList
