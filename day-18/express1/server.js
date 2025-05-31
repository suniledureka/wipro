//const express = require('express'); //File is a CommonJS Module can be converted to ES
//const postRoutes = require('./routes/posts')

import express from 'express';
import postRoutes from './routes/posts.js';

const app = new express();

const PORT = process.env.PORT || 1001;

//Body Parser Middleware - to get data from request body
app.use(express.json()) //<--- allows to submit raw json data
app.use(express.urlencoded()) //<--- allows to get form data

//Routes middleware
app.use('/api/posts', postRoutes)

app.listen(PORT, () => console.log(`Server listening on Port: ${PORT}`))