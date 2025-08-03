function BlogDetails({ blogs }) {
  return (
    <div>
      {blogs.map((blog, index) => (
        <div key={index}>
          <h2>{blog.title}</h2>
          <h4><strong>{blog.author}</strong></h4>
          <p>{blog.content}</p>
        </div>
      ))}
    </div>
  );
}
export default BlogDetails;
