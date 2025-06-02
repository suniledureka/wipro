How our front end is able to communicate wth backend?

Usecase: when we click on a button - we should be able to fetch all the posts
For that we need to use "static" middleware

The express.static middleware in Express.js is used to serve static files like html, css, javascript files from a specified directory

app.server(express.static(path.join(__dirname, "public")))   --- here "__dirname" is not defined in ES module scope (its available only for CommonJS)

import {fileURLToPath} from 'url'
import path from 'path'

const __fileName = fileURLToPath(import.meta.url) //return file URL
const __dirname = patg.dirname(__fileName)