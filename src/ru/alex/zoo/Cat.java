package ru.alex.zoo;

public class Cat extends Animal {

	public Cat(String name) {
		this.count++;
		setName(name);
		setSound("mayu");
	}
	public void toDo(){
		System.out.println("Meow");
	}
	public void laz(){
		System.out.println("On the three ");
	}

}
