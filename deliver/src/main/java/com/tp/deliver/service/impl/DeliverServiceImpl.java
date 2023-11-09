package com.tp.deliver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp.deliver.model.Deliver;
import com.tp.deliver.model.Purchase;
import com.tp.deliver.repository.DeliverRepository;
import com.tp.deliver.repository.PurchaseRepository;
import com.tp.deliver.service.DeliverService;

@Service
public class DeliverServiceImpl implements DeliverService{

	private DeliverRepository deliverRepository;
	private PurchaseRepository purchaseRepository;
	

	@Autowired
	public DeliverServiceImpl(DeliverRepository deliverRepository,
			PurchaseRepository purchaseRepository) {
		super();
		
		this. deliverRepository = deliverRepository;
		this. purchaseRepository = purchaseRepository;
	}
	
	
	
	
	@Override
	public Deliver saveDeliver(Deliver deliver) {
		return deliverRepository.save(deliver);
	}

	@Override
	public List<Deliver> getAllDelivers() {
		return deliverRepository.findAll();
	}

	@Override
	public Deliver getDeliverById(long id) {
		return deliverRepository.findById(id).orElseThrow(()->null);
	}

	@Override
	public Deliver updateDeliverById(Deliver deliver, long id) {
		Deliver existingDeliver = deliverRepository.findById(id).orElseThrow(()
				->null);
		existingDeliver.setGenre(deliver.getGenre());
		existingDeliver.setImage(deliver.getImage());
		existingDeliver.setPrice(deliver.getPrice());
		existingDeliver.setText(deliver.getText());
		existingDeliver.setTitle(deliver.getTitle());
		existingDeliver.setAddress(deliver.getAddress());
		existingDeliver.setReview(deliver.getReview());
	deliverRepository.save(existingDeliver);
		return existingDeliver;
	
	}

	@Override
	public void deleteDeliverById(long id) {
		deliverRepository.findById(id).orElseThrow(()->null);
		deliverRepository.deleteById(id);
		
	}

	@Override
	public Purchase savePurchase(Purchase purchase) {
		return purchaseRepository.save(purchase);
	}

	@Override
	public List<Purchase> getAllPurchase() {
		return purchaseRepository.findAll();
		}
	
	@Override
	public List<Purchase> getPurchaseById(String loginId) {
		return purchaseRepository.findByLoginId(loginId);
	}
	
	
	
	
	
	
}
