import React, { useState } from 'react'

const EmployeesList = () => {
    let [employees] = useState([
        {
            "empNo": 101,
            "empName": "Praveen Kumar",
            "empDesig": "Manager"
        },
        {
            "empNo": 102,
            "empName": "Abhay",
            "empDesig": "Developer"
        },
        {
            "empNo": 103,
            "empName": "Srinivas Rao",
            "empDesig": "Test Lead"
        }                
    ])

    return (
        <div className='m-4'>
        <table className="table table-bordered table-hover table-striped w-50">
            <thead className="table-dark">
                <tr>
                    <th>EMP ID</th>
                    <th>NAME</th>
                    <th>DESIGNATION</th>
                </tr>
            </thead>

            <tbody>
             {
                employees.map(emp => 
                    <tr key={emp.empNo}>
                       <td>{emp.empNo}</td> 
                       <td>{emp.empName}</td>  
                       <td>{emp.empDesig}</td>  
                    </tr>
                )
             }
            </tbody>
        </table>
    </div>
    )
}

export default EmployeesList;
