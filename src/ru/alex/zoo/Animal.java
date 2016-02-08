package ru.alex.zoo;

import ru.alex.cars.Soundable;

public class Animal implements Soundable {
	private String sound;
	public String name;
	public static int count=0;
	public Animal(){
		setSound("some animal");
	}
	
	public Animal(String name){
		setName(name);
	}

	
	public String getName(){
		return name;
	}
	public void setName(String name){
		if(name!=null){
			this.name = name;
		}else{
			this.name = "default name";
		}
	}

	public void toDo(){
		System.out.println(this.sound);
	}

	public String getSound() {
		return sound;
	}
	
	public void setSound(String sound) {
		this.sound = sound;
	}

}
