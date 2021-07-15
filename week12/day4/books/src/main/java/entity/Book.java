package entity;

import util.Genre;

public class Book {
    private int id;
    private String title;
    private Genre genre;

    public Book(String title, Genre genre) {
        this.title = title;
        this.genre = genre;
    }

    public Book(int id, String title, Genre genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
