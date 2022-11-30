package com.liveodds.restapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OutcomesItem{

	@JsonProperty("price")
	private int price;

	@JsonProperty("name")
	private String name;

	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return price;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"OutcomesItem{" + 
			"price = '" + price + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}