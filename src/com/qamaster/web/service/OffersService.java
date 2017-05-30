package com.qamaster.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qamaster.web.dao.OffersDAO;
import com.qamaster.web.model.Offer;

@Service("offersService")
public class OffersService {
	
	
	private OffersDAO offersDAO;

	@Autowired
	public void setOffersDAO(OffersDAO offersDAO) {
		this.offersDAO = offersDAO;
	}

	public List<Offer> getCurrent() {
		return offersDAO.getOffers();
	}
	
	public boolean createOffer(Offer offer) {
		return this.offersDAO.create(offer);
	}
}
