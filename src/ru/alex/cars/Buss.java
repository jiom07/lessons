package ru.alex.cars;

public class Buss extends Track {
	private String type = "buss";
    public boolean hastail;
	public Buss(){
		super();
	    setType(this.type);
	}
	
	public boolean isHastail() {
		return hastail;
	}
	public void setHastail(boolean hastail) {
		this.hastail = hastail;
	}
	
	
	public String getType(){
		return this.type;
	}
 
}
