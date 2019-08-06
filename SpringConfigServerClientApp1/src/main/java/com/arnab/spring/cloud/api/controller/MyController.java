package com.arnab.spring.cloud.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arnab.spring.cloud.api.service.MyService;

@RestController
@RequestMapping(value = "/config-server")
public class MyController {

	@Autowired
	private MyService service;
	
	@GetMapping(value = "/orgname")
	public String getOrgName() {
		return service.getOrgName();
	}
	
	@GetMapping(value = "/application")
	public String getLocation() {
		return service.getLocation();
	}
	
	@GetMapping(value = "/location")
	public String getApplication() {
		return service.getApplication();
	}
	
}
