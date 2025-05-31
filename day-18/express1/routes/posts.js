//const express = require('express');  //CommonJS
import express from 'express';

const router = express.Router();

let posts = [
    { id: 1, title: 'Post One' },
    { id: 2, title: 'Post Two' },
    { id: 3, title: 'Post Three' },
    { id: 4, title: 'Post Four' }
]

//get all posts 
router.get('/', (req, res) => {
    const limit = parseInt(req.query.limit)

    if (!isNaN(limit) && limit > 0) {
        res.status(200).json(posts.slice(0, limit))
    } else {
        res.status(200).json(posts)
    }
})


//get a single post based on id 
router.get('/:id', (req, res) => {
    const postId = parseInt(req.params.id);
    //const post = posts.filter(post => post.id === postId)
    const post = posts.find(post => post.id === postId)
    if (!post) {
        return res.status(404).json({ message: `Post with ID: ${postId} not found!!` })
    }
    res.json(post)
})

//create a new post
router.post('/', (req, res) => {
    //console.log(!req.body.title);
    if (req.body.title) {
        const newPost = {
            id: posts.length + 1,
            title: req.body.title
        }
        posts.push(newPost);
        return res.status(201).json(posts)
    }
    res.status(400).json({ message: 'Please include title!!' })
})


//update an existing post
router.put("/:id", (req, res) => {
   const postId = parseInt(req.params.id);
   const post = posts.find(post => post.id === postId);

   if(!post)
      return res.status(400).json({message: `Post with id: ${postId} not in store`})

   if(req.body.title) {
        post.title = req.body.title;
   }
   res.status(200).json(posts);
})

//delete a post
router.delete("/:id", (req, res) => {
    const postId = parseInt(req.params.id)
    const post = posts.find(post => post.id === postId)

    if(!post){
        return res.status(400).json({message: `Post with id: ${postId} not in store`})
    }
    
    posts = posts.filter(post => !(post.id === postId));
    res.status(200).json(posts);
})

//module.exports = router;   //CommonJS
export default router;