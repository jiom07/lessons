package ru.alex.textReader;

import java.util.HashMap;

public class CssStyle {
	private String name;
	private HashMap <String, String> properties;
	public void setName(String name){
		this.name=name;
	}
    public String getName(){
    	return this.name;
    }
    public void setProperties(HashMap properties){
		this.properties=properties;
	}
    public HashMap getProperties(){
    	return this.properties;
    }
}
