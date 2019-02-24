package com.example.TravelCard.dto;

public interface PaymentGateWayProvider {
	
	void postRedirectionToPaymentGatewayProvider();
	
	void postCompletionRequestToPaymentGatewayProvider();
	
	void postRefundRequestToPaymentGatewayProvider();
	
	
}
