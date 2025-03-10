import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MovieService } from '../../services/movie.service';

@Component({
  selector: 'app-review-form',
  templateUrl: './review-form.component.html',
  styleUrls: ['./review-form.component.css']
})
export class ReviewFormComponent implements OnInit {
  reviewForm!: FormGroup;
  movies: any[] = [];

  constructor(private fb: FormBuilder, private movieService: MovieService) {}

  ngOnInit(): void {
    this.reviewForm = this.fb.group({
      movieId: ['', Validators.required],
      user: ['', Validators.required],
      comment: ['', Validators.required],
      rating: ['', [Validators.required, Validators.min(1), Validators.max(10)]]
    });

    // Fetch movies for dropdown
    this.movieService.getMovies().subscribe((data) => {
      this.movies = data;
    });
  }

  submitReview(): void {
    if (this.reviewForm.valid) {
      const { movieId, user, comment, rating } = this.reviewForm.value;

      // Get the selected movie
      this.movieService.getMovieById(movieId).subscribe((movie) => {
        if (movie) {
          const updatedReviews = [...movie.reviews, { user, comment, rating }];

          // Update movie's reviews
          this.movieService.updateMovieReviews(movieId, updatedReviews).subscribe(() => {
            alert('Review submitted successfully!');
            this.reviewForm.reset();
          });
        }
      });
    }
  }
}
