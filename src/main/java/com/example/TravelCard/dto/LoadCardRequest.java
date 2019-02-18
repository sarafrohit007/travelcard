package com.example.TravelCard.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

public class LoadCardRequest {

	@NotNull
	private Long userId;

	@NotNull
	private BigDecimal amount;

	@NotNull
	private String pgName;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getPgName() {
		return pgName;
	}

	public void setPgName(String pgName) {
		this.pgName = pgName;
	}

	@Override
	public String toString() {
		return "LoadCardRequest [userId=" + userId + ", amount=" + amount + ", pgName=" + pgName + "]";
	}

}
