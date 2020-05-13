package br.com.jorgereidinaldo.juno.classes;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("payments")
public class Payments {
private Payment payment;

public Payment getPayment() {
	return payment;
}

public void setPayment(Payment payment) {
	this.payment = payment;
}
	
	
}

