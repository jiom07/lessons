package ru.alex.state;

public abstract class State {
	public void on(){
		System.out.println("State On");
	}
	public void off(){
		System.out.println("State Off");
		
	}
    public void def(){
    	System.out.println("State def");
    	
    }
    public void text(){
    	System.out.println("Text on");
    }
}
