package th.ac.ku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.model.Cloth;
import th.ac.ku.service.ClothService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cloth")
public class ClothController {

    @Autowired
    ClothService service;

    @GetMapping
    public List<Cloth> getAll(){
        return service.getAll();
    }

    @GetMapping("/{orderId}")
    public Cloth getCloth(@PathVariable int orderId){
        return service.getCloth(orderId);
    }

    @PostMapping
    public Cloth create(@RequestBody Cloth cloth){
        return service.create(cloth);
    }


}
