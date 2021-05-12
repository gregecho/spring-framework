package com.greg.spring.ioctest.services;

import org.springframework.stereotype.Component;

@Component
public class IndexService {
	public IndexService() {
		System.out.println("Constructor from IndexService");
	}
}
