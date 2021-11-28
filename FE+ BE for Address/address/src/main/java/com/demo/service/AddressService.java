package com.demo.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.repositary.AddressRepositary;
import com.demo.pojo.Address;

import com.demo.controller.AddressController;

@Service
public class AddressService {
	@Autowired
	public AddressRepositary addressRepo;
	 public List<Address> getAllAddresss(){
		 
		 List<Address>addresss=new ArrayList<>();
		 addressRepo.findAll().forEach(addresss::add);
		 return addresss; 

}
	 public void addAddress(Address address) {
		    addressRepo.save(address);
	 }
	 public void updateAddress(Integer id,Address address) {
		    addressRepo.save(address);
	 }
	 public void deleteAddress(Integer id) {
		    addressRepo.deleteById(id);
	 }
	 public Address getAddressById(int id) {
			return addressRepo.findById(id).orElse(null);
			
			
			
	}
		
}






