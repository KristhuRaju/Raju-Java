package com.demo.repositary;

import org.springframework.data.repository.CrudRepository;

import com.demo.pojo.Address;
import com.demo.service.AddressService;
import com.demo.controller.AddressController;

public interface AddressRepositary extends CrudRepository<Address,Integer> {

}