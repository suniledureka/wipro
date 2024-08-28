//declare account details
let accNo = 1000123045
let name = 'Sanjay'
let balance = 55250.5

//get reference of the region (article)
let acc_details = document.getElementById('acc_details')
//console.log(acc_details)
//acc_details.innerHTML = `A/C No: ${accNo}<br>Name: ${name}<br>Balance: ${balance}`

acc_details.innerHTML = 'A/C No: '+accNo+'<br>Name: '+name+'<br>Balance:'+balance
