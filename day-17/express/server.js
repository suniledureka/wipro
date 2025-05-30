const express = require('express');
const server = new express();

const PORT = 5000;

//create a Route
server.get("/", (req, res) => {
    //res.send('API working perfectly')
    //res.send('<h2>API working perfectly</h2>')
    res.send({message: 'API working perfectly'}) 
})

//create a Route for /about
server.get("/about", (req, res) => {
    res.send(`About Us`)
})

server.listen(PORT, () => console.log(`Server listening on Port: ${PORT}`))