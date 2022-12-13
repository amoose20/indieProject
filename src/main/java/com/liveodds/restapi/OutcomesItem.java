package com.liveodds.restapi;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Outcomes item.
 */
public class OutcomesItem{

	@JsonProperty("price")
	private int price;

	@JsonProperty("name")
	private String name;

	/**
	 * Set price.
	 *
	 * @param price the price
	 */
	public void setPrice(int price){
		this.price = price;
	}

	/**
	 * Get price int.
	 *
	 * @return the int
	 */
	public int getPrice(){
		return price;
	}

	/**
	 * Set name.
	 *
	 * @param name the name
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 * Get name string.
	 *
	 * @return the string
	 */
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