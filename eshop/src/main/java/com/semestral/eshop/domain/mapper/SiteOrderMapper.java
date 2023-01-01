package com.semestral.eshop.domain.mapper;

import com.semestral.eshop.domain.SiteOrder;
import com.semestral.eshop.domain.dto.SiteOrderDto;

public class SiteOrderMapper {
    SiteOrderDto toDto(SiteOrder siteOrder){
        SiteOrderDto temp = new SiteOrderDto();
        temp.setEta(siteOrder.getEta());
        temp.setDateCreated(siteOrder.getDateCreated());
        temp.setDeliverTo(siteOrder.getDeliverTo());
        temp.setId(siteOrder.getId());
        temp.setProducts(siteOrder.getProducts());
        temp.setFromSiteUser(siteOrder.getFromUser());
        return temp;
    }
    SiteOrder fromDto(SiteOrderDto siteOrderDto){
        SiteOrder temp = new SiteOrder();
        temp.setEta(siteOrderDto.getEta());
        temp.setDateCreated(siteOrderDto.getDateCreated());
        temp.setDeliverTo(siteOrderDto.getDeliverTo());
        temp.setId(siteOrderDto.getId());
        temp.setProducts(siteOrderDto.getProducts());
        temp.setFromUser(siteOrderDto.getFromSiteUser());
        return temp;
    }
}
