console.log(`Welcome to Node.js`);

const add = (x=0, y=0) => {
    return x + y;
}

const sum = add(7, 8);
console.log(`sum = ${sum}`)
console.log(`sum = ${add(10,20)}`)