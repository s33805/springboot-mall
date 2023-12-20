package com.markting.springbootmall.service;

import com.markting.springbootmall.dto.CreateOrderRequest;
import com.markting.springbootmall.dto.OrderQueryParams;
import com.markting.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
