package com.example.animalhuman.service;


import org.springframework.stereotype.Service;
import com.example.animalhuman.rest.model.AnimalRequest;
import com.example.animalhuman.rest.model.AnimalResponse;

@Service
public interface AnimalService {
    public void crete(AnimalRequest request);
    public AnimalResponse getAnimalById(Long id);
    public void delete(Long id);
    public void update(Long id,AnimalRequest animalRequest);

    public void assign(Long animalId, Long humanId);
}
