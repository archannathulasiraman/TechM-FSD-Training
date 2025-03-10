import React, { useEffect, useState } from "react";
import axios from "axios";

// ✅ Define Movie type
type Movie = {
  id: number;
  title: string;
};

// ✅ Define Props for MovieList
type MovieListProps = {
  onSelectMovie: (movie: Movie) => void;
};

const MovieList: React.FC<MovieListProps> = ({ onSelectMovie }) => {
  const [movies, setMovies] = useState<Movie[]>([]);

  useEffect(() => {
    axios.get("/movies.json") // Fetch from local JSON file
      .then(response => {
        setMovies(response.data.movies); // Extract movies array
      })
      .catch(error => console.error("Error fetching movies:", error));
  }, []);

  return (
    <div>
      <h2>Available Movies</h2>
      <ul>
        {movies.map((movie) => (
          <li key={movie.id} onClick={() => onSelectMovie(movie)}>
            {movie.title}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default MovieList;
