package com.example.animalhuman.service;

import com.example.animalhuman.dao.Dao;
import com.example.animalhuman.entity.Animal;
import com.example.animalhuman.entity.Human;
import com.example.animalhuman.requestmodel.AnimalRequest;
import com.example.animalhuman.responsemodel.AnimalResponseModel;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {
    private final Dao dao;

    public AnimalService(Dao dao) {
        this.dao = dao;
    }

    public Animal convertRequestToEntity(AnimalRequest animalRequest) {
        return new Animal(animalRequest.getName(), animalRequest.getAge());
    }

    public AnimalResponseModel convertEntityToResponse(Animal animal) {
        if (animal.getOwner() == null) {
            return new AnimalResponseModel(animal.getId(), animal.getName(), animal.getAge());
        }
        return new AnimalResponseModel(animal.getId(), animal.getName(), animal.getAge(), animal.getOwner().getId());
    }


    public void update(Animal animal) {
        dao.updateAnimal(animal);
    }

    public void create(Animal animal) {
        dao.createAnimal(animal);
    }

    public Animal getAnimalById(long id) {
        return dao.getAnimal(id);
    }

    public void delete(Animal animal) {
        dao.deleteAnimal(animal);
    }

    public Human getHumanById(long id) {
        return dao.getHuman(id);
    }
}
