package th.ac.ku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.model.Branch;
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

    @GetMapping("/{h_username}")
    public HeadQuarter getHeadQuarter(@PathVariable String h_username){
        return service.getHeadQuarter(h_username);
    }

    @PostMapping
    public HeadQuarter create(@RequestBody HeadQuarter headQuarter){
        return service.create(headQuarter);
    }

    @PutMapping("/{h_username}")
    public HeadQuarter updatePassword(@PathVariable String h_username,@RequestBody HeadQuarter headQuarter){
        return service.updatePassword(h_username,headQuarter);
    }

}
