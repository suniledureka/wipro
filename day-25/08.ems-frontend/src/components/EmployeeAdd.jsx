import React, { useEffect, useState } from 'react'
import { addNewEmployee, getEmployeeById, updateEmployee } from '../services/EmployeeService'
import {useNavigate, useParams} from 'react-router-dom'

const EmployeeAdd = () => {
  const [employeeName, setEmployeeName] = useState("")
  const [employeeDept, setEmployeeDept] = useState("")
  const [employeeSal, setEmployeeSal] = useState("")
 
  const {id} = useParams()

  const navigator = useNavigate();

  //to hold the validation errors
  const [errors, setErrors] = useState({
                                employeeName: '',
                                employeeSal: '',
                                employeeDept: ''
                            })


  const handleEmployeeName = (e) => {
    setEmployeeName(e.target.value)
  }

  const handleDepartment = (e) => {
    setEmployeeDept(e.target.value)
  }

  const handleSalary = (e) => {
    setEmployeeSal(e.target.value)
  }
  //const saveEmployee
  const saveOrUpdateEmployee = (e) => {
        e.preventDefault()

        if(validateForm()){
            const emp = {employeeName, employeeDept, employeeSal}

            if(id){
                updateEmployee(id, emp)
                    .then(response => {
                       // console.log(response.data);
                    navigator("/employees")
                    })
                    .catch(err => console.error(err))
            }else{
                addNewEmployee(emp).then(response => console.log(response.data + '-' +response.status))
            navigator("/employees")
            }
        }//if
        console.log(errors)        
  }

  const validateForm = () => {
    let formValid = true;

    const errorsCopy = {...errors}
    
    if(employeeName.trim().length > 0){
        errorsCopy.employeeName = '';
    }
    else{
        errorsCopy.employeeName = 'Name is Required'
        formValid = false;
    }

    if(employeeDept.trim().length > 0)
        errorsCopy.employeeDept = '';
    else{
        errorsCopy.employeeDept = 'Deptartment is Required!!'
        formValid = false;
    }

    if(employeeSal.toString().trim().length > 0)
        errorsCopy.employeeSal = '';
    else{
        errorsCopy.employeeSal = 'Salary is Required!!' 
        formValid = false;
    }
    
    setErrors(errorsCopy) 

    return formValid      
  }

  function pageTitle(){
    if(id){
        return <h3 className="text-center m-2">Employee Updation</h3>
    }else{
        return <h3 className="text-center m-2">Employee Registration</h3>
    }
  }

  useEffect(() => {
    if(id){
        getEmployeeById(id)
            .then(response => {
                setEmployeeName(response.data.employeeName)
                setEmployeeDept(response.data.employeeDept)
                setEmployeeSal(response.data.employeeSal)
            })
            .catch(err => console.log(err))
    }
  }, [id])

  return (
    <div className='container mt-4'>
      <div className="row">
        <div className="card col-md-6 offset-md-3 offset-mid-3">
            {/* <h3 className="text-center m-2">Employee Registration</h3> */}
            {
                pageTitle()
            }
            <div className="card-body">
                <form>
                    <div className="form-group mb-2">
                        <label className="form-label">NAME</label>
                        <input 
                            type="text" 
                            placeholder='enter employee name'
                            name="emp_name" 
                            value={employeeName} 
                            className={`form-control ${errors.employeeName ? 'is-invalid' : ''}`}
                            onChange={handleEmployeeName}
                            ></input>
                            {errors.employeeName && <div className="invalid-feedback">{errors.employeeName}</div>}
                    </div>

                    <div className="form-group mb-2">
                        <label className="form-label"htmlFor="">DEPARTMENT</label>
                        <input 
                            type="text" 
                            placeholder='enter employee department'
                            name="emp_dept_name" 
                            value={employeeDept} 
                            className={`form-control ${errors.employeeDept ? 'is-invalid' : ''}`}
                            onChange={handleDepartment}
                            />
                           {errors.employeeDept && <div className="invalid-feedback">{errors.employeeDept}</div>}
                    </div>  
                    
                    <div className="form-group mb-2">
                        <label className="form-label"htmlFor="">SALARY</label>
                        <input 
                            type="text" 
                            placeholder='enter employee salary'
                            name="emp_sal" 
                            value={employeeSal} 
                            className={`form-control ${errors.employeeSal ? 'is-invalid' : ''}`}
                            onChange={e => setEmployeeSal(e.target.value)}
                            />
                            {errors.employeeSal && <div className="invalid-feedback">{errors.employeeSal}</div>}
                    </div>                         
                    <button className="btn btn-success" onClick={saveOrUpdateEmployee}>{id ? 'Update Employee': 'Save Employee'}</button>              
                </form>
            </div>
        </div>
      </div>
    </div>
  )
}

export default EmployeeAdd
