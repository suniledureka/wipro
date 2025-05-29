const http = require('http')

const PORT = 3000;

// create a server object
const server = http.createServer(function(req, res) {
                //res.writeHead(200, {'Content-Type': 'text/plain'})
                res.writeHead(201, {'Content-Type': 'text/html'})

                res.write('<h2>Welcome to Wipro</h2');
                console.log(req.url)
                res.end()
});

server.listen(PORT, () => {
    console.log('Server running at port : ' + PORT )
})