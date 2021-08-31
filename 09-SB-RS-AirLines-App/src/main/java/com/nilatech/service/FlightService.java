package com.nilatech.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nilatech.model.Flight;
import com.nilatech.model.Flights;

@Service
public class FlightService {

	public String invokeUnitedFlightApi() {

		String apiUrl = "http://mu.mulesoft-training.com/essentials/united/flights/";

		RestTemplate template = new RestTemplate();
		ResponseEntity<String> responseEntity = template.getForEntity(apiUrl, String.class);
		String body = responseEntity.getBody();
		return body;
	}

	public Flights invokeFlightApi() {

		String apiUrl = "http://mu.mulesoft-training.com/essentials/united/flights/";

		RestTemplate template = new RestTemplate();
		ResponseEntity<Flights> responseEntity = template.getForEntity(apiUrl, Flights.class);
		Flights body = responseEntity.getBody();
	
		return body;
	}

}
