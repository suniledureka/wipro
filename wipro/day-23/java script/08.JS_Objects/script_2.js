let student = {
    name:'Sunil Joseph',
    age: 40,
    course: 'Java Fullstack',
    address: {
        street:'Ameerpet',
        city:'Hyderabad',
        state:'Telangana'
    }
}

console.log(student)
console.log(`Name: ${student.name}`)
console.log(`Address: ${student.address}`)
console.log(`Street: ${student.address.street}`)

//to add a new property to address dynamically
student.address.country='India'

console.log(student)

/*object iteration*/
console.log(`----- Student Details --------`)
for(let prop in student){  
  if(typeof student[prop] === 'object'){
    console.log(`${prop.toUpperCase()} Details::`)
    for(let inprop in student[prop]){
      console.log(`${inprop} = ${student[prop][inprop]}`)
    }
  }
  else
   console.log(`${prop} = ${student[prop]}`)
}