let posts = [
    { id: 1, title: 'Post One' },
    { id: 2, title: 'Post Two' },
    { id: 3, title: 'Post Three' },
    { id: 4, title: 'Post Four' }
]

//@desc Get All Posts
//@route GET /api/posts/
export const getPosts = (req, res) => {
    const limit = parseInt(req.query.limit)

    if (!isNaN(limit) && limit > 0) {
        res.status(200).json(posts.slice(0, limit))
    } else {
        res.status(200).json(posts)
    }
}

//@desc Get a single post based on id 
//@route GET /api/posts/:id
export const getPost = (req, res, next) => {
    const postId = parseInt(req.params.id);
    //const post = posts.filter(post => post.id === postId)
    const post = posts.find(post => post.id === postId)

    if (!post) {
        //return res.status(404).json({ message: `Post with ID: ${postId} not found!!` })

        const error = new Error(`Post with the ID of ${postId} not found`)
        //error.status = 500;
        return next(error);
    }
    res.status(200).json(post)
}

//@desc Create a New Post 
//@route POST /api/posts/
export const createPost = (req, res, next) => {
    //console.log(!req.body.title);
    if (req.body.title) {
        const newPost = {
            id: posts.length + 1,
            title: req.body.title
        }
        posts.push(newPost);
        return res.status(201).json(posts)
    }    
    const error = new Error(`Please include a title`)
    return next(error);
}

//@desc Updating an existing Post 
//@route PUT /api/posts/:id
export const updatePost = (req, res) => {
   const postId = parseInt(req.params.id);
   const post = posts.find(post => post.id === postId);

   if(!post)
      return res.status(400).json({message: `Post with id: ${postId} not in store`})

   if(req.body.title) {
        post.title = req.body.title;
   }
   res.status(200).json(posts);
}

//@desc Delete post based on id 
//@route DELETE /api/posts/:id
export const deletePost = (req, res) => {
    const postId = parseInt(req.params.id)
    const post = posts.find(post => post.id === postId)

    if(!post){
        return res.status(400).json({message: `Post with id: ${postId} not in store`})
    }
    
    posts = posts.filter(post => !(post.id === postId));
    res.status(200).json(posts);
}