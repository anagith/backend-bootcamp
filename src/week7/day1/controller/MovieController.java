package week7.day1.controller;

import week7.day1.controller.model.MovieRequest;
import week7.day1.exception.DoesntExistException;
import week7.day1.service.MovieService;
import week7.day1.service.model.Movie;

import java.util.Scanner;

public class MovieController {

    private MovieService movieService;

    private final static Scanner SCANNER = new Scanner(System.in);

    public MovieController() {
        this.movieService = new MovieService();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        label:
        while (true) {
            printMenu();
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    create(scanner);
                    break;
                case "2":
                    readAll();
                    break;
                case "3":
                    getMovie(scanner);
                    break;
                case "4":
                    update();
                    break;
                case "5":
                    delete();
                    break;
                default:
                    break label;
            }
        }
    }

    private void update() {
        Movie movieById = getMovieById(getInput(SCANNER));
        if (movieById == null) {
            throw new DoesntExistException();
        }
        System.out.println("press 1 to change name" + "\n" +
                "press 2 to change genre" + "\n");
        int changeOption = SCANNER.nextInt();
        if (changeOption == 1) {
            System.out.println("Please enter new name");
            movieService.changeMovieName(movieById, SCANNER.next());
        } else if (changeOption == 2) {
            System.out.println("Please enter new genre");
            movieService.changeMovieGenre(movieById, SCANNER.next());
        }
    }

    private void delete() {
        Movie movieById = getMovieById(getInput(SCANNER));
        if (movieById == null) {
            throw new DoesntExistException();
        }
        movieService.delete(movieById);
    }

    private void getMovie(Scanner scanner) {
        int input = getInput(scanner);
        System.out.println(getMovieById(input));
    }

    private int getInput(Scanner scanner) {
        System.out.println("Please input id");
        return scanner.nextInt();
    }

    private void create(Scanner scanner) {
        String input = getNameAndGenre(scanner);
        System.out.println(createMovie(input));
    }

    private String getNameAndGenre(Scanner scanner) {
        System.out.println("Please input name and genre");
        return scanner.next();
    }

    private void printMenu() {
        System.out.println("Please input 1 for create " + "\n" +
                "Please input 2 for read all" + "\n" +
                "Please input 3 for read by ID" + "\n" +
                "Please input 4 for update" + "\n" +
                "Please input 5 for delete");
    }

    private Movie getMovieById(int input) {
        return movieService.getMovieById(input);
    }

    private void readAll() {

        movieService.getAllMovies();
    }

    private Movie createMovie(String input) {
        MovieRequest movieRequest = new MovieRequest();
        return movieService.createMovie(movieRequest.requestForCreation(input));
    }

}
