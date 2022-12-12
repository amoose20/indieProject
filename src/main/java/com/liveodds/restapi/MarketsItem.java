package com.liveodds.restapi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Markets item.
 */
public class MarketsItem{

	@JsonProperty("outcomes")
	private List<OutcomesItem> outcomes;

	@JsonProperty("key")
	private String key;

	/**
	 * Set outcomes.
	 *
	 * @param outcomes the outcomes
	 */
	public void setOutcomes(List<OutcomesItem> outcomes){
		this.outcomes = outcomes;
	}

	/**
	 * Get outcomes list.
	 *
	 * @return the list
	 */
	public List<OutcomesItem> getOutcomes(){
		return outcomes;
	}

	/**
	 * Set key.
	 *
	 * @param key the key
	 */
	public void setKey(String key){
		this.key = key;
	}

	/**
	 * Get key string.
	 *
	 * @return the string
	 */
	public String getKey(){
		return key;
	}

	@Override
 	public String toString(){
		return 
			"MarketsItem{" + 
			"outcomes = '" + outcomes + '\'' + 
			",key = '" + key + '\'' + 
			"}";
		}
}