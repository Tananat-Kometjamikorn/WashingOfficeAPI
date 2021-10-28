package th.ac.ku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.model.Branch;
import th.ac.ku.repository.BranchRepository;

import java.util.List;

@Service
public class BranchService {

    @Autowired
    private BranchRepository repository;

    public List<Branch> getAll() {
        return repository.findAll();
    }

    public Branch getBranch(String username){
        return repository.findById(username).orElse(null);
    }

    public Branch create(Branch branch){
        repository.save(branch);
        return branch;
    }

    public Branch update(String username, Branch requestBody){
        Branch record = repository.findById(username).orElse(null);
        if (record != null && requestBody.getPassword()!=null) {
                record.setPassword(requestBody.getPassword());
        }
        else throw new IllegalArgumentException("api branch error");
        repository.saveAndFlush(record);
        return record;
    }
}
