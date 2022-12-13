package com.liveodds.restapi;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Sports.
 */
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

	/**
	 * Set has outrights.
	 *
	 * @param hasOutrights the has outrights
	 */
	public void setHasOutrights(boolean hasOutrights){
		this.hasOutrights = hasOutrights;
	}

	/**
	 * Is has outrights boolean.
	 *
	 * @return the boolean
	 */
	public boolean isHasOutrights(){
		return hasOutrights;
	}

	/**
	 * Set description.
	 *
	 * @param description the description
	 */
	public void setDescription(String description){
		this.description = description;
	}

	/**
	 * Get description string.
	 *
	 * @return the string
	 */
	public String getDescription(){
		return description;
	}

	/**
	 * Set active.
	 *
	 * @param active the active
	 */
	public void setActive(boolean active){
		this.active = active;
	}

	/**
	 * Is active boolean.
	 *
	 * @return the boolean
	 */
	public boolean isActive(){
		return active;
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

	/**
	 * Set group.
	 *
	 * @param group the group
	 */
	public void setGroup(String group){
		this.group = group;
	}

	/**
	 * Get group string.
	 *
	 * @return the string
	 */
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