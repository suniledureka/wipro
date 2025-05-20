//create an array to store course name
let courses = new Array()

//get reference of textbox and div
let txtCourseName = document.getElementById('txtCourseName')
let display_courses = document.getElementById('courses_region')

//function declaration
let addCourse = ()=>{
  // get course from input field
  let course = txtCourseName.value

  if(course.trim().length <= 0){
    alert('Please enter course name!')
    txtCourseName.focus();
  }
  else if(courses.indexOf(course) >= 0){
    alert(course+' is already in the list')
    txtCourseName.value = '' //to clear textfield content
    txtCourseName.focus()
  }
  else{
    //add the course name to array
    courses.push(course)
    txtCourseName.value = '' 
    txtCourseName.focus()
    
    let courseData = '<h3>Courses @ Wipro</h3> <ol>'
    for(let name of courses){
      courseData += `<li>${name}</li>`
    }
    courseData += '</ol>'

    display_courses.innerHTML = courseData
  }
}