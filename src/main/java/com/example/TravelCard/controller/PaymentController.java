package com.example.TravelCard.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.TravelCard.dto.LoadCardRequest;

@Controller("/api/payment/")
public class PaymentController {
	
	@RequestMapping("initiate")
	@ResponseBody
	public void initiateMerchantPayment(@RequestBody LoadCardRequest loadRequest, HttpServletRequest servletRequest, HttpServletResponse response){
		
	}

}
