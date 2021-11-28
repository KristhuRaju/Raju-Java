package com.demo.repositary;

import org.springframework.data.repository.CrudRepository;

import com.demo.pojo.Order;
import com.demo.service.OrderService;
import com.demo.controller.OrderController;

public interface OrderRepositary extends CrudRepository<Order,Integer> {

}
