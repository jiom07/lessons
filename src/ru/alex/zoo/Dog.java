package ru.alex.zoo;

public class Dog extends Animal {

	public Dog(String name) {
		this.count++;
		setName(name);
		setSound("gav-gav");
	}
	public void toDo(){
		System.out.println("Woof");
	}
	public void swim(){
		System.out.println("It swiming ");
	}

}
