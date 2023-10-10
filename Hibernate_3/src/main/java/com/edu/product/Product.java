package com.edu.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producttable")
public class Product {

@Id
private int productid;
@Column(name="productname",nullable = false,unique = true,length = 50)
private String pname;
@Column (name = "productprice",nullable = false)
private float pprice;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int productid, String pname, float pprice) {
	super();
	this.productid = productid;
	this.pname = pname;
	this.pprice = pprice;
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public float getPprice() {
	return pprice;
}
public void setPprice(float pprice) {
	this.pprice = pprice;
}
@Override
public String toString() {
	return "Product [productid=" + productid + ", pname=" + pname + ", pprice=" + pprice + "]";
}

}
