package com.example.TravelCard.dto;

import javax.xml.bind.annotation.XmlRootElement;

public class LoadCardResponse {

	private Integer code;

	private String message;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
