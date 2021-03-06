package com.nilatech.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nilatech.model.Flights;
import com.nilatech.service.FlightService;

@RestController
public class FlightController {
	
	@Autowired
	private FlightService flightService;
	
	@GetMapping("/flight")
	public String getFlightDetails() {
		String flightApi = flightService.invokeUnitedFlightApi();
		return flightApi;
	}
	@GetMapping("/flightinfo")
	public Flights getFlighs() {
		 Flights flightApi = flightService.invokeFlightApi();
		return flightApi;
	}
	
}
