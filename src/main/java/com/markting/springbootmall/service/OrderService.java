package com.markting.springbootmall.service;

import com.markting.springbootmall.dto.CreateOrderRequest;
import com.markting.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
