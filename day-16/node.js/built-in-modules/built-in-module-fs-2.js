var http = require('http');
var fs = require('fs');

http.createServer(function (req, res) {
  fs.readFile('index.html', function(err, data) {
    console.log(err)
   if(err == null){ 
    res.writeHead(200, {'Content-Type': 'text/html'});
    res.write(data);
    return res.end();
   }else{
    res.writeHead(500, {'Content-Type': 'text/html'});
     res.write('Internal Server Error.... Try Again Later')
     return res.end();
   }
  });
}).listen(8080, () => console.log('server listening on port 8080')); 