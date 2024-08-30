let http = require("http"); 

http.createServer(function (request, response) { 
    response.writeHead(200, {'Content-Type': 'text/html'});  
    response.end('<p style=font-size:20px;color:blue>Welcome to Wipro Tech</p>');  
 })
 .listen(8080, function(){
     console.log('Server running at http://localhost:8080/');  
 });  
