package com.example.animalhuman.service.impl;

import com.example.animalhuman.persistance.animal.entity.Animal;
import com.example.animalhuman.persistance.human.HumanRepository;
import com.example.animalhuman.persistance.human.entity.Human;
import com.example.animalhuman.rest.model.HumanRequest;
import com.example.animalhuman.rest.model.HumanResponse;
import com.example.animalhuman.service.HumanService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class HumanServiceImpl implements HumanService {
    private final HumanRepository humanRepository;

    public HumanServiceImpl(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;

    }


    @Override
    public void crete(HumanRequest request) {
        Human human = new Human();
        buildEntityFromRequest(human,request);
        humanRepository.save(human);
    }

    @Override
    public HumanResponse getHumanById(Long id) {
        Human human = humanRepository.getById(id);
        return buildResponseFromEntity(human);
    }

    @Override
    public void delete(Long id) {
        humanRepository.deleteById(id);
    }

    @Override
    public void update(Long id, HumanRequest request) {
        Human human = humanRepository.getById(id);
        buildEntityFromRequest(human,request);
        humanRepository.save(human);
    }

    @Override
    public void assign(Long animalId, Long humanId) {

    }

    private HumanResponse buildResponseFromEntity(Human human) {
        HumanResponse response = new HumanResponse();
        response.setId(human.getId());
        response.setAge(human.getAge());
        response.setName(human.getName());
        response.setSurname(human.getSurname());
        ArrayList<Long> animalsId = new ArrayList<Long>();
        human.getAnimals().forEach(animal -> {
            animalsId.add(animal.getId());
        });
        response.setAnimalsId(animalsId);
        return response;
    }

    private Human buildEntityFromRequest(Human human, HumanRequest request) {
        human.setName(request.getName());
        human.setSurname(request.getSurname());
        human.setAge(request.getAge());
        return human;
    }

    public Human getAnimalEntityById(Long id) {
        return humanRepository.getById(id);
    }
}
