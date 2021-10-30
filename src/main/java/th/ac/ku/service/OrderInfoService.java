package th.ac.ku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.model.Cloth;
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

    public OrderInfo getOrderInfo(int orderId){
        return repository.findById(orderId).orElse(null);
    }

    public OrderInfo create(OrderInfo orderInfo){
        System.out.println("---------------------------------");
        System.out.println(orderInfo.getOrderBill().toString());
        System.out.println(orderInfo.getCloth().toString());
        repository.save(orderInfo);
        return orderInfo;
    }

    public void delete(int orderId){
        OrderInfo record = repository.findById(orderId).orElse(null);
        repository.deleteById(orderId);
    }

    public void update(int orderId, OrderInfo requestBody){
        OrderInfo record = repository.findById(orderId).orElse(null);
        if (record != null) {
            System.out.println("----------------------");
            System.out.println(requestBody.getOrderBill().getCleanStatus());
            record.getOrderBill().setCleanStatus(requestBody.getOrderBill().getCleanStatus());
            record.getOrderBill().setCost(requestBody.getOrderBill().getCost());
            record.getCloth().setStatus(requestBody.getCloth().getStatus());
            record.setClosedDate(requestBody.getClosedDate());
            repository.saveAndFlush(record);
        }
    }
}
