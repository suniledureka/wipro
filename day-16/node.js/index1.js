console.log(`Welcome to Node.js`);
const add = require('./add.js')

const sum = add(7, 8);
console.log(`sum = ${sum}`)
console.log(`sum = ${add(10,20)}`)