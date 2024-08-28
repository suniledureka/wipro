/*declare employee details*/
let empno = 101
let ename = 'Sandy'
let sal = 25000

console.log(empno+' | ' + ename + " | "+sal) //old style - ES5
console.log(`${empno} | ${ename} | ${sal}`) //new style - ES6

console.log(document.getElementById('emp_details').innerHTML)
document.getElementById('emp_details').innerHTML = `Emp No: ${empno}<br>
   Name: ${ename}<br>Salary: ${sal}`