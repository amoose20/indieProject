package com.liveodds.restapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sports{

	@JsonProperty("has_outrights")
	private boolean hasOutrights;

	@JsonProperty("description")
	private String description;

	@JsonProperty("active")
	private boolean active;

	@JsonProperty("title")
	private String title;

	@JsonProperty("key")
	private String key;

	@JsonProperty("group")
	private String group;

	public void setHasOutrights(boolean hasOutrights){
		this.hasOutrights = hasOutrights;
	}

	public boolean isHasOutrights(){
		return hasOutrights;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setActive(boolean active){
		this.active = active;
	}

	public boolean isActive(){
		return active;
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

	public void setGroup(String group){
		this.group = group;
	}

	public String getGroup(){
		return group;
	}

	@Override
 	public String toString(){
		return 
			"Sports{" + 
			"has_outrights = '" + hasOutrights + '\'' + 
			",description = '" + description + '\'' + 
			",active = '" + active + '\'' + 
			",title = '" + title + '\'' + 
			",key = '" + key + '\'' + 
			",group = '" + group + '\'' + 
			"}";
		}
}