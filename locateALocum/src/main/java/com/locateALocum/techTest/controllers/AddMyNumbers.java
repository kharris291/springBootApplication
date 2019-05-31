package com.locateALocum.techTest.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.locateALocum.techTest.httpRequests.*;

@RestController
public class AddMyNumbers {
	
	@PostMapping("/addNumbers")
    @CrossOrigin(origins = "http://localhost:3000")
    NumberAdditionResponse addNumberTogether(@RequestBody NumberAdditionResponse numbers) {
		NumberAdditionResponse numJSONReply = new NumberAdditionResponse();
		numJSONReply.setNumber1(numbers.getNumber1());
		numJSONReply.setNumber2(numbers.getNumber2());
		numJSONReply.setTotal();
		return numJSONReply;
	}

}