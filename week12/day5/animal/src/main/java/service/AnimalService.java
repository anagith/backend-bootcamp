package service;

import dao.Dao;
import entity.Animal;
import entity.Human;

import java.util.Scanner;

public class AnimalService {
    private Dao dao;

    public void create(Animal animal) {
        dao.create(animal);
    }

    public Animal getAnimalById(long id) {
        return dao.getAnimal(id);
    }

    public void update(Animal animal) {
        dao.updateAnimal(animal);
    }

    public void delete(Animal animal) {
        dao.deleteAnimal(animal);
    }

    public void setAnimalDao(Dao dao) {
        this.dao = dao;
    }


}
