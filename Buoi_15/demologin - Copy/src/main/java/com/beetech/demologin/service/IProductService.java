package com.beetech.demologin.service;


import com.beetech.demologin.entity.ProductEntity;
import com.beetech.demologin.model.PageModel;
import org.springframework.stereotype.Service;


public interface IProductService {
    ProductEntity save(ProductEntity productEntity);

    PageModel<ProductEntity> findAll(Integer page, Integer size, String sort);

    ProductEntity getOne(Integer id);
}
