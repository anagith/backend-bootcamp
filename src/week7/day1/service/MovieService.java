package week7.day1.service;

import week7.day1.controller.model.MovieRequest;
import week7.day1.database.DataBase;
import week7.day1.exception.DuplicateElementException;
import week7.day1.service.model.Movie;

import java.util.List;


public class MovieService {

    private DataBase dataBase;

    public MovieService() {
        dataBase = new DataBase();
    }

    public Movie createMovie(MovieRequest request) {
        Movie movie = new Movie();
        movie.setGenre(request.getGenre());
        movie.setName(request.getName());
        movie.setID(calculateID());
        if (!haveDuplicates(movie)) {
            dataBase.getMovies().add(movie);
            return movie;
        }
        throw new DuplicateElementException("already exists");
    }

    public void getAllMovies() {
        System.out.println(dataBase);
    }

    public Movie getMovieById(int input) {
        List<Movie> movies = dataBase.getMovies();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getID() == input) {
                return movies.get(i);
            }
        }
        return null;
    }

    public void delete(Movie movie) {
        dataBase.getMovies().remove(movie);
    }

    public void changeMovieName(Movie movie, String name) {
        movie.setName(name);
    }

    public void changeMovieGenre(Movie movie, String genre) {
        movie.setGenre(MovieRequest.checkGenre(genre));
    }

    private boolean haveDuplicates(Movie movie) {
        for (int i = 0; i < dataBase.getMovies().size(); i++) {
            if (dataBase.getMovies().get(i).equals(movie)) {
                return true;
            }
        }
        return false;
    }

    private int calculateID() {
        return Movie.getCountId();
    }

}
