const btn_posts = document.querySelector('#get-posts-btn')
const output = document.querySelector('#output-posts')
const form = document.getElementById('add-post-form')

//get and show posts
async function showPosts() {
  console.log('inside')  
  try{  
    const response = await fetch('http://localhost:5000/api/posts/')
    if(!response.ok){
        throw new Error('failed to fetch posts... internal server error')
    }
    const posts = await response.json();
    //console.log(posts)
    output.innerHTML = ''

    posts.forEach(post => {
        //console.log(post)
        const postElement = document.createElement('div');
        postElement.textContent = post.id + ': ' +post.title
        output.appendChild(postElement)
    });

  }catch(err){
    console.error(err)
  }
}

//submit new post
async function addPost(event){
    event.preventDefault();
    const formData = new FormData(this);
    //console.log(formData)
    const postTitle = formData.get("title")
    console.log(JSON.stringify({postTitle}))

    try{
        const result = await fetch('http://localhost:5000/api/posts',{
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({"title": postTitle})
        })

        if(!result.ok){
            throw new Error('Failed to add new Post')
        }
        const posts = await result.json();
        showPosts(); 
    }catch(err){
        console.log(err);
    }
}

//event listener
btn_posts.addEventListener('click', showPosts)
form.addEventListener('submit', addPost)