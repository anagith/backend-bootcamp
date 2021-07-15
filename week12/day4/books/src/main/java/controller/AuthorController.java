package controller;

import entity.Author;
import service.AuthorService;
import service.BookService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AuthorController {
    public static void main(String[] args) throws SQLException {
        while (true) {
            System.out.println("""
                    Enter 1:for Create
                    Enter 2:for Delete
                    """);
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 1) {
                create();
            } else if (choice == 2) {
                delete();
            } else {
                break;
            }
        }
    }

    private static void delete() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        String name = getName(scanner);
        AuthorService.delete(name);
    }

    private static String getName(Scanner scanner) {
        System.out.println("Enter name of author");
        return scanner.nextLine();
    }

    private static void create() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of author");
        String name = scanner.nextLine();
        Author author = new Author(name);
        AuthorService.writeAuthor(author);
    }

}
