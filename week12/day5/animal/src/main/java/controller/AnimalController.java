package controller;

import entity.Animal;
import entity.Human;
import service.AnimalService;
import service.HumanService;

import java.util.Scanner;

public class AnimalController {
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

        Animal animal = AnimalService.getAnimalById(id);
        removeAnimalFromOwnerList(animal);

        AnimalService.delete(animal);
    }

    private static void update() {
        System.out.println("Please enter id");
        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();
        Animal animal = AnimalService.getAnimalById(id);
        System.out.println("""
                Press 1:if you want to change name
                Press 2:if you want to change age
                Press 3:if you want to change owner
                """);
        int choice = scanner.nextInt();
        if (choice == 1) {
            updateName(animal);
        } else if (choice == 2) {
            updateAge(animal);
        } else if (choice == 3) {
            updateOwner(animal);
        }
    }

    private static void updateOwner(Animal animal) {
        removeAnimalFromOwnerList(animal);

        System.out.println("Please enter new owners id");
        Scanner scanner1 = new Scanner(System.in);
        long ownerNewId = scanner1.nextLong();

        Human humanById = HumanService.getHumanById(ownerNewId);
        animal.setOwner(humanById);
        humanById.getAnimals().add(animal);
        HumanService.update(humanById);
        AnimalService.update(animal);
    }

    public static void removeAnimalFromOwnerList(Animal animal) {
        Human oldOwner = animal.getOwner();
        oldOwner.getAnimals().remove(animal);
    }

    private static void updateAge(Animal animal) {
        System.out.println("Please enter new age");
        Scanner scanner1 = new Scanner(System.in);
        int newAge = scanner1.nextInt();
        animal.setAge(newAge);
        AnimalService.update(animal);
    }

    private static void updateName(Animal animal) {
        System.out.println("Please enter new name");
        Scanner scanner1 = new Scanner(System.in);
        String newName = scanner1.nextLine();
        animal.setName(newName);
        AnimalService.update(animal);
    }

    private static void read() {
        System.out.println("Please enter id");
        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();
        Animal animal = AnimalService.getAnimalById(id);
        System.out.println(animal);
    }

    public static void create() {
        System.out.println("Please enter name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Please enter age");
        int age = scanner.nextInt();
        System.out.println("Please enter id of owner");
        long ownerId = scanner.nextLong();

        Human owner = HumanService.getHumanById(ownerId);
        Animal animal = new Animal(name, age, owner);
        HumanService.updateAnimalList(owner, animal);
        AnimalService.create(animal);
    }

    public static void create(Human human) {
        System.out.println("Please enter name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Please enter age");
        int age = scanner.nextInt();

        Animal animal = new Animal(name, age, human);
        HumanService.updateAnimalList(human, animal);
        AnimalService.create(animal);
    }

}
