import React from "react";

type Movie = {
  id: number;
  title: string;
};

type Review = {
  movieId: number;
  text: string;
};

type ReviewListProps = {
  selectedMovie: Movie | null;
  reviews: Review[];
};

const ReviewList: React.FC<ReviewListProps> = ({ selectedMovie, reviews }) => {
  if (!selectedMovie) return <p>Please select a movie to see reviews.</p>;

  // ✅ Filter reviews for the selected movie
  const movieReviews = reviews.filter((review) => review.movieId === selectedMovie.id);

  return (
    <div>
      <h2>Reviews for {selectedMovie.title}</h2>
      {movieReviews.length === 0 ? (
        <p>No reviews yet.</p>
      ) : (
        <ul>
          {movieReviews.map((review, index) => (
            <li key={index}>{review.text}</li> // ✅ Display reviews
          ))}
        </ul>
      )}
    </div>
  );
};

export default ReviewList;
