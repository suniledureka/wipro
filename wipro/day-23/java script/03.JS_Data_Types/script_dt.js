let empno = 101
let pname = 'Sunil Joseph'
let sal = 25000

/*function definition*/
function showEmpDetails()
{
  let emp_details = document.getElementById('dt')

  let data = `Emp No : ${empno} | ${typeof(empno)}<br>Name: ${pname} | ${typeof pname}<br>
  Salary: ${sal} | ${typeof sal}`

  emp_details.style.display='block';
  emp_details.innerHTML = data
}