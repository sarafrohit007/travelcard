package com.example.TravelCard.dto.paymentgateway.paypal.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* Paypal trxn initiate request  DTO*/
public class PaypalTransactionInitiateRequest implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = -7666642385070108828L;

	private String intent;
	private PaypalredirectUrls redirect_urls = new PaypalredirectUrls();
	private PaypalPayerInformation payer = new PaypalPayerInformation();
	private List<PaypalTxnsRequestDetail> transactions = new ArrayList<PaypalTxnsRequestDetail>(1);
	private ApplicationContext application_context;

	public String getIntent() {
		return intent;
	}

	public void setIntent(String intent) {
		this.intent = intent;
	}

	public PaypalredirectUrls getRedirect_urls() {
		return redirect_urls;
	}

	public void setRedirect_urls(PaypalredirectUrls redirect_urls) {
		this.redirect_urls = redirect_urls;
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

	/* Paypal trxn redirect url  DTO*/
	public static class PaypalredirectUrls {
		String return_url = "";
		String cancel_url = "";

		public String getReturn_url() {
			return return_url;
		}

		public void setReturn_url(String return_url) {
			this.return_url = return_url;
		}

		public String getCancel_url() {
			return cancel_url;
		}

		public void setCancel_url(String cancel_url) {
			this.cancel_url = cancel_url;
		}

		@Override
		public String toString() {
			return "PaypalredirectUrls [return_url=" + return_url + ", cancel_url=" + cancel_url + "]";
		}

	}

	/* Paypal trxn Payer info  DTO*/
	public static class PaypalPayerInformation {
		private String payment_method = "";
		private PayerInfo payer_info;

		public String getPayment_method() {
			return payment_method;
		}

		public void setPayment_method(String payment_method) {
			this.payment_method = payment_method;
		}

		public PayerInfo getPayer_info() {
			return payer_info;
		}

		public void setPayer_info(PayerInfo payer_info) {
			this.payer_info = payer_info;
		}

		@Override
		public String toString() {
			return "PaypalPayerInformation [payment_method=" + payment_method + ", payer_info=" + payer_info + "]";
		}

	}

	/* Paypal trxn request info  DTO*/
	public static class PaypalTxnsRequestDetail {
		private PaypalTxnRequestAmountDetail amount = new PaypalTxnRequestAmountDetail();
		private String description;
		private String invoice_number;
		private ItemsList item_list;

		public PaypalTxnRequestAmountDetail getAmount() {
			return amount;
		}

		public void setAmount(PaypalTxnRequestAmountDetail amount) {
			this.amount = amount;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getInvoice_number() {
			return invoice_number;
		}

		public void setInvoice_number(String invoice_number) {
			this.invoice_number = invoice_number;
		}

		public ItemsList getItem_list() {
			return item_list;
		}

		public void setItem_list(ItemsList item_list) {
			this.item_list = item_list;
		}

		

		@Override
		public String toString() {
			return "PaypalTxnsRequestDetail [amount=" + amount + ", description=" + description + ", invoice_number="
					+ invoice_number + ", item_list=" + item_list 
					+ "]";
		}

	}

	/* Paypal txn item list  DTO*/
	public static class ItemsList {

		private List<Items> items = new ArrayList<Items>();
		//private ShippingAddress shipping_address;
		private String shipping_phone_number;

		public List<Items> getItems() {
			return items;
		}

		public void setItems(List<Items> items) {
			this.items = items;
		}

//		public ShippingAddress getShipping_address() {
//			return shipping_address;
//		}
//
//		public void setShipping_address(ShippingAddress shipping_address) {
//			this.shipping_address = shipping_address;
//		}

		public static class ShippingAddress {
			private String recipient_name;
			private String line1;
			private String line2;
			private String city;
			private String country_code;
			private String postal_code;
			private String phone;
			private String state;

			public String getRecipient_name() {
				return recipient_name;
			}

			public void setRecipient_name(String recipient_name) {
				this.recipient_name = recipient_name;
			}

			public String getLine1() {
				return line1;
			}

			public void setLine1(String line1) {
				this.line1 = line1;
			}

			public String getLine2() {
				return line2;
			}

			public void setLine2(String line2) {
				this.line2 = line2;
			}

			public String getCity() {
				return city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public String getCountry_code() {
				return country_code;
			}

			public void setCountry_code(String country_code) {
				this.country_code = country_code;
			}

			public String getPostal_code() {
				return postal_code;
			}

			public void setPostal_code(String postal_code) {
				this.postal_code = postal_code;
			}

			public String getPhone() {
				return phone;
			}

			public void setPhone(String phone) {
				this.phone = phone;
			}

			public String getState() {
				return state;
			}

			public void setState(String state) {
				this.state = state;
			}

			@Override
			public String toString() {
				return "ShippingAddress [recipient_name=" + recipient_name + ", line1=" + line1 + ", line2=" + line2
						+ ", city=" + city + ", country_code=" + country_code + ", postal_code=" + postal_code
						+ ", phone=" + phone + ", state=" + state + "]";
			}

		}
		
		

		public String getShipping_phone_number() {
			return shipping_phone_number;
		}

		public void setShipping_phone_number(String shipping_phone_number) {
			this.shipping_phone_number = shipping_phone_number;
		}

		@Override
		public String toString() {
			return "ItemsList [items=" + items + ", shipping_phone_number=" + shipping_phone_number + "]";
		}

		

	}

	public static class Items {
		private String name;
		private String currency;
		private Integer quantity;
		private String price;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCurrency() {
			return currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public Integer getQuantity() {
			return quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Items [name=" + name + ", currency=" + currency + ", quantity=" + quantity + ", price=" + price
					+ "]";
		}

	}

	public static class ApplicationContext {
		private final String locale = "en_IN";
		private final String user_action = "commit";

		public String getLocale() {
			return locale;
		}

		public String getUser_action() {
			return user_action;
		}

		@Override
		public String toString() {
			return "ApplicationContext [locale=" + locale + ", user_action=" + user_action + "]";
		}

	}

	/* Paypal trxn Payer info  DTO*/
	public static class PayerInfo {
		private String email;
		private BillingAddress billing_address;
		private String first_name;
		private String last_name;

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public BillingAddress getBilling_address() {
			return billing_address;
		}

		public void setBilling_address(BillingAddress billing_address) {
			this.billing_address = billing_address;
		}

		public String getFirst_name() {
			return first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		@Override
		public String toString() {
			return "PayerInfo [email=" + email + ", billing_address=" + billing_address + ", first_name=" + first_name
					+ ", last_name=" + last_name + "]";
		}

	}

	public static class BillingAddress {
		private String line1;
		private String line2;
		private String city;
		private String country_code;
		private String postal_code;
		private String phone;
		private String state;

		public String getLine1() {
			return line1;
		}

		public void setLine1(String line1) {
			this.line1 = line1;
		}

		public String getLine2() {
			return line2;
		}

		public void setLine2(String line2) {
			this.line2 = line2;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getCountry_code() {
			return country_code;
		}

		public void setCountry_code(String country_code) {
			this.country_code = country_code;
		}

		public String getPostal_code() {
			return postal_code;
		}

		public void setPostal_code(String postal_code) {
			this.postal_code = postal_code;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		@Override
		public String toString() {
			return "BillingAddress [line1=" + line1 + ", line2=" + line2 + ", city=" + city + ", country_code="
					+ country_code + ", postal_code=" + postal_code + ", phone=" + phone + ", state=" + state + "]";
		}

	}

	public ApplicationContext getApplication_context() {
		return application_context;
	}

	public void setApplication_context(ApplicationContext application_context) {
		this.application_context = application_context;
	}

	@Override
	public String toString() {
		return "PaypaltransactionInitiateRequest [intent=" + intent + ", redirect_urls=" + redirect_urls + ", payer="
				+ payer + ", transactions=" + transactions + ", application_context=" + application_context + "]";
	}

}
