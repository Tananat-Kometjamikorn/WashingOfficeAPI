package th.ac.ku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.model.Branch;
import th.ac.ku.model.HeadQuarter;
import th.ac.ku.repository.BranchRepository;
import th.ac.ku.repository.HeadQuarterRepository;

import java.util.List;

@Service
public class HeadQuarterService {
    @Autowired
    private HeadQuarterRepository repository;

    public List<HeadQuarter> getAll() {
        return repository.findAll();
    }

    public HeadQuarter create(HeadQuarter headQuarter){
        repository.save(headQuarter);
        return headQuarter;
    }

    public HeadQuarter update(String b_username, HeadQuarter requestBody){
        HeadQuarter record = repository.findById(b_username).orElse(null);
        if (record != null && requestBody.getH_password()!=null) {
            record.setH_password(requestBody.getH_password());
        }
        else throw new IllegalArgumentException("Fill all blank lines");
        repository.saveAndFlush(record);
        return record;
    }
}
