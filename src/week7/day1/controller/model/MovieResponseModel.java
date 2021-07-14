package week7.day1.controller.model;

import week7.day1.service.model.Genre;

public class MovieResponseModel {

    private String name;
    private Genre genre;

    public MovieResponseModel() {
    }

    public MovieResponseModel(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
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

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                '}';
    }
}
