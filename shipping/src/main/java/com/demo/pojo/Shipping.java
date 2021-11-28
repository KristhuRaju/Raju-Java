package com.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shippingtable")

public class Shipping {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String shippingmethod;
	private String shippingcharge;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getShippingmethod() {
		return shippingmethod;
	}
	public void setShippingmethod(String shippingmethod) {
		this.shippingmethod = shippingmethod;
	}
	public String getShippingcharge() {
		return shippingcharge;
	}
	public void setShippingcharge(String shippingcharge) {
		this.shippingcharge = shippingcharge;
	}
}