package com.demo.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.repositary.OrderRepositary;
import com.demo.pojo.Order;

import com.demo.controller.OrderController;

@Service
public class OrderService {
	@Autowired
	public OrderRepositary orderRepo;
	 public List<Order> getAllOrders(){
		 
		 List<Order>orders=new ArrayList<>();
		 orderRepo.findAll().forEach(orders::add);
		 return orders; 

}
	 public void addOrder(Order order) {
		    orderRepo.save(order);
	 }
	 public void updateOrder(Integer id,Order order) {
		    orderRepo.save(order);
	 }
	 public void deleteOrder(Integer id) {
		    orderRepo.deleteById(id);
	 }
	 public Order getOrderById(int id) {
			return orderRepo.findById(id).orElse(null);
			
			
			
	}
		
}

