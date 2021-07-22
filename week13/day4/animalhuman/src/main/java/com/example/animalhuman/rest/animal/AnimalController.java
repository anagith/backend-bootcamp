package com.example.animalhuman.rest.animal;

import com.example.animalhuman.rest.model.AnimalResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.animalhuman.rest.model.AnimalRequest;
import com.example.animalhuman.service.AnimalService;

@RestController
public class AnimalController {
    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;

    }

    @RequestMapping(value = "/animal", method = RequestMethod.POST)
    public void create(@RequestBody AnimalRequest request) {
        animalService.crete(request);
    }

    @RequestMapping(value = "/animal/{id}", method = RequestMethod.GET)
    public ResponseEntity<AnimalResponse> get(@PathVariable Long id) {
        AnimalResponse response = animalService.getAnimalById(id);
        return ResponseEntity.accepted().body(response);
    }


    @RequestMapping(value = "/animal/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable Long id, @RequestBody AnimalRequest request) {
        animalService.update(id, request);
    }

    @RequestMapping(value = "/animal/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        animalService.delete(id);
    }

    @RequestMapping(value = "/assign/{animalId}/{humanId}", method = RequestMethod.PUT)
    public void assign(@PathVariable Long animalId, @PathVariable Long humanId) {
        animalService.assign(animalId, humanId);
    }
}
