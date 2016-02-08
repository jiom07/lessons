package ru.alex.cars;

public class AbstractCar implements Soundable{
	private String type ;
	private String size;
	private String engineType;
	private int numOfTires;
	public AbstractCar(){
		super();
		setType("abstract");
	}
	
	public String getType(){
		return this.type;
	}
	
	/*public int coeffTax(){
		if(type.equals("car")){
			return 1;
		}else if(type.equals("track")){
			return 10;
		}
		return 1;
	}*/

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public int getNumOfTires() {
		return numOfTires;
	}

	public void setNumOfTires(int numOfTires) {
		this.numOfTires = numOfTires;
	}
	
	public void toDo(){
		System.out.println("Beep");
	}
	
	public String toString(){
		return "somestring";
	}
}
