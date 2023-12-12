package com.markting.springbootmall.service.impl;

import com.markting.springbootmall.dao.ProductDao;
import com.markting.springbootmall.model.Product;
import com.markting.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
