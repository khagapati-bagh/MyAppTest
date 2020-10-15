package com.ofss;

public class Product {
	private String pName;
	private String pId;
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public Product(String pName, String pId) {
		super();
		this.pName = pName;
		this.pId = pId;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [pName=" + pName + ", pId=" + pId + "]";
	}
	
}
