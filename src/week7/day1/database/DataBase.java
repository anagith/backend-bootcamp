package week7.day1.database;

import week7.day1.service.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Movie> movies = new ArrayList<>();

    public List<Movie> getMovies() {
        return movies;
    }

}
