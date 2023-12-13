package com.markting.springbootmall.service;

import com.markting.springbootmall.dto.ProductRequest;
import com.markting.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
