let employees_all = getAllEmployees()
//console.log(employees_all)

/*-- function for all employees --*/
let allEmployees = ()=>{
    displayRecords(employees_all)
}

/*-- function for male employees --*/
let maleEmployees = ()=>{
  let males = employees_all.filter((employee)=>{
      return employee.gender=='Male'
  })
  displayRecords(males)
}

/*-- function for male employees --*/
let femaleEmployees = ()=>{
    let females = employees_all.filter((employee)=>{
        return employee.gender=='Female'
    })
    
    displayRecords(females)
}

/*--auto search on keyup event in the text field --*/
let name_search = document.getElementById('name_search')
name_search.addEventListener('keyup',function(){    
    let data = name_search.value.trim();
    let employeenames=new Array();

    if(data.length>0){
     employeenames = employees_all.filter((employee)=>{       
        return employee.first_name.toUpperCase().startsWith(data.toUpperCase())
     })
    }
 
     displayRecords(employeenames)  
})

/*- a common function to integrate employee details in the table body ---*/
let displayRecords = (employees)=>{
    let data=''
    let row_id=1
    for(let employee of employees){
        data=`${data}<tr>
                    <td style=text-align:center>${row_id++}</td>
                    <td>SIT_${employee.id}</td>
                    <td>${employee.first_name}</td>
                    <td>${employee.last_name}</td>
                    <td>${employee.gender}</td>
                    <td style=text-align:center>${employee.age}</td>        
                    <td>${employee.country}</td></tr>`
    }
    document.querySelector('#table_body').innerHTML = data
    document.querySelector('#noRecs').innerText = employees.length
}