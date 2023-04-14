package com.driver;

public class Director {
    private String directorName;
    private int numberOfMovies;
    private double imbdRating;

    public Director() {
    }

    public Director(String directorName, int numberOfMovies, double imbdRating) {
        this.directorName = directorName;
        this.numberOfMovies = numberOfMovies;
        this.imbdRating = imbdRating;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    public double getImbdRating() {
        return imbdRating;
    }

    public void setImbdRating(double imbdRating) {
        this.imbdRating = imbdRating;
    }
}
