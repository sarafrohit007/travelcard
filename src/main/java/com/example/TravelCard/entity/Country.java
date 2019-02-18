package com.example.TravelCard.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country", catalog = "paymentdb")
public class Country implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = -7733427259853547053L;

	private Integer id;

	private String code;

	private String name;

	private String calling_code;

	private String reverse_calling_code;

	private String flag_url;

	private boolean operation_enabled;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "code")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "calling_code")
	public String getCalling_code() {
		return calling_code;
	}

	public void setCalling_code(String calling_code) {
		this.calling_code = calling_code;
	}

	@Column(name = "reverse_calling_code")
	public String getReverse_calling_code() {
		return reverse_calling_code;
	}

	public void setReverse_calling_code(String reverse_calling_code) {
		this.reverse_calling_code = reverse_calling_code;
	}

	@Column(name = "flag_url")
	public String getFlag_url() {
		return flag_url;
	}

	public void setFlag_url(String flag_url) {
		this.flag_url = flag_url;
	}

	@Column(name = "operation_enabled")
	public boolean isOperation_enabled() {
		return operation_enabled;
	}

	public void setOperation_enabled(boolean operation_enabled) {
		this.operation_enabled = operation_enabled;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", code=" + code + ", name=" + name + ", calling_code=" + calling_code
				+ ", reverse_calling_code=" + reverse_calling_code + ", flag_url=" + flag_url + ", operation_enabled="
				+ operation_enabled + "]";
	}

}
