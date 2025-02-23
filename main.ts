interface Movie {
    id: string;
    title: string;
    poster: string;
    rating: string;
}

async function fetchMovies(): Promise<void> {
    try {
        const response = await fetch("movieData.json");
        const data = await response.json();
        displayMovies(data.movies);
    } catch (error) {
        console.error("Error fetching movies:", error);
    }
}

function displayMovies(movies: Movie[]): void {
    const movieList = document.getElementById("movieList") as HTMLElement;
    movieList.innerHTML = movies.map(movie =>
        `<div class="movie-card">
            <img src="${movie.poster}" alt="${movie.title}">
            <h3>${movie.title}</h3>
            <p>Rating: ${movie.rating} ⭐</p>
        </div>`
    ).join("");
}

fetchMovies();
