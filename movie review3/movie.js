const movies = {
    "amaran": {
        title: "Amaran",
        poster: "https://upload.wikimedia.org/wikipedia/en/thumb/d/d2/Amaran_poster.jpg/220px-Amaran_poster.jpg",
        rating: "7.5",
        description: "An action-packed thriller starring Karthik and Bhanupriya.",
        cast: "Karthik, Bhanupriya, Radha Ravi",
        crew: "Director: K. Rajeshwar, Music: Adithyan"
    },
    "sachin": {
        title: "Sachin",
        poster: "https://upload.wikimedia.org/wikipedia/en/4/44/Sachin_Tamil_poster.jpg",
        rating: "6.8",
        description: "A youthful romantic drama featuring Vijay and Genelia.",
        cast: "Vijay, Genelia D'Souza, Bipasha Basu",
        crew: "Director: John Mahendran, Music: Devi Sri Prasad"
    },
    "vaaranam-aayiram": {
        title: "Vaaranam Aayiram",
        poster: "https://upload.wikimedia.org/wikipedia/en/7/7c/Vaaranam_Aayiram.jpg",
        rating: "8.3",
        description: "A heartwarming tale of love and father-son bonding starring Suriya.",
        cast: "Suriya, Sameera Reddy, Simran",
        crew: "Director: Gautham Vasudev Menon, Music: Harris Jayaraj"
    }
};

// Function to get movie ID from URL
function getMovieId() {
    const params = new URLSearchParams(window.location.search);
    return params.get("id");
}

// Display movie details
function displayMovieDetails() {
    const movieId = getMovieId();
    if (!movieId || !movies[movieId]) {
        document.getElementById("movieDetails").innerHTML = "<p>Movie not found.</p>";
        return;
    }

    const movie = movies[movieId];
    document.getElementById("movieDetails").innerHTML = `
        <h1>${movie.title}</h1>
        <img src="${movie.poster}" alt="${movie.title}">
        <p>⭐ Rating: ${movie.rating}/10</p>
        <p>${movie.description}</p>
        <p><strong>Cast:</strong> ${movie.cast}</p>
        <p><strong>Crew:</strong> ${movie.crew}</p>
    `;
}

// Home button function
function goHome() {
    window.location.href = "index.html";
}

// Display movie details on page load
displayMovieDetails();
