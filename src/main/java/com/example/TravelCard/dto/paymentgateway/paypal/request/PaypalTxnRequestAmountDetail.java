package com.example.TravelCard.dto.paymentgateway.paypal.request;

/* Paypal trxn request amount info  DTO*/
public class PaypalTxnRequestAmountDetail {
	
	private String total;
	private String currency;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "PaypalTrxnRequestAmountDetail [total=" + total + ", currency=" + currency + "]";
	}

}
