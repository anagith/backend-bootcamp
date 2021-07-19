package controller;

import entity.Animal;
import entity.Human;
import facade.Facade;
import service.AnimalService;
import service.HumanService;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanController {

    private Facade facade;

    public void start() {
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

    private void delete() {
        System.out.println("Please enter id");
        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();
        Human humanById = facade.getHuman(id);
        facade.deleteHuman(humanById);
    }

    private void update() {
        System.out.println("Please enter id");
        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();
        Human human = facade.getHuman(id);
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

    private void updateAnimalList(Human human) {
        System.out.println("Please enter count of animals");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Please enter id of animal");
            long animalId = scanner.nextLong();
            Animal animalById = facade.getAnimal(animalId);
            animalById.setOwner(human);
            facade.updateAnimal(animalById);
            animals.add(animalById);
        }
        human.setAnimals(animals);
        facade.updateHuman(human);
    }

    private void updateAge(Human human) {
        System.out.println("Please enter new age");
        Scanner scanner1 = new Scanner(System.in);
        int newAge = scanner1.nextInt();
        human.setAge(newAge);
        facade.updateHuman(human);
    }

    private void updateSurname(Human human) {
        System.out.println("Please enter new surname");
        Scanner scanner1 = new Scanner(System.in);
        String newSurname = scanner1.nextLine();
        human.setSurname(newSurname);
        facade.updateHuman(human);
    }

    private void updateName(Human human) {
        System.out.println("Please enter new name");
        Scanner scanner1 = new Scanner(System.in);
        String newName = scanner1.nextLine();
        human.setName(newName);
        facade.updateHuman(human);

    }

    private void read() {
        System.out.println("Please enter id");
        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();
        Human humanById = facade.getHuman(id);
        System.out.println(humanById);
        humanById.getAnimals().forEach(animal -> {
                    System.out.println(animal.toStringWithoutOwner());
                }
        );
    }

    private void create() {
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
        facade.createHuman(human);

        for (int i = 0; i < count; i++) {
            facade.createAnimalAndHuman(human);
        }
        facade.updateHuman(human);
    }




    public void setFacade(Facade facade) {
        this.facade = facade;
    }
}
