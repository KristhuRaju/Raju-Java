package com.demo.repositary;

import org.springframework.data.repository.CrudRepository;

import com.demo.pojo.Shipping;
import com.demo.service.ShippingService;
import com.demo.controller.ShippingController;

public interface ShippingRepositary extends CrudRepository<Shipping,Integer> {

}