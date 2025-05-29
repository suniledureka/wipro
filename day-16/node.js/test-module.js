/*
const responseObj = require('./functions-module')

console.log(responseObj)

console.log(`sum = ${responseObj.add(5, 7)}`)
console.log(`product = ${responseObj.multiply(5, 7)}`)
responseObj.sanitizeInput("Node.js", "output.txt")
*/

const {apiKey, add, multiply, sanitizeInput} = require('./functions-module')  //destructuring

console.log(`sum = ${add(5, 7)}`)
console.log(`product = ${multiply(5, 7)}`)
sanitizeInput("Node.js", "output.txt")

console.log(`JWT = ${apiKey}`)