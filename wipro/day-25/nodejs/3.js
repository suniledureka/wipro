let http = require("http"); 

http.createServer(function (request, response) {  
       // Send the HTTP header, HTTP Status: 200 : OK & Content Type: text/plain  
       response.writeHead(200, {'Content-Type': 'text/plain'});  
       response.end('Welcome to Wipro Tech\n');  //Send the response body 
    })
    .listen(8080);  

// Console will print the message  
console.log('Server running at http://localhost:8080/');  
