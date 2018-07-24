package com.cg.mywalletapp.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import com.cg.mywalletapp.beans.Customer;

@Controller
public class URIController {
	@RequestMapping(value = "/")
	public String getIndexPage() {
		return "index";
	}

	@RequestMapping(value = "/login")
	public String getLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/signup")
	public String getSignUpPage() {
		return "signup";
	}
	
	@RequestMapping(value = "/deposit")
	public String getDeposit() {
		return "deposit";
	}
	
	@RequestMapping(value = "/withdraw")
	public String getWithdraw() {
		return "withdraw";
	}
	
	@RequestMapping(value = "/transfer")
	public String getFundTransfer() {
		return "transfer";
	}

	@ModelAttribute("customer")
	public Customer getCustomer() {
		return new Customer();
	}

}
