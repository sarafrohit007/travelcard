package com.example.TravelCard.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "card_load_transaction", catalog = "paymentdb")
public class CardLoadTransaction implements Serializable {

	/**
	 * @author rohitsaraf
	 */

	private static final long serialVersionUID = 7658147143467915767L;

	private Long id;

	private Date created;

	private Date updated;

	private PaymentCardInfo paymentCardInfo;

	private String status;

	private String mode;

	private BigDecimal amount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public PaymentCardInfo getPaymentCardInfo() {
		return paymentCardInfo;
	}

	public void setPaymentCardInfo(PaymentCardInfo paymentCardInfo) {
		this.paymentCardInfo = paymentCardInfo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "CardLoadTransaction [id=" + id + ", created=" + created + ", updated=" + updated + ", paymentCardInfo="
				+ paymentCardInfo + ", status=" + status + ", mode=" + mode + ", amount=" + amount + "]";
	}

	public enum CardLoadTrxnStatus {

		SUCCESS("success"), FAIL("fail"), PENDING("pending"), REFUND_REQUESTED("refund requested"), REFUNDED(
				"refunded");

		private String status;

		public String getStatus() {
			return status;
		}

		CardLoadTrxnStatus() {

		}

		CardLoadTrxnStatus(String status) {
			this.status = status;
		}

	}

	public enum ModeOfCardLoadTrxn {

		CARD("card"), PAYPAL("paypal"), UPI("upi");

		private String code;

		public String getCode() {
			return code;
		}

		ModeOfCardLoadTrxn() {

		}

		ModeOfCardLoadTrxn(String code) {
			this.code = code;
		}
	}

}
