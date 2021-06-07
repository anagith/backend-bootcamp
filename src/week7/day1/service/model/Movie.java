package week7.day1.service.model;

import java.util.Objects;

public class Movie {

    private int ID;
    private String name;
    private Genre genre;
    private Director director;
    private static int countId;

    public Movie() {
        countId++;
    }

    public Movie(int ID, String name, Genre genre) {
        this.ID = ID;
        this.name = name;
        this.genre = genre;
        countId++;
    }

    public Movie(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
        countId++;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", genre=" + genre +
                '}';
    }

    public static int getCountId() {
        return countId;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(name, movie.name) && genre == movie.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, genre);
    }
}
