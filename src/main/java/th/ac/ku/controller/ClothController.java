package th.ac.ku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

    @GetMapping("/{order_id}")
    public Cloth getCloth(@PathVariable UUID order_id){
        return service.getCloth(order_id);
    }

    @PostMapping
    public Cloth create(@RequestBody Cloth cloth){
        return service.create(cloth);
    }

    @PutMapping("/{order_id}")
    public Cloth updateStatus(@PathVariable UUID order_id,@RequestBody Cloth branch){
        return service.updateStatus(order_id,branch);
    }
}
