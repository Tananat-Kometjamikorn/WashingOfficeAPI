package th.ac.ku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.model.OrderBill;
import th.ac.ku.service.OrderBillService;

import java.util.List;

@RestController
@RequestMapping("/orderBill")
public class OrderBillController {

    @Autowired
    OrderBillService service;

    @GetMapping
    public List<OrderBill> getAll(){
        return service.getAll();
    }

    @GetMapping("/{order_id}")
    public OrderBill getOrderBill(@PathVariable int order_id){
        return service.getOrderBill(order_id);
    }

    @PostMapping
    public OrderBill create(@RequestBody OrderBill orderbill){
        return service.create(orderbill);
    }
}
