let empno = 101
let name = 'Sunil Joseph'
let sal = 25000

function showEmpDetails(){
    let emp_data = `Emp No : ${empno} | ${typeof(empno)}<br>
                Name: ${name} | ${typeof name}<br>
                Salary: ${sal} | ${typeof sal}`;

    let emp_details_region = document.getElementById("emp_dtls");
    emp_details_region.innerHTML = emp_data;            
}