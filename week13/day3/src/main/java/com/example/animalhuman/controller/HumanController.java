package com.example.animalhuman.controller;

import com.example.animalhuman.facade.Facade;
import com.example.animalhuman.requestmodel.HumanRequest;
import com.example.animalhuman.responsemodel.HumanResponseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HumanController {
    private final Facade facade;

    public HumanController(Facade facade) {
        this.facade = facade;
    }

    @RequestMapping(value = "/human", method = RequestMethod.POST)
    public void createHuman(@RequestBody HumanRequest humanRequest) {
        facade.createHuman(humanRequest);
    }

    @RequestMapping(value="/human/{id}",method = RequestMethod.GET)
    public ResponseEntity<HumanResponseModel> getHuman(@PathVariable long id){
        HumanResponseModel human = facade.getHuman(id);
        return ResponseEntity.accepted().body(human);
    }

    @RequestMapping(value = "human/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id){
        facade.deleteHuman(id);
    }

    @RequestMapping(value = "human/{id}", method = RequestMethod.PUT)
    public void update(@RequestBody HumanRequest humanRequest,@PathVariable long id){
        facade.update(humanRequest,id);
    }

}
