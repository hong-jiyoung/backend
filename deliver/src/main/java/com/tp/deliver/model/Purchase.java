package com.tp.deliver.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="purchase")
public class Purchase {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	private long id;
	
	@ManyToOne
	private Deliver delivers;
	
	@Column(name="login_id")
			private String loginId;
	
	private int quantity;
	
	
	public Purchase() {
		super();
	}

	public Purchase(long id, Deliver delivers, String loginId, int quantity) {
		super();
		this.id = id;
		this.delivers = delivers;
		this.loginId = loginId;
		this.quantity = quantity;
	}

	

}
