let employees = [
    {
        name : 'Sunil',
        age : 40,
        designation : 'Manager',
        active : true
    },
    {
        name : 'Naveen',
        age : 35,
        designation : 'Sr.Manager',
        active : false
    },
    {
        name : 'Rahul',
        age : 25,
        designation : 'Software Engineer',
        active : true
    },
    {
        name : 'Harsha',
        age : 32,
        designation : 'Team Lead',
        active : false
    }
];

console.log(`Total No of Employees: ${employees.length}`)

console.log(`------ Employee Names -------`)
let emp_names = []
/*array iteration */
for(let emp of employees)
{
   let name = emp.name
   emp_names.push(name.toUpperCase())
}
console.log(emp_names)

/*active employees - a normal approach*/
console.log(`---- Active Employees ----`)
for(let employee of employees)
{
  if(employee.active){
      console.log(employee.name.toUpperCase())
  }
}

/*active employees - using filter()*/
let activeCheck = (employee) => {
    return employee.active
}

let activeEmployees = employees.filter(activeCheck)

console.log(`No of Active Employees = ${activeEmployees.length}`)
for(let emp of activeEmployees){
    console.log(emp.name.toUpperCase())
}

/*in-active Employees */
let inActiveCheck = (employee) => (!employee.active)

let inActiveEmployees = employees.filter(inActiveCheck)
console.log(`No of In-Active Employees = ${inActiveEmployees.length}`)

for(let emp of inActiveEmployees){
    console.log(emp.name.toUpperCase())
}

/*Employees whose age < 35 */
let juniorCheck = function(employee){    
    /*
    if(employee.age<35)
      return true;
    else
     return false;  
     */
    return employee.age<35
}

let juniorEmployees = employees.filter(juniorCheck)
console.log(`No of Junior Employees = ${juniorEmployees.length}`)
for(let emp of juniorEmployees){
    console.log(emp.name.toUpperCase())
}


function allEmployees(){
    let result =''
    for(let employee of employees){
        result=result+'<tr><td>'+employee.name+'</td><td>'+employee.age+'</td><td>'+employee.designation+'</td><td align=center>'+employee.active+'</td></tr>'
    }
    document.getElementById('table_body').innerHTML = result;
}


let activeEmployeesFun = ()=>{
    let result = ''
    for(let employee of activeEmployees){
        result=`${result}<tr><td>${employee.name}</td><td>${employee.age}</td><td>${employee.designation}</td><td align=center>${employee.active}</td></tr>`
    }
    displayResult(result); 
}

let inActiveEmployeesFun = () => {
    let result = ''
    for(let employee of inActiveEmployees){
        result=`${result}<tr><td>${employee.name}</td><td>${employee.age}</td><td>${employee.designation}</td><td align=center>${employee.active}</td></tr>`
    }
    displayResult(result); 
}

let juniorStaffFun = ()=>{
    let result = ''
    for(let employee of juniorEmployees){
        result=`${result}<tr><td>${employee.name}</td><td>${employee.age}</td><td>${employee.designation}</td><td align=center>${employee.active}</td></tr>`
    }
    displayResult(result); 
}


let displayResult = (result) =>{
    document.querySelector('#table_body').innerHTML = result   
}