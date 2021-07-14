package week7.day1.controller.model;

import week7.day1.exception.IllegalGenreException;
import week7.day1.exception.WrongInputException;
import week7.day1.service.model.Genre;

public class MovieRequest {

    private String name;
    private Genre genre;

    public MovieRequest() {
    }

    public MovieRequest requestForCreation(String input) throws WrongInputException {
        String[] split = input.split(":");
        if(split.length<2){
            throw new WrongInputException("Wrong input");
        }
        setName(split[0]);
        setGenre(checkGenre(split[1]));
        return this;
    }

    public static Genre checkGenre(String input) {
        if (input.equalsIgnoreCase("horror")) {
            return Genre.HORROR;
        } else if (input.equalsIgnoreCase("trailer")) {
            return Genre.TRAILER;
        } else if (input.equalsIgnoreCase("drama")) {
            return Genre.DRAMA;
        }
        throw new IllegalGenreException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

}
