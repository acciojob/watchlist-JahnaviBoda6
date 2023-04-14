package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class MovieRepository {
    HashMap<String, Movie> movieDb = new HashMap<>();
    HashMap<String, Director> directorDb = new HashMap<>();
    HashMap<String, ArrayList<String>> directorMoviePairDb = new HashMap<String, ArrayList<String>>();


    public void addMovie(Movie movie) {
        movieDb.put(movie.getMovieName(), movie);
    }

    public void addDirector(Director director) {
        directorDb.put(director.getDirectorName(), director);
    }

    public void addMovieDirectorPair(String movie, String director) {
        if(!directorMoviePairDb.containsKey(movie)){
            directorMoviePairDb.put(director,new ArrayList<>());
        }
        directorMoviePairDb.get(director).add(movie);
    }
    public Movie getMovieByName(String name){
        return movieDb.get(name);
    }
    public Director getDirectorByName(String name){
        return directorDb.get(name);
    }
    public List<String> getMoviesByDirectorName(String name){
        return directorMoviePairDb.get(name);
    }

    public List<String> findAllMovies() {
        ArrayList<String> movies = new ArrayList<>();
        for(Movie movie : movieDb.values()){
            movies.add(movie.getMovieName());
        }
        return movies;
    }

    public void deleteDirectorByName(String name) {
        directorDb.remove(name);
        //delete movies related to that director in movieDb also
        //delete director in directorMoviepairDb also
        for(String movie : directorMoviePairDb.get(name)){
            movieDb.remove(movie);
        }
        directorMoviePairDb.remove(name);
    }

    public void deleteAllDirectors() {
        directorDb.clear();
        for(ArrayList<String> movies : directorMoviePairDb.values()){
            for(String movie : movies){
                movieDb.remove(movie);
            }
        }
        directorMoviePairDb.clear();
    }
}
