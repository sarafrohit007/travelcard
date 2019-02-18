package com.example.TravelCard.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "traveller", catalog = "paymentdb")
public class User implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = -6736529380998326179L;

	private Long id;

	private String firstName;

	private String lastName;

	private String name;

	private Date created;

	private Date updated;

	private boolean enable;

	private Set<PaymentCardInfo> paymentCardInfoSet;

	private String status;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "first_name", nullable = false)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "created")
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Column(name = "updated")
	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@Column(name = "enable")
	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "user")
	@Where(clause = "enabled=1")
	@JoinTable(name = "user_card_map", catalog = "paymentdb", joinColumns = {
			@JoinColumn(name = "traveller_id") }, inverseJoinColumns = { @JoinColumn(name = "payment_card_info_id") })
	public Set<PaymentCardInfo> getPaymentCardInfoSet() {
		return paymentCardInfoSet;
	}

	public void setPaymentCardInfoSet(Set<PaymentCardInfo> paymentCardInfoSet) {
		this.paymentCardInfoSet = paymentCardInfoSet;
	}

	@Column(name = "status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", name=" + name
				+ ", created=" + created + ", updated=" + updated + ", enable=" + enable + ", paymentCardInfoSet="
				+ paymentCardInfoSet + ", status=" + status + "]";
	}

	public enum USERSTATUS {
		VERIFIED("verified"),VERIFICATION_PENDING("verification_pending"),DELETED("deleted");

		private String code;

		public String getCode() {
			return code;
		}

		USERSTATUS() {

		}

		USERSTATUS(String code) {
			this.code = code;
		}
	}

}
