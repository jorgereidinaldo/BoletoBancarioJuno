package br.com.jorgereidinaldo.juno.classes;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("result")
public class Result {
	 private String success;
	 Data data;
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}


}
