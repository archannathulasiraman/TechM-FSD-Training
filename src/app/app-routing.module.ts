import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MoviesComponent } from './components/movies/movies.component';
import { ReviewDetailsComponent } from './components/review-details/review-details.component';
import { ReviewFormComponent } from './components/review-form/review-form.component';

const routes: Routes = [
  { path: '', redirectTo: 'movies', pathMatch: 'full' },
  { path: 'movies', component: MoviesComponent },
  { path: 'reviews', component: ReviewDetailsComponent },
  { path: 'add-review', component: ReviewFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
