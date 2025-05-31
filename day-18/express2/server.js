import express from 'express';
import postRoutes from './routes/posts.js';
import logger from './middleware/logger.js';

const app = new express();

const PORT = process.env.PORT || 1001;

//Body Parser Middleware - to get data from request body
app.use(express.json()) //<--- allows to submit raw json data
app.use(express.urlencoded()) //<--- allows to get form data

//logger middleware to app-level
app.use(logger)

//Routes middleware
app.use('/api/posts', postRoutes)

app.listen(PORT, () => console.log(`Server listening on Port: ${PORT}`))