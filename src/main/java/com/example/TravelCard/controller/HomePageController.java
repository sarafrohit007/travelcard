package com.example.TravelCard.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.TravelCard.dto.LoadCardRequest;
import com.example.TravelCard.dto.LoadCardResponse;

@Controller
@RequestMapping("/api")
public class HomePageController {
	
	private static final Logger LOG = LoggerFactory.getLogger(HomePageController.class);

	@RequestMapping("/login")
	@ResponseBody
	public String login() {
		System.out.println("Printing Login Application Analysis....");
		return "Success";
	}

	@RequestMapping("/loadpaymentcard")
	@ResponseBody
	public LoadCardResponse loadPaymentCard(@Valid @RequestBody LoadCardRequest request) {
		LoadCardResponse response = new LoadCardResponse();
		if (request == null) {
			response.setCode(400);
			response.setMessage("Invalid Request..");
			return response;
		}
		try{
			
		}catch(Exception e){
			LOG.error("Error while loading card");
		}
		
		return response;
	}

}
