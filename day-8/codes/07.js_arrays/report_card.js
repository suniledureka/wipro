let studName='', noOfSubs
//to store marks
let marks

let fun_data_entry = () => {
  //create an array to store marks
  marks = new Array()
  studName = prompt('Enter Student Name:')
  noOfSubs = prompt('Enter number of Subjects:', 0)

  for (let i = 0; i < noOfSubs; i++) {
    marks[i] = prompt('Enter Marks for Subject-' + (i + 1))
  }
  //console.log(marks)
  marks.sort(function(a,b){
    return b-a
  })
}


function generate_rc() {
  if (studName.length > 0 && marks.length>0) {
    //to display student name
    document.getElementById('rc_name').innerText = studName
    let tbody = '<tr><th>SUBJECT</th><th>MARKS</th></tr>'
    let total = 0
    //to get each subject mark
    for (let index in marks) {
      tbody = `${tbody}<tr><td>Subject - ${parseInt(index) + 1}</td>
    <td align=center>${marks[index]}</td></tr>`

      total += parseInt(marks[index])
    }//for loop
    document.getElementById('rc_body').innerHTML = tbody

    let avg = total / noOfSubs
    avg = avg.toFixed(2) //to decide no of precision (to specify the number of digits after decimal point)

    let tfoot = '<tr><th>TOTAL: ' + total + "</th><th>AVERAGE: " + avg + "</th></tr>";
    document.getElementById('rc_foot').innerHTML = tfoot
  }
  else {
    alert('Please enter the details first!')
  }
}