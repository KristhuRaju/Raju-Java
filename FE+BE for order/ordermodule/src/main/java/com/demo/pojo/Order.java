package com.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ordertable")

public class Order {
	
	@Id
	@GeneratedValue
	private Integer id;
	private Integer productid;
	private String productname;
	private String quantity;
	public Order(Integer id, Integer productid, String productname, String quantity) {
		super();
		this.id = id;
		this.productid = productid;
		this.productname = productname;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", productid=" + productid + ", productname=" + productname + ", quantity="
				+ quantity + "]";
	}
	public Integer getid() {
		return id;
	}
	public void setid(Integer orderid) {
		this.id = orderid;
	}
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
}