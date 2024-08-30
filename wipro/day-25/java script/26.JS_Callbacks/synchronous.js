function first(){
    console.log('function - 1')
}

let second = () =>{ 
    console.log('function - 2')
    for(let i=1; i<=1000000; i++){
        console.log(`${i}`)
    }
}

let third = function(){
    console.log('function - 3')
}

first();
second();
third();