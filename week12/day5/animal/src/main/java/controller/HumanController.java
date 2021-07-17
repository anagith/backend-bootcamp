package controller;

import entity.Animal;
import entity.Human;
import service.AnimalService;
import service.HumanService;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanController {
    public static void start() {
        while (true) {
            System.out.println("""
                    Press 1:CREATE
                    Press 2:READ
                    Press 3:UPDATE
                    Press 4:DELETE
                    Press 0:EXIT
                    """);
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 1) {
                create();
            } else if (choice == 2) {
                read();
            } else if (choice == 3) {
                update();
            } else if (choice == 4) {
                delete();
            } else if (choice == 0) {
                break;
            }
        }
    }

    private static void delete() {
        System.out.println("Please enter id");
        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();
        Human humanById = HumanService.getHumanById(id);
        HumanService.delete(humanById);
    }

    private static void update() {
        System.out.println("Please enter id");
        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();
        Human human = HumanService.getHumanById(id);
        System.out.println("""
                Press 1:if you want to change name
                Press 2:if you want to change surname
                Press 3:if you want to change age
                Press 4:if you want ot change animal list
                """);
        int choice = scanner.nextInt();
        if (choice == 1) {
            updateName(human);
        } else if (choice == 2) {
            updateSurname(human);
        } else if (choice == 3) {
            updateAge(human);
        } else if (choice == 4) {
            updateAnimalList(human);
        }
    }

    private static void updateAnimalList(Human human) {
        System.out.println("Please enter count of animals");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Please enter id of animal");
            long animalId = scanner.nextLong();
            Animal animalById = AnimalService.getAnimalById(animalId);
            animalById.setOwner(human);
            AnimalService.update(animalById);
            animals.add(animalById);
        }
        human.setAnimals(animals);
        HumanService.update(human);
    }

    private static void updateAge(Human human) {
        System.out.println("Please enter new age");
        Scanner scanner1 = new Scanner(System.in);
        int newAge = scanner1.nextInt();
        human.setAge(newAge);
        HumanService.update(human);
    }

    private static void updateSurname(Human human) {
        System.out.println("Please enter new surname");
        Scanner scanner1 = new Scanner(System.in);
        String newSurname = scanner1.nextLine();
        human.setSurname(newSurname);
        HumanService.update(human);
    }

    private static void updateName(Human human) {
        System.out.println("Please enter new name");
        Scanner scanner1 = new Scanner(System.in);
        String newName = scanner1.nextLine();
        human.setName(newName);
        HumanService.update(human);

    }

    private static void read() {
        System.out.println("Please enter id");
        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();
        Human humanById = HumanService.getHumanById(id);
        System.out.println(humanById);
        humanById.getAnimals().forEach(animal -> {
                    System.out.println(animal.toStringWithoutOwner());
                }
        );
    }

    private static void create() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter name");
        String name = scanner.nextLine();

        System.out.println("Please enter surname");
        String surname = scanner.nextLine();

        System.out.println("Please enter age");
        int age = scanner.nextInt();

        System.out.println("Please enter count of animals");
        int count = scanner.nextInt();

        Human human = new Human(name, surname, age, new ArrayList<Animal>());
        HumanService.create(human);

        for (int i = 0; i < count; i++) {
            AnimalController.create(human);
        }
        HumanService.update(human);
    }
}
