package th.ac.ku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.model.Cloth;
import th.ac.ku.repository.ClothRepository;

import java.util.List;

@Service
public class ClothService {
    @Autowired
    private ClothRepository repository;

    public List<Cloth> getAll(){
        return repository.findAll();
    }

    public Cloth getCloth(int orderId){
        return repository.findById(orderId).orElse(null);
    }

    public Cloth create(Cloth cloth){
        repository.save(cloth);
        return cloth;
    }

}
