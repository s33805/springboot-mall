package com.markting.springbootmall.dao;

import com.markting.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
