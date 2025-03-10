import React, { useState } from "react";

type Movie = {
  id: number;
  title: string;
};

type ReviewFormProps = {
  selectedMovie: Movie | null;
  onAddReview: (reviewText: string) => void; // ✅ Accepts function from App.tsx
};

const ReviewForm: React.FC<ReviewFormProps> = ({ selectedMovie, onAddReview }) => {
  const [review, setReview] = useState("");

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    if (!selectedMovie) return;

    onAddReview(review); // ✅ Send review to App.tsx
    setReview(""); // ✅ Clear input field
  };

  return (
    <div>
      <h2>Write a Review for {selectedMovie ? selectedMovie.title : "..."}</h2>
      <form onSubmit={handleSubmit}>
        <textarea
          value={review}
          onChange={(e) => setReview(e.target.value)}
          placeholder="Write your review here..."
          required
        />
        <button type="submit">Submit Review</button>
      </form>
    </div>
  );
};

export default ReviewForm;
