document.addEventListener("DOMContentLoaded", async function () {
    const movieDetailsContainer = document.getElementById("movieDetails");

    // Get the movie ID from the URL
    const urlParams = new URLSearchParams(window.location.search);
    const movieId = urlParams.get("id");

    if (!movieId) {
        movieDetailsContainer.innerHTML = "<h2>No movie selected.</h2>";
        return;
    }

    try {
        const response = await fetch("movieData.json"); // Fetch movie data
        const data = await response.json();
        const movie = data.movies.find(m => m.id === movieId);

        if (!movie) {
            movieDetailsContainer.innerHTML = "<h2>Movie not found.</h2>";
            return;
        }

        // Display the movie details
        movieDetailsContainer.innerHTML = `
            <h1>${movie.title}</h1>
            <img src="${movie.poster}" alt="${movie.title}" width="250">
            <p><strong>Rating:</strong> ${movie.rating}</p>
            <a href="index.html">Back to Home</a>
        `;
    } catch (error) {
        console.error("Error fetching movie details:", error);
    }
});
document.addEventListener("DOMContentLoaded", async function () {
    const movieDetailsContainer = document.getElementById("movieDetails");
    const reviewsContainer = document.getElementById("reviews");
    const reviewForm = document.getElementById("reviewForm");

    // Get the movie ID from the URL
    const urlParams = new URLSearchParams(window.location.search);
    const movieId = urlParams.get("id");

    if (!movieId) {
        movieDetailsContainer.innerHTML = "<h2>No movie selected.</h2>";
        return;
    }

    try {
        const response = await fetch("movieData.json"); // Fetch movie data
        const data = await response.json();
        const movie = data.movies.find(m => m.id === movieId);

        if (!movie) {
            movieDetailsContainer.innerHTML = "<h2>Movie not found.</h2>";
            return;
        }

        // Display the movie details
        movieDetailsContainer.innerHTML = `
            <h1>${movie.title}</h1>
            <img src="${movie.poster}" alt="${movie.title}" width="250">
            <p><strong>Rating:</strong> ${movie.rating}</p>
            <a href="index.html">Back to Home</a>
        `;

        // Load and display reviews
        loadReviews(movieId);

        // Handle review submission
        reviewForm.addEventListener("submit", function (event) {
            event.preventDefault();
            submitReview(movieId);
        });

    } catch (error) {
        console.error("Error fetching movie details:", error);
    }
});

// Load and display reviews
function loadReviews(movieId) {
    const reviewsContainer = document.getElementById("reviews");
    reviewsContainer.innerHTML = ""; // Clear previous content

    const reviews = JSON.parse(localStorage.getItem(`reviews-${movieId}`)) || [];

    if (reviews.length === 0) {
        reviewsContainer.innerHTML = "<p>No reviews yet. Be the first to review!</p>";
        return;
    }

    reviews.forEach(review => {
        const reviewItem = document.createElement("div");
        reviewItem.classList.add("review");
        reviewItem.innerHTML = `
            <p><strong>${review.name}:</strong> ${review.text}</p>
        `;
        reviewsContainer.appendChild(reviewItem);
    });
}

// Save and display new review
function submitReview(movieId) {
    const name = document.getElementById("reviewerName").value.trim();
    const text = document.getElementById("reviewText").value.trim();

    if (name === "" || text === "") {
        alert("Please enter your name and review.");
        return;
    }

    const newReview = { name, text };
    let reviews = JSON.parse(localStorage.getItem(`reviews-${movieId}`)) || [];
    reviews.push(newReview);
    localStorage.setItem(`reviews-${movieId}`, JSON.stringify(reviews));

    // Clear form fields
    document.getElementById("reviewerName").value = "";
    document.getElementById("reviewText").value = "";

    // Reload reviews
    loadReviews(movieId);
}

