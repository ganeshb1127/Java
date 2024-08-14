package com.tnsif.day8.multilevel;

public class city extends state {
	private String cityname;
	private String area;
	public city() {
		super();
	}
	public city(String cityname, String area,String statename, String language,String name, String capital) {
		super(statename,language,name,capital);
		this.cityname = cityname;
		this.area = area;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "city [cityname=" + cityname + ", area=" + area + ", getStatename()=" + getStatename()
				+ ", getLanguage()=" + getLanguage() + ", getName()=" + getName() + ", getCapital()=" + getCapital()
				+ "]";
	}
	
	

}
