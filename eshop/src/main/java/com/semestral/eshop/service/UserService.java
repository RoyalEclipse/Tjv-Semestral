package com.semestral.eshop.service;

import com.semestral.eshop.domain.SiteUser;

public interface UserService {
    SiteUser create(SiteUser toAdd);
    SiteUser update(SiteUser toUpdate);
    SiteUser delete(SiteUser toDelete);
    SiteUser findById(Long toFind );

}
