package com.semestral.eshop.controller;

import com.semestral.eshop.domain.SiteUser;
import com.semestral.eshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<SiteUser> getAll(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SiteUser> getById( @PathVariable Long id){
        Optional<SiteUser> temp = userService.findById(id);
        return temp.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public SiteUser create( @RequestBody SiteUser user) {
        return userService.create(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SiteUser> update(@PathVariable Long id, @RequestBody SiteUser user){
        Optional<SiteUser> temp = userService.findById(id);
        if( temp.isEmpty() ){
            return ResponseEntity.notFound().build();
        }
        user.setId(id);
        return ResponseEntity.ok( userService.update(user) );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        Optional<SiteUser> temp = userService.findById(id);

        if ( temp.isEmpty() ) {
            return ResponseEntity.notFound().build();
        }
        userService.delete(id);
        return ResponseEntity.ok().build();
    }
}
