package com.driver;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    MovieRepository repository = new MovieRepository();
    public void addMovie(Movie movie){
        repository.addMovie(movie);
    }

    public void addDirector(Director director) {
        repository.addDirector(director);
    }

    public void addMovieDirectorPair(String movie, String director) {
        repository.addMovieDirectorPair(movie, director);
    }
    public Movie getMovieByName(String name){
        return repository.getMovieByName(name);
    }
    public Director getDirectorByName(String name){
        return repository.getDirectorByName(name);
    }
    public List<String> getMoviesByDirectorName(String name){
        return repository.getMoviesByDirectorName(name);
    }

    public List<String> findAllMovies() {
        return repository.findAllMovies();
    }

    public void deleteDirectorByName(String name) {
        repository.deleteDirectorByName(name);
    }

    public void deleteAllDirectors() {
        repository.deleteAllDirectors();
    }
}
