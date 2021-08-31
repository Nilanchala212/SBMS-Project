package com.nilatech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nilatech.service.QuoteClient;

@RestController
public class QuoteController {

	@Autowired
	private QuoteClient quoteClient;
	
	@GetMapping("/client")
	private String getClient() {
		String invlkeRandomQuoteApi = quoteClient.invlkeRandomQuoteApi();
		return invlkeRandomQuoteApi;
		
	}
}
