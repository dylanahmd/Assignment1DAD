package com.example.currencyexch.soap.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.currencyexch.soap.CurrencyexchService;

@Configuration
public class CurrencyexchSoapConfig {
	@Autowired
	private Bus bus;
	
	@Bean
	public Endpoint endPoint() {
		Endpoint endpointImpl = new EndpointImpl(bus, new CurrencyexchService());
		endpointImpl.publish("/service");
		return endpointImpl;
	}
}
