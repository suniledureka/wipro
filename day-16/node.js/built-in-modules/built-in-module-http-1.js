const http = require('http')
//console.log(http)

// create a server object
http.createServer(function(req, res) {
    //send a response back to client
    res.write('Welcome to Wipro');

    //end a response
    res.end()
}).listen(3000)