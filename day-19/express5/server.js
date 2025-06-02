import express from 'express';
import postRoutes from './routes/posts.js';
import logger from './middleware/logger.js';

import {fileURLToPath} from 'url';
import path from 'path';

import errorHandler from './middleware/errorHandler.js';

const app = new express();

const PORT = process.env.PORT || 1001;

const __filename = fileURLToPath(import.meta.url); //<-- return the file URL
const __dirname = path.dirname(__filename);
//console.log(__dirname)

//-- Middleware to setup static folder
app.use(express.static(path.join(__dirname, 'public')));

//Body Parser Middleware - to get data from request body
app.use(express.json()) //<--- allows to submit raw json data
app.use(express.urlencoded()) //<--- allows to get form data

//logger middleware to app-level
app.use(logger)

//Routes middleware
app.use('/api/posts', postRoutes)

app.use((req, res, next) => {
 const error = new Error(`Not Found`)
 error.status = 404
 next(error); 
}) 


app.use(errorHandler)

app.listen(PORT, () => console.log(`Server listening on Port: ${PORT}`))