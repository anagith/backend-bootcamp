package com.example.animalhuman.service;

import com.example.animalhuman.dao.Dao;
import com.example.animalhuman.entity.Human;
import com.example.animalhuman.requestmodel.HumanRequest;
import com.example.animalhuman.responsemodel.HumanResponseModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class HumanService {
    private final Dao dao;

    public HumanService(Dao dao) {
        this.dao = dao;
    }

    public Human convertRequestToEntity(HumanRequest humanRequest){
        return new Human(humanRequest.getName(), humanRequest.getSurname(), humanRequest.getAge());
    }

    public void create(Human human){
        dao.createHuman(human);
    }

    public Human getHumanById(long id) {
        return dao.getHuman(id);
    }

    public HumanResponseModel convertEntityToResponse(Human human) {
        ArrayList<Long> animalsId = new ArrayList<>();
        human.getAnimals().forEach(animal -> {
            animalsId.add(animal.getId());
        });
        return new HumanResponseModel(human.getId(),human.getName(),human.getSurname(),human.getAge(),
                animalsId);
    }

    public void delete(Human human) {
        dao.deleteHuman(human);
    }

    public void update(Human humanById) {
        dao.updateHuman(humanById);
    }
}
