package com.semestral.eshop.service;

import com.semestral.eshop.domain.SiteUser;
import com.semestral.eshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public SiteUser create(SiteUser toAdd) {
        return (SiteUser) userRepository.save(toAdd);
    }

    @Override
    public SiteUser update(SiteUser toUpdate) {
        return null;
    }

    @Override
    public SiteUser delete(SiteUser toDelete) {
        return null;
    }

    @Override
    public SiteUser findById(Long toFind) {
        return null;
    }
}
