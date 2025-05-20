//creating an array as a literal
let marks = [98,78,93,64,76,82]

//to get size of array
console.log(`Size of Array = ${marks.length}`)

//to get an existing value of array
console.log(marks[1]) //78

//getting a non-existing index of array
console.log(marks[6]) //undefined

console.log(marks)
console.log(`Type of Array : ${typeof(marks)}`)

/*--- array iteration ---*/
console.log(`-------- array iteration using a for loop -------`)
for(let i=0;i<marks.length;i++)
{
  console.log(`Mark for Subject-${i+1} : ${marks[i]}`)  
}

console.log(`-------- array iteration using a for...in loop -------`)
for(let index in marks)
{
  console.log(`${index} : ${marks[index]}`)  
}

console.log(`-------- array iteration using a for...of loop -------`)
for(let mark of marks)
{
  console.log(`${mark}`)  
}

let sum=0;
var arr = [10,15,20,30];
arr.forEach(function myFunction(element)
{ 
sum= sum+element;
});
document.writeln(sum);