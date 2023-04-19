package com.beetech.demologin.service.imp;

import com.beetech.demologin.entity.ProductEntity;
import com.beetech.demologin.model.PageModel;
import com.beetech.demologin.repository.ProductRepository;
import com.beetech.demologin.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements IProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public ProductEntity save(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    @Override
    public PageModel<ProductEntity> findAll(Integer page, Integer size, String sort) {
        PageRequest pageRequest =  PageRequest.of(page < 0 ? 0 : page, size, Sort.by(sort));
        Page<ProductEntity> paging = productRepository.findAll(pageRequest);
        return new PageModel<>(paging.getContent(), pageRequest.getPageNumber(), paging.getTotalPages());
    }

    @Override
    public ProductEntity getOne(Integer id) {
        return productRepository.getReferenceById(id);
    }
}




