package ru.alex.state;

public class StateTag extends State{

	public void on(){
		System.out.println("Tag On");
	}
	public void off(){
		System.out.println("Tag Off");
		
	}
	public void text(){
		System.out.println("Text On");
	}
 
}
