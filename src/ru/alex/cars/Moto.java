package ru.alex.cars;

public class Moto extends AbstractCar{

	public Moto(){
		super();
        setNumOfTires(2);
        setType("Moto");
	}
	
	public void stayToCircle(){
		System.out.println("WOW");
	}
	public String toString(){
		return "Moto";
	}

}
