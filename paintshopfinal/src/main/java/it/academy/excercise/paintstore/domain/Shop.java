package it.academy.excercise.paintstore.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shop {
	
	@Id
	private String id;
	private String shopName;
	private String shopCapacity;
	
	public Shop() {
	}
	
	public Shop(String id, String shopName, String shopCapacity) {
		super();
		this.id = id;
		this.shopName = shopName;
		this.shopCapacity = shopCapacity;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopCapacity() {
		return shopCapacity;
	}
	public void setShopCapacity(String shopCapacity) {
		this.shopCapacity = shopCapacity;
	}
	

}
