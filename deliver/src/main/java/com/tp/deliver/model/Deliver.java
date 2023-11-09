package com.tp.deliver.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="delivers")
public class Deliver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@Column
	private String title;
	@Column
	private String genre;
	@Column
	private int price;
	@Column
	private String image;
	@Column
	private String text;
	@Column
	private String review;
	@Column
	private String address;
	

 public Deliver() {
	super();
 }

	

	public Deliver(long id, String title, String genre, int price, String image, String text, String review,
			String address) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.image = image;
		this.text = text;
		this.review = review;
		this.address = address;
	
	}
	
public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getTitle() {
	return title;
}


public void setTitle(String title) {
	this.title = title;
}


public String getGenre() {
	return genre;
}


public void setGenre(String genre) {
	this.genre = genre;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}


public String getImage() {
	return image;
}


public void setImage(String image) {
	this.image = image;
}


public String getText() {
	return text;
}


public void setText(String text) {
	this.text = text;
}


public String getReview() {
	return review;
}


public void setReview(String review) {
	this.review = review;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
 }
}
