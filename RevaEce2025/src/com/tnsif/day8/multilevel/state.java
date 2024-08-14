package com.tnsif.day8.multilevel;

public class state extends country {
	private String statename;
	private String language;
	public state() {
		super();
	}
	public state(String statename, String language,String name, String capital) {
		super( name, capital);
		this.statename = statename;
		this.language = language;
	}
	
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "state [statename=" + statename + ", language=" + language + ", getName()=" + getName()
				+ ", getCapital()=" + getCapital() + "]";
	}
	

}
