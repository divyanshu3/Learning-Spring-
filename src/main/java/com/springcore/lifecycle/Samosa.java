package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("set property");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	
	
	@PostConstruct // using annotation
	public void init() {
		System.out.println("Inside init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy");
	}
}
