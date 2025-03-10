import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MovieService {
  private apiUrl = 'http://localhost:3000/movies'; // JSON Server URL

  constructor(private http: HttpClient) {}

  // Fetch all movies
  getMovies(): Observable<any[]> {
    return this.http.get<any[]>(this.apiUrl);
  }

  // Get a single movie by ID
  getMovieById(id: number): Observable<any> {
    return this.http.get<any>(`${this.apiUrl}/${id}`);
  }

  // Update a movie's reviews
  updateMovieReviews(movieId: number, reviews: any[]): Observable<any> {
    return this.http.patch(`${this.apiUrl}/${movieId}`, { reviews });
  }
}
