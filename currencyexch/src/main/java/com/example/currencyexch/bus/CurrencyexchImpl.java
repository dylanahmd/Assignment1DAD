package com.example.currencyexch.bus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.transform.Result;

import com.example.currencyexch.model.*;


public class CurrencyexchImpl {
	private Map<String, ArrayList> exchangeMap = new HashMap<>();
	private ArrayList<Currencychange> list;
	
	public CurrencyexchImpl() {
		Currencychange currencyMalaysia0= new Currencychange( "EUR", 0.212560);
		Currencychange currencyMalaysia1 = new Currencychange( "GBP", 0.189765);
		Currencychange currencyMalaysia2 = new Currencychange( "AUD", 0.330138);
		
		list = new ArrayList<>();
		list.add(currencyMalaysia0);
		list.add(currencyMalaysia1);
		list.add(currencyMalaysia2);
		exchangeMap.put("MYR", list);
		
		Currencychange currencyEuro0= new Currencychange( "MYR", 4.70564);
		Currencychange currencyEuro1 = new Currencychange( "GBP", 0.892819);
		Currencychange currencyEuro2 = new Currencychange( "AUD", 1.55297);
		
		list = new ArrayList<>();
		list.add(currencyEuro0);
		list.add(currencyEuro1);
		list.add(currencyEuro2);
		exchangeMap.put("EUR", list);
		
		Currencychange currencyBritainPound0= new Currencychange( "MYR", 5.27065);
		Currencychange currencyBritainPound1 = new Currencychange( "EUR", 1.12011);
		Currencychange currencyBritainPound2 = new Currencychange( "AUD", 1.73987);
		
		list = new ArrayList<>();
		list.add(currencyBritainPound0);
		list.add(currencyBritainPound1);
		list.add(currencyBritainPound2);
		exchangeMap.put("GBP", list);
		
		
	}
	
	public ArrayList getCurrencyResult (String denomination) {
		return exchangeMap.get(denomination);
	}


}
