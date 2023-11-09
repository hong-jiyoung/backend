package com.tp.deliver.service;

import java.util.List;

import com.tp.deliver.model.Deliver;
import com.tp.deliver.model.Purchase;

public interface DeliverService {

	Deliver saveDeliver(Deliver deliver);

	List<Deliver> getAllDelivers();

	Deliver getDeliverById(long id);

	Deliver updateDeliverById(Deliver deliver, long id);

	void deleteDeliverById(long id);

	Purchase savePurchase(Purchase purchase);

	List<Purchase> getAllPurchase();

	List<Purchase> getPurchaseById(String loginId);
}
