package com.example.animalhuman.controller;

import com.example.animalhuman.facade.Facade;
import com.example.animalhuman.requestmodel.AnimalRequest;
import com.example.animalhuman.responsemodel.AnimalResponseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AnimalController {

    private final Facade facade;

    public AnimalController(Facade facade) {
        this.facade = facade;
    }

    @RequestMapping(value = "/animal", method = RequestMethod.POST)
    public void createAnimal(@RequestBody AnimalRequest animalRequest) {
        facade.createAnimal(animalRequest);
    }

    @RequestMapping(value = "/animal/{id}", method = RequestMethod.GET)
    public ResponseEntity<AnimalResponseModel> getAnimal(@PathVariable long id) {
        AnimalResponseModel animal = facade.getAnimal(id);
        return ResponseEntity.accepted().body(animal);
    }

    @RequestMapping(value = "/assign/{animalId}/{humanId}", method = RequestMethod.PUT)
    public void addHuman(@PathVariable long animalId, @PathVariable long humanId) {
        facade.assignHumanToAnimal(animalId, humanId);
    }

    @RequestMapping(value = "animal/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id) {
        facade.deleteAnimal(id);
    }

    @RequestMapping(value = "animal/{id}", method = RequestMethod.PUT)
    public void update(@RequestBody AnimalRequest animalRequest, @PathVariable long id) {
        facade.update(animalRequest, id);
    }

}
