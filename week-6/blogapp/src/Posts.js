// Posts.js
import React from 'react';
import Post from './Post';

class Posts extends React.Component {
  constructor(props){
    super(props);
    this.state= {
      posts: []
    };
  }

  loadPosts(){
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => {
        const postObjects = data.map(p=> new Post(p.id, p.title, p.body));
        this.setState({ posts: postObjects });
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  render() {
    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.map(post=>(
          <div key={post.id}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }

   componentDidCatch(error, info) {
    alert("An error occurred: " + error);
  }
}

export default Posts;
