package com.example.currencyexch.soap;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.example.currencyexch.bus.CurrencyexchImpl;
import com.example.currencyexch.model.Currencychange;

@WebService
public class CurrencyexchService {
	CurrencyexchImpl cc = new CurrencyexchImpl();
	
	@WebMethod
	public ArrayList<Currencychange> getCurrencyResult (String denomination) {
		return cc.getCurrencyResult(denomination);
	}
}
