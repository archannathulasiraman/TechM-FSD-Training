import React from "react";

function MovieList({ movies }) {
  return (
    <div>
      <h2 className="text-secondary">Available Movies</h2>
      <ul className="list-group">
        {movies.map((movie) => (
          <li key={movie.id} className="list-group-item">
            {movie.title}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default MovieList;
