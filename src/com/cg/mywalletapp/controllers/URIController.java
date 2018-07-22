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

	@RequestMapping(value = "/signin")
	public String getSigninPage() {
		return "signin";
	}

	@ModelAttribute("customer")
	public Customer getCustomer() {
		return new Customer();
	}

}
