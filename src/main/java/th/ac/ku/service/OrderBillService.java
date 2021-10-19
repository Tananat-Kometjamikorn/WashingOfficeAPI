package th.ac.ku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.model.OrderBill;
import th.ac.ku.repository.OrderBillRepository;

import java.util.List;
import java.util.UUID;

@Service
public class OrderBillService {
    @Autowired
    private OrderBillRepository repository;

    public List<OrderBill> getAll() {
        return repository.findAll();
    }

    public OrderBill getOrderBill(int orderId){
        return repository.findById(orderId).orElse(null);
    }

    public OrderBill create(OrderBill orderBill){
        repository.save(orderBill);
        return orderBill;
    }

}
