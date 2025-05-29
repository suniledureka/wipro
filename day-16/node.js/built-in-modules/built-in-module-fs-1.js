const fs = require('fs')

//case-1 --> reading file contents
fs.readFile('java.txt', 'utf-8', (err, data) => {
    if(err){
        console.error(`error reading file contents`)
        console.log(err)
        return
    }
    console.log(data)
})

//case-2 --> write to a file
const fileData = 'Wipro Technologies Limited';
fs.writeFile('wipro.txt', fileData, (err) => {
    console.log('error writing data to file');
    console.log(err)
    return;
})
console.log('file saved successfully');

//case-3 create a directory
fs.mkdir('docs', err => {
    if(err){
        console.log('error creating directory')        
    }else{
        console.log('directory created')
    }
})