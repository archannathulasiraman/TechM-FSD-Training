import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filterMovies'
})
export class FilterPipe implements PipeTransform {
  transform(movies: any[], selectedCategory: string): any[] {
    if (!movies || selectedCategory === 'all') {
      return movies;
    }

    return movies.filter(movie => {
      if (selectedCategory === 'hit') {
        return movie.rating >= 8;
      } else if (selectedCategory === 'average') {
        return movie.rating >= 5 && movie.rating < 8;
      } else if (selectedCategory === 'flop') {
        return movie.rating < 5;
      }
      return true;
    });
  }
}
