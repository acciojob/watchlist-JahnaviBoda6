package com.driver;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    MovieService service = new MovieService();
    @PostMapping("/add-movie")
    public ResponseEntity<String> addMovie(@RequestBody Movie movie){
        service.addMovie(movie);
        return new ResponseEntity<>("New movie added successfully", HttpStatus.CREATED);
    }
    @PostMapping("/add-director")
    public ResponseEntity<String> addDirector(@RequestBody Director director){
        service.addDirector(director);
        return new ResponseEntity<>("New Director added successfully",HttpStatus.CREATED);
    }
    @PutMapping("/add-movie-director-pair")
    public ResponseEntity<String> addMovieDirectorPair(@RequestParam String movie, @RequestParam String director){
        service.addMovieDirectorPair(movie, director);
        return new ResponseEntity<>("New movie-director pair added Successfully",HttpStatus.CREATED);
    }
    @GetMapping("/get-movie-by-name/{name}")
    public ResponseEntity<Movie> getMovieByName(@PathVariable String name){
        Movie movie = service.getMovieByName(name);
        return new ResponseEntity<>(movie,HttpStatus.CREATED);
    }
    @GetMapping("get-director-by-name/{name}")
    public ResponseEntity<Director> getDirectorByName(@PathVariable String name){
        Director director = service.getDirectorByName(name);
        return new ResponseEntity<>(director,HttpStatus.CREATED);
    }
    @GetMapping("/GET /movies/get-movies-by-director-name/{director}")
    public ResponseEntity<List<String>> getMoviesByDirectorName(@PathVariable String name){
        List<String> movies = service.getMoviesByDirectorName(name);
        return  new ResponseEntity<>(movies,HttpStatus.CREATED);
    }
    @GetMapping("/get-all-movies")
    public ResponseEntity<List<String>> findAllMovies(){
        List<String> allMovies = service.findAllMovies();
        return new ResponseEntity<>(allMovies, HttpStatus.CREATED);
    }
    @DeleteMapping("/delete-director-by-name")
    public ResponseEntity<String> deleteDirectorByName(String name){
        service.deleteDirectorByName(name);
        return new ResponseEntity<>(name + " removed successfully",HttpStatus.CREATED);
    }
    @DeleteMapping("/delete-all-directors")
    public ResponseEntity<String> deleteAllDirectors(){
        service.deleteAllDirectors();
        return new ResponseEntity<>("All Directors deleted successfully",HttpStatus.CREATED);
    }
}
