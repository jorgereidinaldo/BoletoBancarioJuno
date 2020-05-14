package br.com.jorgereidinaldo.juno.classes;

import java.math.BigDecimal;
import java.util.Date;

public class Payment {
	private String id;
	private BigDecimal amount;
	private String date;
	private BigDecimal fee;
	private String type;
	private String status;
	private String creditCardId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreditCardId() {
		return creditCardId;
	}
	public void setCreditCardId(String creditCardId) {
		this.creditCardId = creditCardId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public BigDecimal getFee() {
		return fee;
	}
	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}
	




	}