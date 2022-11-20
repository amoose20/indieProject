package com.liveodds.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

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

	public void setBookmakers(List<BookmakersItem> bookmakers){
		this.bookmakers = bookmakers;
	}

	public List<BookmakersItem> getBookmakers(){
		return bookmakers;
	}

	public void setSportKey(String sportKey){
		this.sportKey = sportKey;
	}

	public String getSportKey(){
		return sportKey;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setHomeTeam(String homeTeam){
		this.homeTeam = homeTeam;
	}

	public String getHomeTeam(){
		return homeTeam;
	}

	public void setSportTitle(String sportTitle){
		this.sportTitle = sportTitle;
	}

	public String getSportTitle(){
		return sportTitle;
	}

	public void setCommenceTime(String commenceTime){
		this.commenceTime = commenceTime;
	}

	public String getCommenceTime(){
		return commenceTime;
	}

	public void setAwayTeam(String awayTeam){
		this.awayTeam = awayTeam;
	}

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