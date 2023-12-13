package com.markting.springbootmall.dao;

import com.markting.springbootmall.dto.ProductRequest;
import com.markting.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
