package com.qamaster.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qamaster.web.model.User;
import com.qamaster.web.service.UsersService;

@Controller
@RequestMapping("/")
public class QAMasterLoginController {
	
	private static final  Logger logger = Logger.getLogger(QAMasterContorller.class);
	
	private UsersService usersService;
	
	@Autowired
	public void setUserService(UsersService userService) {
		this.usersService = userService;
	}
	
	
	
	@RequestMapping(value="/admin")
	public String showAdmin() {
		System.out.println("adminUsers");
		return "admin";
	}
	
	
	@RequestMapping(value="/login")
	public String showLogin() {
		logger.debug("Inside QAMasterLogin Controller, show loign metod: ----");
		return "index";
	}
	
	@RequestMapping("/loggedout")
	public String loggedout() {
		return "loggedout";
	}
	
	@RequestMapping(value="/newaccount")
	public String showNewAccont(Model model) {
		model.addAttribute("user", new User());
		return "newaccount";
	}
	
//	@RequestMapping("/index")
//	public String index() {
//		return "index";
//	}
	
	@RequestMapping(value="/createaccount", method=RequestMethod.POST)
	public String createAccount(@Validated User user, BindingResult result) {
		if(result.hasErrors()) {
			return "createaccount";
		}
		user.setEnabled(true);
		user.setAuthority("admin");
		this.usersService.createUser(user);
		
		return "accountcreated";
	}

	
}
