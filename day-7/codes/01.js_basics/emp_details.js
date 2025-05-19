let emp_id = 1001234;
let emp_name = 'Sanjay Patil';
let emp_sal = 85750.75;

let emp_details = `ID: ${emp_id} <br>NAME: ${emp_name} <br>SALARY: ${emp_sal}`;
console.log(emp_details);

document.getElementById("emp_details").innerHTML = emp_details;
//document.getElementById("emp_details").innerText = emp_details;