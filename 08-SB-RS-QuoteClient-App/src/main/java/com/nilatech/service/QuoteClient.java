package com.nilatech.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteClient {
	
	public String invlkeRandomQuoteApi() {
		String url="https://quoters.apps.pcfone.io/api/random";
		
		RestTemplate template=new RestTemplate();
		
		ResponseEntity<String> responseEntity = template.getForEntity(url, String.class);
		int statusCode = responseEntity.getStatusCodeValue();
		if(statusCode==200) {
			String body = responseEntity.getBody();
			return body;
		}
		return null;
	}


}
