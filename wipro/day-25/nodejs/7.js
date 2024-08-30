var http = require('http');

http.createServer(function (request, response) {
  response.writeHead(200, {'Content-Type': 'text/html'});
  //console.log(request)
  response.write("URL = " + request.url+'<br><br>');
  response.write('Method = ' + request.method)
  response.end();
}).listen(8080, () => console.log("server running on http://localhost:8080/")); 

