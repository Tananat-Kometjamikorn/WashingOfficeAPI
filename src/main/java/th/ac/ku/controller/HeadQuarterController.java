package th.ac.ku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.model.HeadQuarter;
import th.ac.ku.service.HeadQuarterService;

import java.util.List;

@RestController
@RequestMapping("/headQuarter")
public class HeadQuarterController {

    @Autowired
    HeadQuarterService service;

    @GetMapping
    public List<HeadQuarter> getAll(){
        return service.getAll();
    }

    @GetMapping("/{username}")
    public HeadQuarter getHeadQuarter(@PathVariable String username){
        return service.getHeadQuarter(username);
    }

    @PostMapping
    public HeadQuarter create(@RequestBody HeadQuarter headQuarter){
        return service.create(headQuarter);
    }

    @PutMapping("/{username}")
    public HeadQuarter update(@PathVariable String username,@RequestBody HeadQuarter headQuarter){
        return service.update(username,headQuarter);
    }

}
