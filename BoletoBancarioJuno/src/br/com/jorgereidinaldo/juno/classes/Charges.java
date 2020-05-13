package br.com.jorgereidinaldo.juno.classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("charges")
public class Charges implements Serializable{
	//ArrayList < Charge > charge = new ArrayList < Charge > ();
	
	
	private List<Charge> charge;

	public List<Charge> getCharge() {
		return charge;
	}

	public void setCharge(List<Charge> charge) {
		this.charge = charge;
	}

	

	

	
	 
}
