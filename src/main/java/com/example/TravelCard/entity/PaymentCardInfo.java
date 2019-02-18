package com.example.TravelCard.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "payment_card_info", catalog = "paymentdb")
public class PaymentCardInfo implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = 7747666781791666963L;

	public enum CARDISSUINGCOMPANY {

		VISA("visa"), MASTERCARD("mastercard");

		private String code;

		public String getCode() {
			return code;
		}

		CARDISSUINGCOMPANY() {

		}

		CARDISSUINGCOMPANY(String code) {
			this.code = code;
		}

	}

	public enum CARDISSUINGBANK {

		HDFC("hdfc"), AXIS("axis"), SBI("sbi"), ICICI("icici");

		private String name;

		public String getName() {
			return name;
		}

		CARDISSUINGBANK() {

		}

		CARDISSUINGBANK(String name) {
			this.name = name;
		}
	}

	private Long id;

	private String cardNumber;

	private String displayName;

	private String validThrough;

	private String cardIssuedBy;

	private String cardIssuingBank;

	private boolean enable;

	private Date created;

	private Date updated;

	private Set<User> user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getValidThrough() {
		return validThrough;
	}

	public void setValidThrough(String validThrough) {
		this.validThrough = validThrough;
	}

	public String getCardIssuedBy() {
		return cardIssuedBy;
	}

	public void setCardIssuedBy(String cardIssuedBy) {
		this.cardIssuedBy = cardIssuedBy;
	}

	public String getCardIssuingBank() {
		return cardIssuingBank;
	}

	public void setCardIssuingBank(String cardIssuingBank) {
		this.cardIssuingBank = cardIssuingBank;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
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

	@ManyToMany(fetch = FetchType.LAZY)
	@NotNull
	@JoinTable(name ="user_card_map", catalog = "paymentdb" , joinColumns={@JoinColumn (name = "payment_card_info_id")}, inverseJoinColumns={@JoinColumn(name = "traveller_id")})
	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "PaymentCardInfo [id=" + id + ", cardNumber=" + cardNumber + ", displayName=" + displayName
				+ ", validThrough=" + validThrough + ", cardIssuedBy=" + cardIssuedBy + ", cardIssuingBank="
				+ cardIssuingBank + ", enable=" + enable + ", created=" + created + ", updated=" + updated + ", user="
				+ user + "]";
	}

}
