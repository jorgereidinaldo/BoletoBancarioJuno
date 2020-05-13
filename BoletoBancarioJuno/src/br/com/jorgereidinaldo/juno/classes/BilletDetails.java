package br.com.jorgereidinaldo.juno.classes;

import java.io.Serializable;

public class BilletDetails implements Serializable {
	 private String bankAccount;
	 private String ourNumber;
	 private String barcodeNumber;
	 private String portfolio;


	 // Getter Methods 

	 public String getBankAccount() {
	  return bankAccount;
	 }

	 public String getOurNumber() {
	  return ourNumber;
	 }

	 public String getBarcodeNumber() {
	  return barcodeNumber;
	 }

	 public String getPortfolio() {
	  return portfolio;
	 }

	 // Setter Methods 

	 public void setBankAccount(String bankAccount) {
	  this.bankAccount = bankAccount;
	 }

	 public void setOurNumber(String ourNumber) {
	  this.ourNumber = ourNumber;
	 }

	 public void setBarcodeNumber(String barcodeNumber) {
	  this.barcodeNumber = barcodeNumber;
	 }

	 public void setPortfolio(String portfolio) {
	  this.portfolio = portfolio;
	 }
}
