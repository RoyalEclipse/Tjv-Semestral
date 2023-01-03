package com.semestral.eshop.controller;

import com.semestral.eshop.domain.Warehouse;
import com.semestral.eshop.domain.dto.WarehouseDto;
import com.semestral.eshop.domain.mapper.WarehouseMapper;
import com.semestral.eshop.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {
    private final WarehouseService warehouseService;
    private final WarehouseMapper warehouseMapper;
    @Autowired
    public WarehouseController(WarehouseService warehouseService, WarehouseMapper warehouseMapper) {
        this.warehouseService = warehouseService;
        this.warehouseMapper = warehouseMapper;
    }

    @GetMapping
    public List<WarehouseDto> getAll(){
        List<Warehouse> temp = warehouseService.findAll();
        return temp.stream().map(warehouseMapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<WarehouseDto> getById(@PathVariable Long id){
        Optional<Warehouse> temp = warehouseService.findById(id);
        Optional<WarehouseDto> test = Optional.ofNullable(warehouseMapper.toDto(temp.get()));
        return test.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<WarehouseDto> create( @RequestBody WarehouseDto toCreate) {
        try {
            Warehouse temp = warehouseMapper.fromDto( toCreate );
            temp = warehouseService.create(temp);
            return ResponseEntity.ok( warehouseMapper.toDto(temp) );
        }
        catch ( NoSuchElementException e){
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<WarehouseDto> update(@PathVariable Long id, @RequestBody WarehouseDto toUpdate){
        Optional<Warehouse> temp = warehouseService.findById(id);
        if( temp.isEmpty() ){
            return ResponseEntity.notFound().build();
        }
        toUpdate.setId(id);
        Warehouse toRet = warehouseService.update( warehouseMapper.fromDto( toUpdate ) );
        return ResponseEntity.ok( warehouseMapper.toDto(toRet) );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        Optional<Warehouse> temp = warehouseService.findById(id);

        if ( temp.isEmpty() ) {
            return ResponseEntity.notFound().build();
        }
        warehouseService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
