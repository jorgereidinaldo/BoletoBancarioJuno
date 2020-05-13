package br.com.jorgereidinaldo.juno.classes;

import java.io.Serializable;
import java.util.ArrayList;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("charge")
public class Charge implements Serializable {
	 private String code;
	 private String dueDate;
	 private String checkoutUrl;
	 private String link;
	 private String payNumber;
	 private BilletDetails billetDetails;
	 private Payments payments;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getCheckoutUrl() {
		return checkoutUrl;
	}
	public void setCheckoutUrl(String checkoutUrl) {
		this.checkoutUrl = checkoutUrl;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getPayNumber() {
		return payNumber;
	}
	public void setPayNumber(String payNumber) {
		this.payNumber = payNumber;
	}
	
	
	public BilletDetails getBilletDetails() {
		return billetDetails;
	}
	public void setBilletDetails(BilletDetails billetDetails) {
		this.billetDetails = billetDetails;
	}
	public Payments getPayments() {
		return payments;
	}
	public void setPayments(Payments payments) {
		this.payments = payments;
	}
	

	 // Getter Methods 

	 
}
