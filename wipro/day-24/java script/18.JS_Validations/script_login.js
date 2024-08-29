//get form element references
let uid = document.querySelector('#uid')
let pwd = document.querySelector('#pwd')

function validateFormData()
{
 //get username value of form
 let uid_data = uid.value.trim()
 if(uid_data.length<5){
     alert('User name should be min 5 chars')
     uid.focus()
     uid.style.border='2px solid red'
     uid.style.boxShadow='0 0 10px red'
     return false
 }
 else{
    uid.style.border='2px solid green'
    uid.style.boxShadow='0 0 10px green'
 }

 //get password value of form
 let pwd_data = pwd.value.trim()
 if(pwd_data.length<=0){
     alert('Password should be entered')
     pwd.focus()
     return false
 }
}