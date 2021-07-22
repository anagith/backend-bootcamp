package com.example.animalhuman.service;

import com.example.animalhuman.rest.model.AnimalRequest;
import com.example.animalhuman.rest.model.AnimalResponse;
import com.example.animalhuman.rest.model.HumanRequest;
import com.example.animalhuman.rest.model.HumanResponse;

public interface HumanService {
    public void crete(HumanRequest request);
    public HumanResponse getHumanById(Long id);
    public void delete(Long id);
    public void update(Long id,HumanRequest humanRequest);
    public void assign(Long animalId, Long humanId);
}
