package com.semestral.eshop.controller;

import com.semestral.eshop.domain.SiteOrder;
import com.semestral.eshop.domain.dto.SiteOrderDto;
import com.semestral.eshop.domain.dto.SiteOrderRequest;
import com.semestral.eshop.domain.mapper.SiteOrderMapper;
import com.semestral.eshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;
    private final SiteOrderMapper siteOrderMapper;
    @Autowired
    public OrderController(OrderService orderService, SiteOrderMapper siteOrderMapper) {
        this.orderService = orderService;
        this.siteOrderMapper = siteOrderMapper;
    }

    @GetMapping
    public List<SiteOrderDto> getAll(){
        List<SiteOrder> temp = orderService.findAll();
        return temp.stream().map(siteOrderMapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SiteOrderDto> getById(@PathVariable Long id){
        Optional<SiteOrder> temp = orderService.findById(id);
        Optional<SiteOrderDto> toRet = Optional.ofNullable( siteOrderMapper.toDto( temp.get() ) );
        return toRet.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public SiteOrderDto create( @RequestBody SiteOrderRequest request) {
        SiteOrder temp = orderService.create(request);
        return siteOrderMapper.toDto( temp );
    }

    @PutMapping("/{id}")
    public ResponseEntity<SiteOrderDto> update(@PathVariable Long id, @RequestBody SiteOrderDto toUpdate){
        Optional<SiteOrder> temp = orderService.findById(id);
        if( temp.isEmpty() ){
            return ResponseEntity.notFound().build();
        }
        toUpdate.setId(id);
        try {
            SiteOrder toRet = orderService.update(siteOrderMapper.fromDto(toUpdate));
            return ResponseEntity.ok( siteOrderMapper.toDto(toRet)  );
        }catch (NoSuchElementException e ){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        Optional<SiteOrder> temp = orderService.findById(id);

        if ( temp.isEmpty() ) {
            return ResponseEntity.notFound().build();
        }
        orderService.delete(id);
        return ResponseEntity.noContent().build();
    }
}