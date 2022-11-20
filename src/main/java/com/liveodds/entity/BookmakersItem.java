package com.liveodds.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BookmakersItem{

	@JsonProperty("markets")
	private List<MarketsItem> markets;

	@JsonProperty("last_update")
	private String lastUpdate;

	@JsonProperty("title")
	private String title;

	@JsonProperty("key")
	private String key;

	public void setMarkets(List<MarketsItem> markets){
		this.markets = markets;
	}

	public List<MarketsItem> getMarkets(){
		return markets;
	}

	public void setLastUpdate(String lastUpdate){
		this.lastUpdate = lastUpdate;
	}

	public String getLastUpdate(){
		return lastUpdate;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
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
			"BookmakersItem{" + 
			"markets = '" + markets + '\'' + 
			",last_update = '" + lastUpdate + '\'' + 
			",title = '" + title + '\'' + 
			",key = '" + key + '\'' + 
			"}";
		}
}