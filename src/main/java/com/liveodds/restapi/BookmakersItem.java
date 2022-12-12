package com.liveodds.restapi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Bookmakers item.
 */
public class BookmakersItem{

	@JsonProperty("markets")
	private List<MarketsItem> markets;

	@JsonProperty("last_update")
	private String lastUpdate;

	@JsonProperty("title")
	private String title;

	@JsonProperty("key")
	private String key;

	/**
	 * Set markets.
	 *
	 * @param markets the markets
	 */
	public void setMarkets(List<MarketsItem> markets){
		this.markets = markets;
	}

	/**
	 * Get markets list.
	 *
	 * @return the list
	 */
	public List<MarketsItem> getMarkets(){
		return markets;
	}

	/**
	 * Set last update.
	 *
	 * @param lastUpdate the last update
	 */
	public void setLastUpdate(String lastUpdate){
		this.lastUpdate = lastUpdate;
	}

	/**
	 * Get last update string.
	 *
	 * @return the string
	 */
	public String getLastUpdate(){
		return lastUpdate;
	}

	/**
	 * Set title.
	 *
	 * @param title the title
	 */
	public void setTitle(String title){
		this.title = title;
	}

	/**
	 * Get title string.
	 *
	 * @return the string
	 */
	public String getTitle(){
		return title;
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
			"BookmakersItem{" + 
			"markets = '" + markets + '\'' + 
			",last_update = '" + lastUpdate + '\'' + 
			",title = '" + title + '\'' + 
			",key = '" + key + '\'' + 
			"}";
		}
}