let n = 24
let rem = n%2
let result = ''
if(rem == 0){
    result = `${n} is Even`
}
else{
    result = `${n} is Odd`
}
console.log(result)
document.getElementById('oddoreven').innerHTML = result