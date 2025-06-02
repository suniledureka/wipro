//const express = require('express');  //CommonJS
import express from 'express';
import { createPost, deletePost, getPost, getPosts, updatePost } from '../controllers/postsController.js';

const router = express.Router();


//get all posts 
router.get('/', getPosts)


//get a single post based on id 
router.get('/:id', getPost)

//create a new post
router.post('/', createPost )


//update an existing post
router.put("/:id", updatePost)

//delete a post
router.delete("/:id", deletePost)

//module.exports = router;   //CommonJS
export default router;