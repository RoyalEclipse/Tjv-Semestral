package com.semestral.eshop.controller;

import com.semestral.eshop.domain.Warehouse;
import com.semestral.eshop.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {
    private final WarehouseService warehouseService;
    @Autowired
    public WarehouseController(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @GetMapping
    public List<Warehouse> getAll(){
        return warehouseService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Warehouse> getById(@PathVariable Long id){
        Optional<Warehouse> temp = warehouseService.findById(id);
        return temp.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Warehouse create( @RequestBody Warehouse toCreate) {
        return warehouseService.create(toCreate);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Warehouse> update(@PathVariable Long id, @RequestBody Warehouse toUpdate){
        Optional<Warehouse> temp = warehouseService.findById(id);
        if( temp.isEmpty() ){
            return ResponseEntity.notFound().build();
        }
        toUpdate.setId(id);
        return ResponseEntity.ok( warehouseService.update(toUpdate) );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        Optional<Warehouse> temp = warehouseService.findById(id);

        if ( temp.isEmpty() ) {
            return ResponseEntity.notFound().build();
        }
        warehouseService.delete(id);
        return ResponseEntity.ok().build();
    }
}
