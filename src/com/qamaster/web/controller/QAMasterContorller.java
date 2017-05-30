package com.qamaster.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.qamaster.web.model.Offer;
import com.qamaster.web.service.OffersService;

@Controller
@RequestMapping("/")
public class QAMasterContorller {

	private OffersService offersService;

	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String test(HttpServletRequest req, HttpServletResponse res) {
		HttpSession session = req.getSession();
		session.setAttribute("name", "Qa master project");
		return "home";
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String qamHome(HttpServletRequest req, HttpServletResponse res) {
		HttpSession session = req.getSession();
		List<Offer> offers = offersService.getCurrent();
		session.setAttribute("offers", offers);
		return "home";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String showOffers(Model model, @RequestParam("id")String id) {
		System.out.println("id is :"  + id);
		return "home";
	}
	
	
}
