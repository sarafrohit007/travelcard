package com.example.TravelCard.dto.paymentgateway;

public interface PaymentGateWayProvider {
	
	void postRedirectionToPaymentGatewayProvider();
	
	void postCompletionRequestToPaymentGatewayProvider();
	
	void postRefundRequestToPaymentGatewayProvider();
	
	
}
