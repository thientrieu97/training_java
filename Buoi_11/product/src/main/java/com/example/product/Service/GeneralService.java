package com.example.product.Service;

import java.util.Optional;


//Interface GeneralService chứa các thao tác thêm sửa xóa đơn giản
public interface GeneralService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    T save(T t);

}