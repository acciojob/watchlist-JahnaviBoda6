package com.driver;

public class Movie {
    private String movieName;
    private int durationInMinutes;
    private double imbdRating;
    public Movie(){

    }
    public Movie(String movieName, int durationInMinutes, double imbdRating){
        this.movieName = movieName;
        this.durationInMinutes=durationInMinutes;
        this.imbdRating=imbdRating;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public double getImbdRating() {
        return imbdRating;
    }

    public void setImbdRating(double imbdRating) {
        this.imbdRating = imbdRating;
    }
}
