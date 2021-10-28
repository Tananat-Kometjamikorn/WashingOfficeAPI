package th.ac.ku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.model.Cloth;
import th.ac.ku.model.OrderInfo;
import th.ac.ku.service.OrderInfoService;

import java.util.List;

@RestController
@RequestMapping("/orderinfo")
public class OrderInfoController {

    @Autowired
    OrderInfoService service;

    @GetMapping
    public List<OrderInfo> getAll(){
        return service.getAll();
    }

    @GetMapping("/{orderId}")
    public OrderInfo getOrderInfo(@PathVariable int orderId){
        return service.getOrderInfo(orderId);
    }

    @PostMapping
    public OrderInfo create(@RequestBody OrderInfo orderInfo){
        return service.create(orderInfo);
    }

    @DeleteMapping("/{orderId}")
    public void delete(@PathVariable int orderId){
        service.delete(orderId);
    }

    @PutMapping("/{orderId}")
    public void update(@PathVariable int orderId, @RequestBody OrderInfo orderInfo){
        service.update(orderId,orderInfo);
    }
}
