let calc = (x=0, y=0) => {
    let res = x+y;
    console.log(`Sum = ${res}`)
}

calc(10,20)


let greet = () => alert('Welcome to Wipro')
greet(); //function calling


/*
let sum = (x, y)=>{
    return x+y
}
*/
let sum = (x,y)=> (x+y)
console.log(typeof sum)
console.log(sum(11,23))

let printNaturals = (num)=>{
    let res = ''
    for(let i=1;i<=num;i++){
       if(i==1)
           res=1
        else
           res = `${res}, ${i}`
    }
    console.log(res)
 }

 printNaturals(5)
 printNaturals(20)
 printNaturals(3)
