package facade;

import entity.Animal;
import entity.Human;
import service.AnimalService;
import service.HumanService;

import java.util.Scanner;


public class Facade {
    private HumanService humanService;
    private AnimalService animalService;

    public Facade() {
    }

    public void createHuman(Human human) {
        humanService.create(human);
    }

    public Human getHuman(long id) {
        return humanService.getHumanById(id);
    }

    public void updateHuman(Human human) {
        humanService.update(human);
    }

    public void deleteHuman(Human human) {
        humanService.delete(human);
    }

    public void createAnimal(Animal animal) {
        animalService.create(animal);
    }

    public Animal getAnimal(long id) {
        return animalService.getAnimalById(id);
    }

    public void updateAnimal(Animal animal) {
        animalService.update(animal);
    }

    public void deleteAnimal(Animal animal) {
        animalService.delete(animal);
    }

    public void updateAnimalList(Human owner, Animal animal) {
        humanService.updateAnimalList(owner, animal);
    }

    public void setAnimalService(AnimalService animalService) {
        this.animalService = animalService;
    }

    public void setHumanService(HumanService humanService) {
        this.humanService = humanService;
    }

    public void createAnimalAndHuman(Human human) {
        System.out.println("Please enter name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Please enter age");
        int age = scanner.nextInt();

        Animal animal = new Animal(name, age, human);
        humanService.updateAnimalList(human, animal);
        animalService.create(animal);
    }
}
