package com.example.animalhuman.rest.human;

import com.example.animalhuman.rest.model.HumanRequest;
import com.example.animalhuman.rest.model.HumanResponse;
import com.example.animalhuman.service.HumanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HumanController {
    private final HumanService humanService;

    public HumanController(HumanService humanService) {
        this.humanService = humanService;
    }

    @RequestMapping(value = "/human",method = RequestMethod.POST)
    public void create(@RequestBody HumanRequest request){
        humanService.crete(request);
    }

    @RequestMapping(value = "/human/{id}",method = RequestMethod.GET)
    public ResponseEntity<HumanResponse> get(@PathVariable Long id){
        HumanResponse response = humanService.getHumanById(id);
        return ResponseEntity.accepted().body(response);
    }

    @RequestMapping(value = "/human/{id}",method = RequestMethod.PUT)
    public void update(@PathVariable Long id,@RequestBody HumanRequest request){
        humanService.update(id,request);
    }

    @RequestMapping(value = "/human/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        humanService.delete(id);
    }
}
