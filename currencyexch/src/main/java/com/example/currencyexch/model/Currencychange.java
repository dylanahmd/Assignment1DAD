package com.example.currencyexch.model;


public class Currencychange {
	private String currency;
	private Double exchangerate;
	
	public Currencychange (String currency, Double exchangerate) {
		this.currency = currency;
		this.exchangerate = exchangerate;	
	}
	
	public String getcurrency() {
		return currency;
	}
	public void setcurrency(String currency) {
		this.currency = currency;
	}
	
	public Double getexchangerate() {
		return exchangerate;
	}
	public void setexchangerate(Double exchangerate) {
		this.exchangerate = exchangerate;
	}
	
}