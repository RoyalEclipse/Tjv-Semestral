package com.semestral.eshop.controller;

import com.semestral.eshop.domain.SiteOrder;
import com.semestral.eshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;
    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<SiteOrder> getAll(){
        return orderService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SiteOrder> getById(@PathVariable Long id){
        Optional<SiteOrder> temp = orderService.findById(id);
        return temp.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public SiteOrder create( @RequestBody SiteOrder toCreate) {
        return orderService.create(toCreate);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SiteOrder> update(@PathVariable Long id, @RequestBody SiteOrder toUpdate){
        Optional<SiteOrder> temp = orderService.findById(id);
        if( temp.isEmpty() ){
            return ResponseEntity.notFound().build();
        }
        toUpdate.setId(id);
        return ResponseEntity.ok( orderService.update(toUpdate) );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        Optional<SiteOrder> temp = orderService.findById(id);

        if ( temp.isEmpty() ) {
            return ResponseEntity.notFound().build();
        }
        orderService.delete(id);
        return ResponseEntity.ok().build();
    }
}
