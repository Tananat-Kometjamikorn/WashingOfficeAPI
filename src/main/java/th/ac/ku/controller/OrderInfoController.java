package th.ac.ku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.model.OrderInfo;
import th.ac.ku.service.OrderInfoService;

import java.util.List;

@RestController
@RequestMapping("/orderInfo")
public class OrderInfoController {

    @Autowired
    OrderInfoService service;

    @GetMapping
    public List<OrderInfo> getAll(){
        return service.getAll();
    }

    @GetMapping("/{order_id}")
    public OrderInfo getOrderInfo(@PathVariable int order_id){
        return service.getOrderInfo(order_id);
    }

    @PostMapping
    public OrderInfo create(@RequestBody OrderInfo orderInfo){
        return service.create(orderInfo);
    }

    @DeleteMapping("/{order_id}")
    public void delete(@PathVariable int order_id){
        service.delete(order_id);
    }
}
