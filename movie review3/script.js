const movies = [
    {
        id: "amaran",
        title: "Amaran",
        poster: "https://upload.wikimedia.org/wikipedia/en/thumb/d/d2/Amaran_poster.jpg/220px-Amaran_poster.jpg",
        rating: "7.5",
        description: "An action-packed thriller starring Karthik and Bhanupriya.",
        cast: "Karthik, Bhanupriya, Radha Ravi",
        crew: "Director: K. Rajeshwar, Music: Adithyan"
    },
    {
        id: "sachin",
        title: "Sachin",
        poster: "https://upload.wikimedia.org/wikipedia/en/4/44/Sachin_Tamil_poster.jpg",
        rating: "6.8",
        description: "A youthful romantic drama featuring Vijay and Genelia.",
        cast: "Vijay, Genelia D'Souza, Bipasha Basu",
        crew: "Director: John Mahendran, Music: Devi Sri Prasad"
    },
    {
        id: "vaaranam-aayiram",
        title: "Vaaranam Aayiram",
        poster: "https://upload.wikimedia.org/wikipedia/en/7/7c/Vaaranam_Aayiram.jpg",
        rating: "8.3",
        description: "A heartwarming tale of love and father-son bonding starring Suriya.",
        cast: "Suriya, Sameera Reddy, Simran",
        crew: "Director: Gautham Vasudev Menon, Music: Harris Jayaraj"
    }
];

function displayMovies(filteredMovies) {
    const movieList = document.getElementById("movieList");
    movieList.innerHTML = "";

    filteredMovies.forEach(movie => {
        const movieCard = document.createElement("div");
        movieCard.classList.add("movie");

        movieCard.innerHTML = `
            <img src="${movie.poster}" alt="${movie.title}">
            <h3>${movie.title}</h3>
            <p>⭐ Rating: ${movie.rating}/10</p>
            <p>${movie.description}</p>
            <button class="details-btn" data-id="${movie.id}">View Details</button>
        `;

        movieList.appendChild(movieCard);
    });

    // Add click event listeners to each movie card
    document.querySelectorAll(".details-btn").forEach(button => {
        button.addEventListener("click", function() {
            const movieId = this.getAttribute("data-id");
            window.location.href = `movie.html?id=${movieId}`;
        });
    });
}

// Initial display
displayMovies(movies);

// Search functionality
document.getElementById("searchInput").addEventListener("input", function() {
    const searchTerm = this.value.toLowerCase();
    const filteredMovies = movies.filter(movie => 
        movie.title.toLowerCase().includes(searchTerm)
    );
    displayMovies(filteredMovies);
});
