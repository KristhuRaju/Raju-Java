package com.demo.controller;

import com.demo.pojo.Shipping;

import com.demo.service.ShippingService;
import com.demo.repositary.ShippingRepositary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingController {
	@Autowired
	private ShippingService shippingService;
	
	@RequestMapping(method=RequestMethod.GET,value=("/shippings"))
	 public List<Shipping> getAllShippings(){
		 
		 return shippingService.getAllShippings();

}
	
	@RequestMapping(method=RequestMethod.POST,value=("/shippings/add"))
	public void addShipping(@RequestBody Shipping shipping)
	{
		shippingService.addShipping(shipping);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value=("/shippings/{id}"))
	public void updateShipping(@PathVariable Integer id,@RequestBody Shipping shipping)
	{
		shippingService.updateShipping(id,shipping);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value=("/shippings/{id}"))
	public void DeleteShippping(@PathVariable Integer id)
	{
		shippingService.deleteShipping(id);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/shippings/{id}")
	public Shipping findShippingById(@PathVariable int id) {
		return shippingService.getShippingById(id);
	}
	
	 
	 
	
}
