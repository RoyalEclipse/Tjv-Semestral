package com.semestral.eshop.controller;

import com.semestral.eshop.domain.SiteUser;
import com.semestral.eshop.domain.dto.SiteUserDto;
import com.semestral.eshop.domain.mapper.SiteUserMapper;
import com.semestral.eshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final SiteUserMapper siteUserMapper;
    @Autowired
    public UserController(UserService userService, SiteUserMapper siteUserMapper) {
        this.userService = userService;
        this.siteUserMapper = siteUserMapper;
    }

    @GetMapping
    public List<SiteUserDto> getAll(){
        List<SiteUser> temp = userService.findAll();
        return temp.stream().map(siteUserMapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SiteUserDto> getById( @PathVariable Long id){
        Optional<SiteUser> temp = userService.findById(id);
        Optional<SiteUserDto> test = Optional.ofNullable(siteUserMapper.toDto(temp.get()));
        return test.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public SiteUserDto create( @RequestBody SiteUser user) {
        SiteUser temp = userService.create(user);
        return siteUserMapper.toDto(temp);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SiteUserDto> update(@PathVariable Long id, @RequestBody SiteUserDto user){
        Optional<SiteUser> temp = userService.findById(id);
        if( temp.isEmpty() ){
            return ResponseEntity.notFound().build();
        }
        user.setId(id);
        SiteUser toRet = userService.update( siteUserMapper.fromDto(user) );
        return ResponseEntity.ok( siteUserMapper.toDto(toRet) );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        Optional<SiteUser> temp = userService.findById(id);

        if ( temp.isEmpty() ) {
            return ResponseEntity.notFound().build();
        }
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
