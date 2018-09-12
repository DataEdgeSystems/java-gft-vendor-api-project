package com.accenture.lkm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendorController {
	@RequestMapping(value = "/")
	public String home() {
		return "Welcome to Vendor Service API";		
	}
}