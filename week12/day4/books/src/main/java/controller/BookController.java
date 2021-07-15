package controller;

import entity.Book;
import util.Genre;
import service.AuthorService;
import service.BookService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookController {
    public static void main(String[] args) throws SQLException {
        while (true) {
            System.out.println("""
                    Enter 1:for Create
                    Enter 2:for ReadAll
                    Enter 3:for Search By Title
                    Enter 4:for Update
                    Enter 5:for Delete
                    """);
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 1) {
                create();
            } else if (choice == 2) {
                readAll();
            } else if (choice == 3) {
                searchByTitle();
            } else if (choice == 4) {
                update();
            } else if (choice == 5) {
                delete();
            } else {
                break;
            }
        }
    }

    private static void update() throws SQLException {

        BookService.printBooks();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an id");
        int id = scanner.nextInt();
        System.out.println("""
                Enter 1:change title
                Enter 2:change genre
                """);
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Please enter new title");
            Scanner scanner1 = new Scanner(System.in);
            String title = scanner1.nextLine();
            changeName(id, title);
        } else if (choice == 2) {
            int inputGenre = getGenre(scanner);
            Genre genre = checkAndReturnGenre(inputGenre);
            changeGenre(id, genre);
        }
    }

    private static void changeGenre(int id, Genre genre) throws SQLException {
        BookService.changeGenre(id, genre);
    }

    private static void changeName(int id, String title) throws SQLException {
        BookService.changeName(id, title);
    }

    private static void searchByTitle() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        String title = getTitle(scanner);
        BookService.searchByTitle(title);
    }

    private static void readAll() throws SQLException {
        BookService.readAll();
    }

    private static void delete() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        String title = getTitle(scanner);
        BookService.delete(title);
    }

    private static void create() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        String title = getTitle(scanner);
        int inputGenre = getGenre(scanner);
        Genre genre = checkAndReturnGenre(inputGenre);
        AuthorService.printAuthors();
        System.out.println("Enter number if authors");
        ArrayList<Integer> ids = new ArrayList<>();
        int count = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            System.out.println("Enter id of author");
            int id = scanner1.nextInt();
            ids.add(id);
        }
        Book book = new Book(title, genre);
        BookService.writeBook(book);
        BookService.writeBookAuthor(book, ids);
    }

    private static String getTitle(Scanner scanner) {
        System.out.println("Enter title of book");
        return scanner.nextLine();
    }

    private static int getGenre(Scanner scanner) {
        System.out.println("""
                Enter genre of book
                Enter 1:for Thriller
                Enter 2:for Drama
                Enter 3:for Detective
                Enter 4:for Horror
                Enter 5:for SCIENCE FICTION
                """
        );
        return scanner.nextInt();
    }

    private static Genre checkAndReturnGenre(int choice) {
        if (choice == 1) {
            return Genre.THRILLER;
        } else if (choice == 2) {
            return Genre.DRAMA;
        } else if (choice == 3) {
            return Genre.DETECTIVE;
        } else if (choice == 4) {
            return Genre.HORROR;
        } else if (choice == 5) {
            return Genre.SCIENCE_FICTION;
        }
        return null;
    }

}

