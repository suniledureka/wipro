const express = require('express');
//const dotenv = require('dotenv')
//dotenv.config();

const api = new express();

const PORT = process.env.PORT || 1001;
//console.log(PORT)

let posts = [
    { id: 1, title: 'Post One' },
    { id: 2, title: 'Post Two' }, 
    { id: 3, title: 'Post Three' },
    { id: 4, title: 'Post Four' }           
]

/*
//get all posts
api.get('/api/posts', (req, res) => {
    //res.send(posts)
    res.json(posts)
})
*/


//get all posts by including query parameters http://localhost:5000/api/posts?limit=2
api.get('/api/posts', (req, res) => {
    //console.log(req.query)
    const limit = parseInt(req.query.limit)

    if(!isNaN(limit) && limit > 0){
        res.json(posts.slice(0, limit))
    }else {
        res.json(posts)
    }
})


//get a single post based on search - based on path variable
api.get('/api/posts/:id', (req, res) => {
    //console.log(req.params)
    //console.log(req.params.id)
    const postId = parseInt(req.params.id);

    //const post = posts.filter(post => post.id === postId)
    const post = posts.find(post => post.id === postId)
    res.json(post)
})

api.listen(PORT, () => console.log(`Server listening on Port: ${PORT}`))