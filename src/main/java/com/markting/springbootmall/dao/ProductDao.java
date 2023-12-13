package com.markting.springbootmall.dao;

import com.markting.springbootmall.constant.ProductCategory;
import com.markting.springbootmall.dto.ProductRequest;
import com.markting.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
