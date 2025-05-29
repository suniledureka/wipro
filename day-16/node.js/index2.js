console.log(`Welcome to Node.js`);
const addFn = require('./add')

const sum = addFn(7, 8);
console.log(`sum = ${sum}`)
console.log(`sum = ${addFn(10,20)}`)