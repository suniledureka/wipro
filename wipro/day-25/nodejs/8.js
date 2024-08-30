let http = require('http');
let url = require('url');

http.createServer(function (request, response) {
  response.writeHead(200, {'Content-Type': 'text/html'});

  let q = url.parse(request.url, true).query;
  console.log(q);

  let txt = q.name + " " + q.age;
  response.end(txt);
}).listen(8080);
console.log('Server listening on http://localhost:8080/');

//http://localhost:8080/?name=Sunil&age=40