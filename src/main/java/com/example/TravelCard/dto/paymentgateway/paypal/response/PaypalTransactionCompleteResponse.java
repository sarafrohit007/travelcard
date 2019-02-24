package com.example.TravelCard.dto.paymentgateway.paypal.response;

import java.util.ArrayList;
/* Paypal trxn complete response DTO*/
public class PaypalTransactionCompleteResponse {

	private String id;
	private String create_time;
	private String update_time;
	private String state;
	private String intent;
	private Payer payer;
	private ArrayList<TransactionInfo> transactions;
	private ArrayList<TrxnLinks> links;

	/* Paypal trxn Payer info  DTO*/
	public static class Payer {
		private String payment_method;
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
			return "Payer [payment_method=" + payment_method + ", payer_info=" + payer_info + "]";
		}

		/* Paypal trxn Payer info  DTO*/
		public static class PayerInfo {
			private String email;
			private String first_name;
			private String last_name;
			private String payer_id;
			private ShippingAddress shipping_address;

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
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

			public String getPayer_id() {
				return payer_id;
			}

			public void setPayer_id(String payer_id) {
				this.payer_id = payer_id;
			}

			public ShippingAddress getShipping_address() {
				return shipping_address;
			}

			public void setShipping_address(ShippingAddress shipping_address) {
				this.shipping_address = shipping_address;
			}

			@Override
			public String toString() {
				return "PayerInfo [email=" + email + ", first_name=" + first_name + ", last_name=" + last_name
						+ ", payer_id=" + payer_id + ", shipping_address=" + shipping_address + "]";
			}

			/* Shipping Address of Payee*/
			public static class ShippingAddress {
				private String line1;
				private String line2;
				private String city;
				private String state;
				private String postal_code;
				private String country_code;
				private String phone;
				private String recipient_name;

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

				public String getState() {
					return state;
				}

				public void setState(String state) {
					this.state = state;
				}

				public String getPostal_code() {
					return postal_code;
				}

				public void setPostal_code(String postal_code) {
					this.postal_code = postal_code;
				}

				public String getCountry_code() {
					return country_code;
				}

				public void setCountry_code(String country_code) {
					this.country_code = country_code;
				}

				public String getPhone() {
					return phone;
				}

				public void setPhone(String phone) {
					this.phone = phone;
				}

				public String getRecipient_name() {
					return recipient_name;
				}

				public void setRecipient_name(String recipient_name) {
					this.recipient_name = recipient_name;
				}

				@Override
				public String toString() {
					return "ShippingAddress [line1=" + line1 + ", line2=" + line2 + ", city=" + city + ", state="
							+ state + ", postal_code=" + postal_code + ", country_code=" + country_code + ", phone="
							+ phone + ", recipient_name=" + recipient_name + "]";
				}

			}

		}

	}

	/* Paypal trxn info  DTO*/
	public static class TransactionInfo {
		private AmountInfo amount;
		private String description;
		private ArrayList<ItemList> items;
		private ShippingAddress shipping_address;
		private ArrayList<TrxnRelatedResources> related_resources;

		public AmountInfo getAmount() {
			return amount;
		}

		public void setAmount(AmountInfo amount) {
			this.amount = amount;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public ArrayList<ItemList> getItems() {
			return items;
		}

		public void setItems(ArrayList<ItemList> items) {
			this.items = items;
		}

		public ShippingAddress getShipping_address() {
			return shipping_address;
		}

		public void setShipping_address(ShippingAddress shipping_address) {
			this.shipping_address = shipping_address;
		}

		public ArrayList<TrxnRelatedResources> getRelated_resources() {
			return related_resources;
		}

		public void setRelated_resources(ArrayList<TrxnRelatedResources> related_resources) {
			this.related_resources = related_resources;
		}

		@Override
		public String toString() {
			return "TransactionInfo [amount=" + amount + ", description=" + description + ", items=" + items
					+ ", shipping_address=" + shipping_address + ", related_resources=" + related_resources + "]";
		}

		public static class AmountInfo {
			private String total;
			private String currency;
			private AmountDetailInfo details;

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

			public AmountDetailInfo getDetails() {
				return details;
			}

			public void setDetails(AmountDetailInfo details) {
				this.details = details;
			}

			@Override
			public String toString() {
				return "AmountInfo [total=" + total + ", currency=" + currency + ", details=" + details + "]";
			}

			public static class AmountDetailInfo {
				private String subtotal;
				private String tax;
				private String shipping;

				public String getSubtotal() {
					return subtotal;
				}

				public void setSubtotal(String subtotal) {
					this.subtotal = subtotal;
				}

				public String getTax() {
					return tax;
				}

				public void setTax(String tax) {
					this.tax = tax;
				}

				public String getShipping() {
					return shipping;
				}

				public void setShipping(String shipping) {
					this.shipping = shipping;
				}

				@Override
				public String toString() {
					return "AmountDetailInfo [subtotal=" + subtotal + ", tax=" + tax + ", shipping=" + shipping + "]";
				}

			}

		}

		/* Paypal trxn Item list info  DTO*/
		public static class ItemList {
			private String name;
			private String sku;
			private String price;
			private String currency;
			private String quantity;

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getSku() {
				return sku;
			}

			public void setSku(String sku) {
				this.sku = sku;
			}

			public String getPrice() {
				return price;
			}

			public void setPrice(String price) {
				this.price = price;
			}

			public String getCurrency() {
				return currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}

			public String getQuantity() {
				return quantity;
			}

			public void setQuantity(String quantity) {
				this.quantity = quantity;
			}

			@Override
			public String toString() {
				return "ItemList [name=" + name + ", sku=" + sku + ", price=" + price + ", currency=" + currency
						+ ", quantity=" + quantity + "]";
			}

		}

		/* Shipping address of order delivery*/
		public static class ShippingAddress {
			private String line1;
			private String line2;
			private String city;
			private String state;
			private String postal_code;
			private String country_code;
			private String phone;
			private String recipient_name;

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

			public String getState() {
				return state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getPostal_code() {
				return postal_code;
			}

			public void setPostal_code(String postal_code) {
				this.postal_code = postal_code;
			}

			public String getCountry_code() {
				return country_code;
			}

			public void setCountry_code(String country_code) {
				this.country_code = country_code;
			}

			public String getPhone() {
				return phone;
			}

			public void setPhone(String phone) {
				this.phone = phone;
			}

			public String getRecipient_name() {
				return recipient_name;
			}

			public void setRecipient_name(String recipient_name) {
				this.recipient_name = recipient_name;
			}

			@Override
			public String toString() {
				return "ShippingAddress [line1=" + line1 + ", line2=" + line2 + ", city=" + city + ", state=" + state
						+ ", postal_code=" + postal_code + ", country_code=" + country_code + ", phone=" + phone
						+ ", recipient_name=" + recipient_name + "]";
			}

		}

		/* Paypal trxn related resource info  DTO*/
		public static class TrxnRelatedResources {
			private Order sale;

			public Order getSale() {
				return sale;
			}

			public void setSale(Order sale) {
				this.sale = sale;
			}

			public static class Order {
				private String id;
				private String create_time;
				private String update_time;
				private String state;
				private String parent_payment;
				private Amount amount;
				private ArrayList<OrderLinks> links;

				public String getId() {
					return id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getCreate_time() {
					return create_time;
				}

				public void setCreate_time(String create_time) {
					this.create_time = create_time;
				}

				public String getUpdate_time() {
					return update_time;
				}

				public void setUpdate_time(String update_time) {
					this.update_time = update_time;
				}

				public String getState() {
					return state;
				}

				public void setState(String state) {
					this.state = state;
				}

				public String getParent_payment() {
					return parent_payment;
				}

				public void setParent_payment(String parent_payment) {
					this.parent_payment = parent_payment;
				}

				public Amount getAmount() {
					return amount;
				}

				public void setAmount(Amount amount) {
					this.amount = amount;
				}

				public ArrayList<OrderLinks> getLinks() {
					return links;
				}

				public void setLinks(ArrayList<OrderLinks> links) {
					this.links = links;
				}

				public static class Amount {
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
						return "Amount [total=" + total + ", currency=" + currency + "]";
					}

				}

				public static class OrderLinks {
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
						return "OrderLinks [href=" + href + ", rel=" + rel + ", method=" + method + "]";
					}
				}

				@Override
				public String toString() {
					return "Order [id=" + id + ", create_time=" + create_time + ", update_time=" + update_time
							+ ", state=" + state + ", parent_payment=" + parent_payment + ", amount=" + amount
							+ ", links=" + links + "]";
				}
			}

			@Override
			public String toString() {
				return "TrxnRelatedResources [sale=" + sale + "]";
			}

				
			
		}
	}

	public static class TrxnLinks {
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
			return "TrxnLinks [href=" + href + ", rel=" + rel + ", method=" + method + "]";
		}

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIntent() {
		return intent;
	}

	public void setIntent(String intent) {
		this.intent = intent;
	}

	public Payer getPayer() {
		return payer;
	}

	public void setPayer(Payer payer) {
		this.payer = payer;
	}

	public ArrayList<TransactionInfo> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<TransactionInfo> transactions) {
		this.transactions = transactions;
	}

	public ArrayList<TrxnLinks> getLinks() {
		return links;
	}

	public void setLinks(ArrayList<TrxnLinks> links) {
		this.links = links;
	}

	@Override
	public String toString() {
		return "PaypalTransactionCompleteResponse [id=" + id + ", create_time=" + create_time + ", update_time="
				+ update_time + ", state=" + state + ", intent=" + intent + ", payer=" + payer + ", transactions="
				+ transactions + ", links=" + links + "]";
	}

}
