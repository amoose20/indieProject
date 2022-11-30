package com.liveodds.restapi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MarketsItem{

	@JsonProperty("outcomes")
	private List<OutcomesItem> outcomes;

	@JsonProperty("key")
	private String key;

	public void setOutcomes(List<OutcomesItem> outcomes){
		this.outcomes = outcomes;
	}

	public List<OutcomesItem> getOutcomes(){
		return outcomes;
	}

	public void setKey(String key){
		this.key = key;
	}

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