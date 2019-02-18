package com.example.TravelCard.dto.paymentgateway.paypal.response;

import java.util.Date;
import java.util.List;

import com.example.TravelCard.dto.paymentgateway.paypal.request.PaypalTransactionInitiateRequest.PaypalTxnsRequestDetail;

public class PaypalTransactionInitiateResponse {

	private String id;
	private String intent;
	private String state;
	private PaypalPayerInformation payer;
	private List<PaypalTxnsRequestDetail> transactions;
	private Date create_time;
	private List<PaypalTrxnResponseLinks> links;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIntent() {
		return intent;
	}

	public void setIntent(String intent) {
		this.intent = intent;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public PaypalPayerInformation getPayer() {
		return payer;
	}

	public void setPayer(PaypalPayerInformation payer) {
		this.payer = payer;
	}

	public List<PaypalTxnsRequestDetail> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<PaypalTxnsRequestDetail> transactions) {
		this.transactions = transactions;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public List<PaypalTrxnResponseLinks> getLinks() {
		return links;
	}

	public void setLinks(List<PaypalTrxnResponseLinks> links) {
		this.links = links;
	}

	@Override
	public String toString() {
		return "PaypalTransactionInitiationResponse [id=" + id + ", intent=" + intent + ", state=" + state + ", payer="
				+ payer + ", transactions=" + transactions + ", create_time=" + create_time + ", links=" + links + "]";
	}

	public static class PaypalTxnsresponseDetail {
		private PaypalTxnsRequestDetail amount;

		private List<String> related_resources;

		public PaypalTxnsRequestDetail getAmount() {
			return amount;
		}

		public void setAmount(PaypalTxnsRequestDetail amount) {
			this.amount = amount;
		}

		public List<String> getRelated_resources() {
			return related_resources;
		}

		public void setRelated_resources(List<String> related_resources) {
			this.related_resources = related_resources;
		}

		@Override
		public String toString() {
			return "PaypalTrxnsRequestDetail [amount=" + amount + ", related_resources=" + related_resources + "]";
		}

	}

	public static class PaypalPayerInformation {
		private String payment_method;

		public String getPayment_method() {
			return payment_method;
		}

		public void setPayment_method(String payment_method) {
			this.payment_method = payment_method;
		}

		@Override
		public String toString() {
			return "PaypalPayerInformation [payment_method=" + payment_method + "]";
		}

	}

	public static class PaypalTrxnResponseLinks {

		private String href;
		private String rel;
		private String method;

		public String getHref() {
			return href;
		}

		public void setHref(String href) {
			this.href = href;
		}

		public String getRel() {
			return rel;
		}

		public void setRel(String rel) {
			this.rel = rel;
		}

		public String getMethod() {
			return method;
		}

		public void setMethod(String method) {
			this.method = method;
		}

		@Override
		public String toString() {
			return "PaypalTrxnInfoLink [href=" + href + ", rel=" + rel + ", method=" + method + "]";
		}

	}

	
}
