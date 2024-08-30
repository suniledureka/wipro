var http = require('http');
var dt = require('./dateModule');

http.createServer(function (req, res) {
  res.writeHead(200, {'Content-Type': 'text/html'});
  res.write("Today is : <strong>" + dt.myDateTime() + '</strong>');
  res.end();
}).listen(8080, () => console.log("server running on http://localhost:8080/")); 