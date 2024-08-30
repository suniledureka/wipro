function first(){
    console.log('function - 1')
}

let second = (callback) =>{ 
    setTimeout(() => {
            console.log('function - 2')
            for(let i=1; i<=1000000; i++){
                console.log(`${i}`)
            }

            callback(); //calling third()
        }, 5000);
}

let third = function(){
    console.log('function - 3')
}

first();
second(third);
