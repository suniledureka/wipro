import express from 'express';
import postRoutes from './routes/posts.js';
import logger from './middleware/logger.js';
import errorHandler from './middleware/errorHandler.js';

const app = new express();

const PORT = process.env.PORT || 1001;

//Body Parser Middleware - to get data from request body
app.use(express.json()) //<--- allows to submit raw json data
app.use(express.urlencoded()) //<--- allows to get form data

//logger middleware to app-level
app.use(logger)

//Routes middleware
app.use('/api/posts', postRoutes)

// Custom error-handling middleware
/*
app.use((err, req, res, next) => {
  console.log(err);
  res.status(500).json({ message: "Oops! Something went wrong." });
});
*/

app.use((req, res, next) => {
 const error = new Error(`Not Found`)
 error.status = 404
 next(error); 
}) 


app.use(errorHandler)

app.listen(PORT, () => console.log(`Server listening on Port: ${PORT}`))