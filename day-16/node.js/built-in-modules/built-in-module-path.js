const path = require('path')

//case-1 ---> join 2 paths
const basePath = '/users/sunil/docs'
const subPath = 'userId/file.txt'
const fullPath = path.join(basePath, subPath);
console.log(fullPath);
console.log();

//case-2 ---> get file name from path
const filePath = 'home/users/document/wipro.txt';
const fileName = path.basename(filePath);
console.log(fileName);
console.log()

//case-3 ---> get directory name from path
const dirName = path.dirname(filePath);
console.log(dirName);
console.log()

//case-4 ---> resolving path
const basePath1 = '/users/sunil/docs'
//const relativePath = '/java.txt'
const relativePath = 'java.txt'
const absolutePath = path.resolve(basePath1, relativePath)
console.log(absolutePath)
console.log()