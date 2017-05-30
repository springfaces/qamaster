package com.qamaster.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qamaster.web.model.Offer;
import com.qamaster.web.service.OffersService;

@Controller
@RequestMapping("/")
public class OffersController {
	
	private OffersService offersService;
	
	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}
	
	
	@RequestMapping("/offers")
	public String getOffers(Model model) {
		List<Offer> offers = offersService.getCurrent();
		model.addAttribute("offers", offers);
		return "offers";
	}
	
	@RequestMapping(value="/createoffer", method=RequestMethod.POST)
	public String createOffer(){
		return "createoffer";
	}
	
	@RequestMapping(value="/docreate", method=RequestMethod.POST)
	public String doCreate(Model model, Offer offer){
		System.out.println(offer);
		String result = this.offersService.createOffer(offer) ? "Offer created Successfully" : "Failed to crate your offer!";
		model.addAttribute("result", result);
		return "offercreated";
	}
}
