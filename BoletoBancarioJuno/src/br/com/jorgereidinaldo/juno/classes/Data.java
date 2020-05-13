package br.com.jorgereidinaldo.juno.classes;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("data")
public class Data {
	 Charges charges;

	public Charges getCharges() {
		return charges;
	}

	public void setCharges(Charges charges) {
		this.charges = charges;
	}


	 // Getter Methods 

	 
}
