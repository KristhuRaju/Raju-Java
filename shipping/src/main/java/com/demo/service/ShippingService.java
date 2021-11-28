package com.demo.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.repositary.ShippingRepositary;
import com.demo.pojo.Shipping;

import com.demo.controller.ShippingController;

@Service
public class ShippingService {
	@Autowired
	public ShippingRepositary shippingRepo;
	 public List<Shipping> getAllShippings(){
		 
		 List<Shipping>shippings=new ArrayList<>();
		 shippingRepo.findAll().forEach(shippings::add);
		 return shippings; 

}
	 public void addShipping(Shipping shipping) {
		    shippingRepo.save(shipping);
	 }
	 public void updateShipping(Integer id,Shipping shipping) {
		    shippingRepo.save(shipping);
	 }
	 public void deleteShipping(Integer id) {
		    shippingRepo.deleteById(id);
	 }
	 public Shipping getShippingById(int id) {
			return shippingRepo.findById(id).orElse(null);
			
			
			
	}
		
}

