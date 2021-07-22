package com.example.animalhuman.service.impl;

import com.example.animalhuman.persistance.human.entity.Human;
import org.springframework.stereotype.Service;
import com.example.animalhuman.persistance.animal.AnimalRepository;
import com.example.animalhuman.persistance.animal.entity.Animal;
import com.example.animalhuman.rest.model.AnimalRequest;
import com.example.animalhuman.rest.model.AnimalResponse;
import com.example.animalhuman.service.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService {
    private final AnimalRepository animalRepository;
    private final HumanServiceImpl humanService;

    public AnimalServiceImpl(AnimalRepository animalRepository, HumanServiceImpl humanService) {
        this.animalRepository = animalRepository;
        this.humanService = humanService;
    }

    @Override
    public void crete(AnimalRequest request) {
        Animal animal = new Animal();
        buildEntityFromRequest(animal, request);
        animalRepository.save(animal);
    }

    @Override
    public AnimalResponse getAnimalById(Long id) {
        Animal animal = animalRepository.getById(id);
        return buildResponseFromEntity(animal);
    }

    @Override
    public void delete(Long id) {
        animalRepository.deleteById(id);
    }

    @Override
    public void update(Long id, AnimalRequest request) {
        Animal animal = animalRepository.getById(id);
        buildEntityFromRequest(animal, request);
        animalRepository.save(animal);

    }

    @Override
    public void assign(Long animalId, Long humanId) {
        Animal animal = animalRepository.getById(animalId);
        Human human = humanService.getAnimalEntityById(humanId);
        animal.setOwner(human);
        animalRepository.save(animal);
    }

    private Animal buildEntityFromRequest(Animal animal, AnimalRequest request) {
        animal.setName(request.getName());
        animal.setAge(request.getAge());
        return animal;
    }

    private AnimalResponse buildResponseFromEntity(Animal animal) {
        AnimalResponse response = new AnimalResponse();
        response.setId(animal.getId());
        response.setName(animal.getName());
        response.setAge(animal.getAge());
        response.setOwnerId(animal.getOwner().getId());
        return response;
    }

    public Animal getAnimalEntityById(Long animalId) {
        return animalRepository.getById(animalId);
    }
}
