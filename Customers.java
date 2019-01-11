package com.sales.entity;

import java.util.Date;

//import javax.persistence.AttributeOverride;
//import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sales")
//@AttributeOverrides({ @AttributeOverride(name = "product_id", column = @Column(name = "product_Id")) })
public class Customers {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	@Column(name="mobile_number")
	private String mobileNumber;
	@Column(name="email")
	private String email;
	@Column(name="product_name")
	private String productName;
	@Column(name="model_num")
	private String modelNum;
	@Column(name="price")
	private float price;
	@Column(name="order_date")
    private Date orderDate;
	@Column(name="delivery_date")
	private Date deliveryDate;
	@Column(name="address")
	private String address;
	

	

	@Override
	public String toString() {
		return String.format("Customer [product_id=%s, first_name=%s, last_name=%s, mobile_number=%s,email=%s,product_name=%s,model_num=%s,price=%s,oredr_date=%s,delivery_date=%s,address=%s]", productId, firstName, lastName,mobileNumber,email,productName,modelNum,price,orderDate,deliveryDate,address);
	}




	public Long getProductId() {
		return productId;
	}




	public void setProductId(Long productId) {
		this.productId = productId;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getMobileNumber() {
		return mobileNumber;
	}




	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getProductName() {
		return productName;
	}




	public void setProductName(String productName) {
		this.productName = productName;
	}




	public String getModelNum() {
		return modelNum;
	}




	public void setModelNum(String modelNum) {
		this.modelNum = modelNum;
	}




	public float getPrice() {
		return price;
	}




	public void setPrice(float price) {
		this.price = price;
	}




	public Date getOrderDate() {
		return orderDate;
	}




	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}




	public Date getDeliveryDate() {
		return deliveryDate;
	}




	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}


}
