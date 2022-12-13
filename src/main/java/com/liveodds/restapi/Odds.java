package com.liveodds.restapi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Odds.
 */
public class Odds{

	@JsonProperty("bookmakers")
	private List<BookmakersItem> bookmakers;

	@JsonProperty("sport_key")
	private String sportKey;

	@JsonProperty("id")
	private String id;

	@JsonProperty("home_team")
	private String homeTeam;

	@JsonProperty("sport_title")
	private String sportTitle;

	@JsonProperty("commence_time")
	private String commenceTime;

	@JsonProperty("away_team")
	private String awayTeam;

	/**
	 * Set bookmakers.
	 *
	 * @param bookmakers the bookmakers
	 */
	public void setBookmakers(List<BookmakersItem> bookmakers){
		this.bookmakers = bookmakers;
	}

	/**
	 * Get bookmakers list.
	 *
	 * @return the list
	 */
	public List<BookmakersItem> getBookmakers(){
		return bookmakers;
	}

	/**
	 * Set sport key.
	 *
	 * @param sportKey the sport key
	 */
	public void setSportKey(String sportKey){
		this.sportKey = sportKey;
	}

	/**
	 * Get sport key string.
	 *
	 * @return the string
	 */
	public String getSportKey(){
		return sportKey;
	}

	/**
	 * Set id.
	 *
	 * @param id the id
	 */
	public void setId(String id){
		this.id = id;
	}

	/**
	 * Get id string.
	 *
	 * @return the string
	 */
	public String getId(){
		return id;
	}

	/**
	 * Set home team.
	 *
	 * @param homeTeam the home team
	 */
	public void setHomeTeam(String homeTeam){
		this.homeTeam = homeTeam;
	}

	/**
	 * Get home team string.
	 *
	 * @return the string
	 */
	public String getHomeTeam(){
		return homeTeam;
	}

	/**
	 * Set sport title.
	 *
	 * @param sportTitle the sport title
	 */
	public void setSportTitle(String sportTitle){
		this.sportTitle = sportTitle;
	}

	/**
	 * Get sport title string.
	 *
	 * @return the string
	 */
	public String getSportTitle(){
		return sportTitle;
	}

	/**
	 * Set commence time.
	 *
	 * @param commenceTime the commence time
	 */
	public void setCommenceTime(String commenceTime){
		this.commenceTime = commenceTime;
	}

	/**
	 * Get commence time string.
	 *
	 * @return the string
	 */
	public String getCommenceTime(){
		return commenceTime;
	}

	/**
	 * Set away team.
	 *
	 * @param awayTeam the away team
	 */
	public void setAwayTeam(String awayTeam){
		this.awayTeam = awayTeam;
	}

	/**
	 * Get away team string.
	 *
	 * @return the string
	 */
	public String getAwayTeam(){
		return awayTeam;
	}

	@Override
 	public String toString(){
		return 
			"Odds{" + 
			"bookmakers = '" + bookmakers + '\'' + 
			",sport_key = '" + sportKey + '\'' + 
			",id = '" + id + '\'' + 
			",home_team = '" + homeTeam + '\'' + 
			",sport_title = '" + sportTitle + '\'' + 
			",commence_time = '" + commenceTime + '\'' + 
			",away_team = '" + awayTeam + '\'' + 
			"}";
		}
}