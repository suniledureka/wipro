const express = require('express');
const path = require('path');

const server = new express();

const PORT = 5000;

/*
server.get("/", (req, res) => {
    //console.log(__dirname)
    res.sendFile(path.join(__dirname, 'public', 'index.html')); 
})

server.get("/about", (req, res) => {
    res.sendFile(path.join(__dirname, 'public', 'about.html')); 
})
*/

//-- Middleware to setup static folder
server.use(express.static(path.join(__dirname, 'public')));

server.listen(PORT, () => console.log(`Server listening on Port: ${PORT}`))