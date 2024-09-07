import axios from 'axios';

let BASE_URL = 'http://localhost:8080/ems';

export const allEmployees = () => {
    return axios.get(BASE_URL+"/all");    
}

export const addNewEmployee = (employee) => axios.post(BASE_URL+"/save", employee)

export const getEmployeeById = (eid) => axios.get(BASE_URL+"/find/"+eid)

export const updateEmployee = (eid, employee) => {
    return axios.put(BASE_URL+"/modify/"+eid, employee);    
}

export const deleteEmployeeById = (eid) => axios.delete(BASE_URL+"/delete/"+eid)