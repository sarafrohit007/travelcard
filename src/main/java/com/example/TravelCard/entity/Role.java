package com.example.TravelCard.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "role", catalog = "paymentdb")
public class Role implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = -3922497584575818147L;

	private Long id;

	private String name;

	private User userId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", userId=" + userId + "]";
	}

}
