package ru.alex.cars;

public class Car extends AbstractCar{
	
	public Car(){
		super();
		setType("passenger");
	}
	public String toString(){
		return "Car";
	}

}
