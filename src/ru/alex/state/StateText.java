package ru.alex.state;

public class StateText extends State {
	public void on(){
		System.out.println("Text On");
	}
	public void off(){
		System.out.println("Text Off");
		
	}
	 public void def(){
	    	System.out.println("State 1 def");
	    	
	    }
public void text(){
	System.out.println("Text On");
}
}
