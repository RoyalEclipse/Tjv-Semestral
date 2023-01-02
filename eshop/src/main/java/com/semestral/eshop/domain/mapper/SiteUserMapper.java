package com.semestral.eshop.domain.mapper;

import com.semestral.eshop.domain.SiteUser;
import com.semestral.eshop.domain.dto.SiteUserDto;
import org.springframework.stereotype.Component;

@Component
public class SiteUserMapper {
    public SiteUserDto toDto(SiteUser siteUser){
        SiteUserDto temp = new SiteUserDto();
        temp.setCredits(siteUser.getCredits());
        temp.setEmail(siteUser.getEmail());
        temp.setId(siteUser.getId());
        temp.setName(siteUser.getName());
        temp.setSurname(siteUser.getSurname());
        temp.setAccessPrivileges(siteUser.getAccessPrivileges());
        temp.setPhoneNumber(siteUser.getPhoneNumber());
        temp.setSiteOrders(siteUser.getOrders());
        return temp;
    }
    public SiteUser fromDto(SiteUserDto SiteUserDto){
        SiteUser temp = new SiteUser();
        temp.setCredits(SiteUserDto.getCredits());
        temp.setEmail(SiteUserDto.getEmail());
        temp.setId(SiteUserDto.getId());
        temp.setName(SiteUserDto.getName());
        temp.setSurname(SiteUserDto.getSurname());
        temp.setAccessPrivileges(SiteUserDto.getAccessPrivileges());
        temp.setPhoneNumber(SiteUserDto.getPhoneNumber());
        temp.setOrders(SiteUserDto.getSiteOrders());
        return temp;
    }
}
