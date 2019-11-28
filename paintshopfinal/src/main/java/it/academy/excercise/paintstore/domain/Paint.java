package it.academy.excercise.paintstore.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Paint {
	
	
	@Id
	private String id;
	private String paintName;
	private String paintAuthor;
	@ManyToOne
	private Shop shop;
	
	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public Paint() {}
	
	public Paint(String id, String paintName,String paintAuthor, String shopNameId) {
		super();
		this.id = id;
		this.paintName = paintName;
		this.paintAuthor = paintAuthor;
		this.shop = new Shop(shopNameId,"","");
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPaintName() {
		return paintName;
	}

	public void setPaintName(String paintName) {
		this.paintName = paintName;
	}

	public String getPaintAuthor() {
		return paintAuthor;
	}

	public void setPaintAuthor(String paintAuthor) {
		this.paintAuthor = paintAuthor;
	}
	
	
}
