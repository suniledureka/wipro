//create an empty object
let emp ={}
console.log(emp)
console.log(`Type of emp = ${typeof emp}`)

//to assign properties to object
emp.empNo = 101
emp.empName = 'Sunil'
emp.empSal = 25000
emp['empDesig'] = 'Manager'
console.log(emp)
console.log();

//to access the property of an object
console.log(`Approach -1 || using dot operator`)

console.log(`Emp No = ${emp.empNo}`)
console.log(`Emp Name = ${emp.empName}`)
console.log(`Emp Salary = ${emp.empSal}`)
console.log(`Emp Designation = ${emp.empDesig}`)
console.log();

console.log(`Approach -2 || using [] brackets`)

console.log(`Emp No = ${emp['empNo']}`)
console.log(`Emp Name = ${emp['empName']}`)
console.log(`Emp Salary = ${emp['empSal']}`)
console.log(`Emp Designation = ${emp["empDesig"]}`)
console.log();

//accessing a non-existing property of an object
console.log(`${emp.location} || ${emp['location']}`)

console.log()
//difference between . and [] while accessing property of an object
let prop = 'empDesig'
console.log(emp.prop) //undefined
console.log(emp[prop]) //Manager

console.log()
//iterating on object properties using for...in loop
for(let property in emp){
    console.log(`${property} = ${emp[property]}`)
}