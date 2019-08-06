package com.arnab.spring.cloud.api.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	@Value("${org.name}")
	private String orgName;
	
	@Value("${org.location}")
	private String location;
	
	@Value("${org.application}")
	private String application;
	
	public String getOrgName() {
		return orgName;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getApplication() {
		return application;
	}

}
