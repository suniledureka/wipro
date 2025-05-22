let numbers = ['ZERO','ONE','TWO','THREE','FOUR','FIVE','SIX','SEVEN','EIGHT','NINE']

let txtNum = document.querySelector('#txtNum')
let h1Tag = document.querySelector('#display_head')

txtNum.addEventListener('keyup', function(){
    let num = txtNum.value.trim()     
    let word = convertToWord(num)
    h1Tag.innerHTML = word
})

let convertToWord = (num)=>{
    let word=''
    for(let value of num){        
       word += `${numbers[value]} ` 
    }
    return word
}