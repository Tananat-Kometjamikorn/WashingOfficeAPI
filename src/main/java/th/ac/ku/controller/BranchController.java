package th.ac.ku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.model.Branch;
import th.ac.ku.service.BranchService;

import java.util.List;

@RestController
@RequestMapping("/branch")
public class BranchController {

    @Autowired
    BranchService service;

    @GetMapping
    public List<Branch> getAll(){
        return service.getAll();
    }

    @GetMapping("/{username}")
    public Branch getBranch(@PathVariable String b_username){
        return service.getBranch(b_username);
    }

    @PostMapping
    public Branch create(@RequestBody Branch branch){
        return service.create(branch);
    }

    @PutMapping("/{username}")
    public Branch updatePassword(@PathVariable String username,@RequestBody Branch branch){
        return service.update(username,branch);
    }
}
