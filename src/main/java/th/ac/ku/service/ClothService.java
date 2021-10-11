package th.ac.ku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.model.Cloth;
import th.ac.ku.repository.ClothRepository;

import java.util.List;
import java.util.UUID;

@Service
public class ClothService {
    @Autowired
    private ClothRepository repository;

    public List<Cloth> getAll(){
        return repository.findAll();
    }

    public Cloth getCloth(UUID order_id){
        return repository.findById(order_id).orElse(null);
    }

    public Cloth update(UUID order_id, Cloth requestBody){
        Cloth record = repository.findById(order_id).orElse(null);
        if (record != null) {
            record.setStatus(requestBody.getStatus());
            repository.saveAndFlush(record);
        }
        return record;
    }

}
