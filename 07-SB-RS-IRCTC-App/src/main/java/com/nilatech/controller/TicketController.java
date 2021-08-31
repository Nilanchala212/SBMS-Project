package com.nilatech.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nilatech.request.PassengerRequest;
import com.nilatech.response.PassengerResponse;

@RestController
public class TicketController {
	
	@PostMapping(value = "/book-ticket",consumes = {"application/xml","application/json"},
			produces = {"application/xml","application/json"})
	public ResponseEntity<PassengerResponse> passengerInfo(@RequestBody PassengerRequest request) {
		
		PassengerResponse response=new PassengerResponse();
		response.setStatus("CONFIRM");
		response.setPrice(1300.00);
		
		BeanUtils.copyProperties(request, response);	
		
		return new ResponseEntity<>(response,HttpStatus.CREATED);
	
	}

}
