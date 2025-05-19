function printSequences(startNumber, endNumber, step)
{
    let res=''
    for(let i=startNumber;i<=endNumber;i+=step)
    {
        res=`${res}${i} | `
    }   
    //console.log(res)    
    return res
}

let naturals = printSequences(1,10,1)
console.log('Natural Numbers = '+naturals)

let evens = printSequences(2,20,2)
console.log(`Even Numbers = ${evens}`)

let odds = printSequences(1,20,2)
console.log(`Odd Numbers = ${odds}`)


document.querySelector('#nat').innerText = 'Natural Numbers = '+naturals

document.getElementById('evens').innerHTML = `Even Numbers = ${evens}`

document.querySelector('#odds').innerHTML = `Odd Numbers = ${odds}`
