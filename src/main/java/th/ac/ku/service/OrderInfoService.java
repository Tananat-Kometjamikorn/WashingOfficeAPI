package th.ac.ku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.model.OrderInfo;
import th.ac.ku.repository.OrderInfoRepository;

import java.util.List;
import java.util.UUID;

@Service
public class OrderInfoService {
    @Autowired
    private OrderInfoRepository repository;

    public List<OrderInfo> getAll() {
        return repository.findAll();
    }

    public OrderInfo getOrderInfo(int order_id){
        return repository.findById(order_id).orElse(null);
    }

    public OrderInfo create(OrderInfo orderInfo){
        repository.save(orderInfo);
        return orderInfo;
    }

    public OrderInfo delete(int order_id){
        OrderInfo record = repository.findById(order_id).orElse(null);
        repository.deleteById(order_id);
        return record;
    }
}
