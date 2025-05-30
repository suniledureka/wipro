const express = require('express');

const api = new express();

const PORT = process.env.PORT || 1001;

let posts = [
    { id: 1, title: 'Post One' },
    { id: 2, title: 'Post Two' }, 
    { id: 3, title: 'Post Three' },
    { id: 4, title: 'Post Four' }           
]

//get all posts by including query parameters http://localhost:5000/api/posts?limit=2
api.get('/api/posts', (req, res) => {
    //console.log(req.query)
    const limit = parseInt(req.query.limit)

    if(!isNaN(limit) && limit > 0){
        res.status(200).json(posts.slice(0, limit))
    }else {
        res.status(200).json(posts)
    }
})


//get a single post based on search - based on path variable and response with status code
api.get('/api/posts/:id', (req, res) => {
    //console.log(req.params)
    //console.log(req.params.id)
    const postId = parseInt(req.params.id);

    //const post = posts.filter(post => post.id === postId)
    const post = posts.find(post => post.id === postId)
    //console.log(post)
    if (!post){
        return res.status(404).json({message: `Post with ID: ${postId} not found!!`})
    }
    res.json(post)
})

api.listen(PORT, () => console.log(`Server listening on Port: ${PORT}`))