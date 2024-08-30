let fs = require('fs');

fs.readFile('java.txt', function(error, data){
    if(error == null)
        console.log(data.toString())
    else
        console.error('file read error! - ' + error.message)
})