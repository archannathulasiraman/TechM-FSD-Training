document.addEventListener("DOMContentLoaded", () => {
    fetchMovies();
});

function fetchMovies() {
    fetch("movieData.json")
        .then(response => response.json())
        .then(data => {
            const movieList = document.getElementById("movieList");
            movieList.innerHTML = "";
            data.movies.forEach(movie => {
                movieList.innerHTML += `
                    <div class="movie-card">
                        <img src="${movie.poster}" alt="${movie.title}">
                        <h3>${movie.title}</h3>
                        <p>Rating: ${movie.rating} ⭐</p>
                        <button onclick="viewMovie('${movie.id}')">View Details</button>
                    </div>
                `;
            });
        })
        .catch(error => console.error("Error fetching movies:", error));
}

function searchMovie() {
    let searchQuery = document.getElementById("searchBox").value.toLowerCase();
    fetch("movieData.json")
        .then(response => response.json())
        .then(data => {
            let results = data.movies.filter(movie => movie.title.toLowerCase().includes(searchQuery));
            const searchResults = document.getElementById("searchResults");
            searchResults.innerHTML = results.length > 0 ? results.map(movie =>
                `<p>${movie.title} - Rating: ${movie.rating} ⭐</p>`
            ).join("") : "<p>No results found.</p>";
        });
}

function viewMovie(movieId) {
    alert("Movie details for ID: " + movieId);
}
document.addEventListener("DOMContentLoaded", function () {
    const searchInput = document.getElementById("searchInput");
    const movieList = document.getElementById("movieList");

    // Function to fetch and display movies
    async function fetchMovies() {
        try {
            const response = await fetch("movieData.json"); // Fetch movie data
            const data = await response.json();
            displayMovies(data.movies); // Display all movies initially

            // Add event listener to search input
            searchInput.addEventListener("input", function () {
                const query = searchInput.value.toLowerCase();
                const filteredMovies = data.movies.filter(movie =>
                    movie.title.toLowerCase().includes(query)
                );
                displayMovies(filteredMovies); // Update results based on search
            });

        } catch (error) {
            console.error("Error fetching movies:", error);
        }
    }

    // Function to display movies
    function displayMovies(movies) {
        movieList.innerHTML = ""; // Clear previous results
        movies.forEach(movie => {
            const movieItem = document.createElement("div");
            movieItem.classList.add("movie-card");
            movieItem.innerHTML = `
                <img src="${movie.poster}" alt="${movie.title}" width="100">
                <h3>${movie.title}</h3>
                <p>Rating: ${movie.rating}</p>
            `;
            movieList.appendChild(movieItem);
        });
    }

    fetchMovies(); // Load movies on page load
});
document.addEventListener("DOMContentLoaded", async function () {
    const movieContainer = document.getElementById("movieContainer");

    try {
        const response = await fetch("movieData.json"); // Fetch movie data
        const data = await response.json();

        // Display all movies initially
        displayMovies(data.movies);

        // Store movie data globally for searching
        window.movieData = data.movies;

    } catch (error) {
        console.error("Error fetching movies:", error);
    }
});

// Function to display movies
function displayMovies(movies) {
    const movieContainer = document.getElementById("movieContainer");
    movieContainer.innerHTML = ""; // Clear previous content

    if (movies.length === 0) {
        movieContainer.innerHTML = "<p>No movies found.</p>";
        return;
    }

    movies.forEach(movie => {
        const movieCard = document.createElement("div");
        movieCard.classList.add("movie-card");
        movieCard.innerHTML = `
            <img src="${movie.poster}" alt="${movie.title}" width="250">
            <h2>${movie.title}</h2>
            <p>⭐ ${movie.rating}</p>
            <a href="movie.html?id=${movie.id}">View Details</a>
        `;
        movieContainer.appendChild(movieCard);
    });
}

// Function to filter movies based on search input
function searchMovies() {
    const searchInput = document.getElementById("searchBox").value.toLowerCase();
    const filteredMovies = window.movieData.filter(movie =>
        movie.title.toLowerCase().includes(searchInput)
    );

    displayMovies(filteredMovies);
}

