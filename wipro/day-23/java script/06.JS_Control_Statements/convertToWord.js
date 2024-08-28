let inputElement = document.getElementById('txtNum')
let displayElement = document.getElementById('result')

function convertToWord() {
    let num = inputElement.value
    let word = ''
    while (num > 0) {
        let rem = num % 10
        word = getWord(rem)+word
        num = Math.floor(num/10)
    }//while
    displayElement.innerText = word
}//function


function getWord(rem)
{
 let w=''
 switch (rem) {
    case 0:
        w = 'ZERO '
        break
    case 1:
        w = 'ONE '
        break
    case 2:
        w = 'TWO '
        break
    case 3:
        w = 'THREE '
        break
    case 4:
        w = 'FOUR '
        break
    case 5:
        w = 'FIVE '
        break
    case 6:
        w = 'SIX '
        break
    case 7:
        w = 'SEVEN '
        break
    case 8:
        w= 'EIGHT '
        break
    case 9:
        w= 'NINE '
        break
}//switch
return w;
}