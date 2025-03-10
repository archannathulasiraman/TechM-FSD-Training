import React, { useState } from "react";
import MovieList from "./components/MovieList";
import ReviewList from "./components/ReviewList";
import ReviewForm from "./components/ReviewForm";
import "bootstrap/dist/css/bootstrap.min.css";

type Movie = {
  id: number;
  title: string;
};

type Review = {
  movieId: number;
  text: string;
};

const App: React.FC = () => {
  const [selectedMovie, setSelectedMovie] = useState<Movie | null>(null);
  const [reviews, setReviews] = useState<Review[]>([]); // ✅ Store reviews

  const handleAddReview = (reviewText: string) => {
    if (!selectedMovie) return;
    
    const newReview: Review = {
      movieId: selectedMovie.id,
      text: reviewText,
    };

    setReviews([...reviews, newReview]); // ✅ Update state with new review
  };

  return (
    <div className="container">
      <h1>🎬 Movie Review App</h1>

      <MovieList onSelectMovie={setSelectedMovie} />

      {/* ✅ Pass the function to ReviewForm */}
      <ReviewForm selectedMovie={selectedMovie} onAddReview={handleAddReview} />

      {/* ✅ Pass reviews to ReviewList */}
      <ReviewList selectedMovie={selectedMovie} reviews={reviews} />
    </div>
  );
};

export default App;
