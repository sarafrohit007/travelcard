package com.example.TravelCard.dto.paymentgateway.paypal.request;

/* Paypal trxn complete request info  DTO*/
public class PaypalTransactionCompleteRequest {

	private String payer_id;

	public String getPayer_id() {
		return payer_id;
	}

	public void setPayer_id(String payer_id) {
		this.payer_id = payer_id;
	}

	@Override
	public String toString() {
		return "PaypalTransactionCompleteRequest [payer_id=" + payer_id + "]";
	}

}
