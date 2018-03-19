package com.uniovi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uniovi.services.OperatorService;


@Controller
public class OperatorController {
	
	@Autowired
	private OperatorService service;
	
	@RequestMapping("/login")
	public String getLogin() {
		return "login";
	}

}
