package com.liveodds.entity;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sports{

	@JsonProperty("Sports")
	private List<SportsItem> sports;

	public void setSports(List<SportsItem> sports){
		this.sports = sports;
	}

	public List<SportsItem> getSports(){
		return sports;
	}

	@Override
 	public String toString(){
		return 
			"Sports{" + 
			"sports = '" + sports + '\'' + 
			"}";
		}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Sports sports1 = (Sports) o;
		return Objects.equals(sports, sports1.sports);
	}

	@Override
	public int hashCode() {
		return Objects.hash(sports);
	}
}