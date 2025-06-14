const express = require('express')
const app = express()
const bodyParser = require('body-parser');
const cors = require("cors");
const AuthRouter = require('./Routes/AuthRouter');
const ProductRouter = require('./Routes/ProductRouter');

require('dotenv').config();
require('./Configs/db')

app.get("/welcome", (req, res) => {
    res.send("Welcome to Wipro")
})

app.use(bodyParser.json()); 
app.use(cors())

app.use('/auth', AuthRouter);
app.use('/products', ProductRouter);

const PORT = process.env.PORT || 8080;
app.listen(PORT, () => {
    console.log(`Server is running on ${PORT}`)
})

