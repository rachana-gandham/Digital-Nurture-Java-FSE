import './App.css';
import { books, blogs, courses } from './data';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';
import React, { useState } from 'react';

function App() {
  const [showBooks, setShowBooks] = useState(true);
  const [showBlogs, setShowBlogs] = useState(true);
  const [showCourses, setShowCourses] = useState(true);

  return (
    <div style={{ display: "flex", justifyContent: "space-around", padding: "30px" }}>
      {showCourses && (
        <div className="mystyle1">
          <h1>Course Details</h1>
          <CourseDetails courses={courses} />
        </div>
      )}
      {showBooks && (
        <div className="st2">
          <h1>Book Details</h1>
          <BookDetails books={books} />
        </div>
      )}

      {showBlogs && (
        <div className="v1">
          <h1>Blog Details</h1>
          <BlogDetails blogs={blogs} />
        </div>
      )}

      
    </div>
  );
}

export default App;
