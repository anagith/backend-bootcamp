package com.example.animalhuman.facade;

import com.example.animalhuman.entity.Animal;
import com.example.animalhuman.entity.Human;
import com.example.animalhuman.requestmodel.AnimalRequest;
import com.example.animalhuman.requestmodel.HumanRequest;
import com.example.animalhuman.responsemodel.AnimalResponseModel;
import com.example.animalhuman.responsemodel.HumanResponseModel;
import com.example.animalhuman.service.AnimalService;
import com.example.animalhuman.service.HumanService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Facade {
    private final AnimalService animalService;
    private final HumanService humanService;

    public Facade(AnimalService animalService, HumanService humanService) {
        this.animalService = animalService;
        this.humanService = humanService;
    }

    public void createAnimal(AnimalRequest animalRequest) {
        Animal animal = animalService.convertRequestToEntity(animalRequest);
        animalService.create(animal);
    }

    public void createHuman(HumanRequest humanRequest) {
        Human human = humanService.convertRequestToEntity(humanRequest);
        humanService.create(human);
    }

    public AnimalResponseModel getAnimal(long id) {
        Animal animal = animalService.getAnimalById(id);
        return animalService.convertEntityToResponse(animal);
    }

    public HumanResponseModel getHuman(long id) {
        Human human = humanService.getHumanById(id);
        return humanService.convertEntityToResponse(human);
    }

    public void assignHumanToAnimal(long animalId, long humanId) {
        Animal animalById = animalService.getAnimalById(animalId);
        Human humanById = humanService.getHumanById(humanId);
        animalById.setOwner(humanById);
        animalService.update(animalById);
    }

    public void deleteAnimal(long id) {
        Animal animal = animalService.getAnimalById(id);
        animalService.delete(animal);
    }

    public void update(HumanRequest humanRequest, Long id){
        Human humanById = humanService.getHumanById(id);
        humanById.setName(humanRequest.getName());
        humanById.setSurname(humanRequest.getSurname());
        humanById.setAge(humanRequest.getAge());
        List<Long> animalsId = humanRequest.getAnimalsId();
        animalsId.forEach(aLong -> {
            animalService.getAnimalById(aLong).setOwner(humanById);
        });
        humanService.update(humanById);

    }
    public void update(AnimalRequest animalRequest, Long id) {
        Animal animalById = animalService.getAnimalById(id);
        animalById.setName(animalRequest.getName());
        animalById.setAge(animalRequest.getAge());
        animalById.setOwner(humanService.getHumanById(animalRequest.getOwnerId()));
        animalService.update(animalById);
    }

    public void deleteHuman(long id) {
        Human human = animalService.getHumanById(id);
        humanService.delete(human);
    }
}
