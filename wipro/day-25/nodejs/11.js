var fs = require('fs');

fs.appendFile('java1.txt', 'Java is a high level Programming Language', function (err) {
  if (err) 
      throw err;
  console.log('Saved!');
}); 
