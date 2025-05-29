(function(){
    var data = 'immediate invoking function'; 
    console.log(data)
})()
//console.log(data)

const result = (function(){
    const x = 10;
    const y = 20;
    return x+y;
})()
console.log(result)