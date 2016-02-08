package ru.alex.zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import ru.alex.cars.Soundable;
import ru.alex.tests.MapsTest;

public class ZooFabric {
	
	public Cat getCat(){
		return new Cat("");
	}
	
	
	
	public static void main(String[] args) {
		//Animal.count = 100;
		List<Animal> animals = new ArrayList<Animal>();
		for (int i = 0; i < 10; i++) {
			Animal animal;//
			Random rand = new Random();
			int r1 = rand.nextInt(3);
			switch (r1) {
			case 0:
				animal = new Cat("Murzik N" + String.valueOf(i));
				//Animal.count++;
				break;
			case 1:
				animal = new Dog("Bobik N" + i);
				//Animal.count++;
				break;
			default:
				animal = new Animal();
				Animal.count++;

			}
			
			
			
			animals.add(animal);
		}
		for (int i = 0; i < animals.size(); i++) {
			animals.get(i).toDo();

			if (animals.get(i) instanceof Cat) {
				System.out.print("The cat name is: " + animals.get(i).getName() + " ");
				((Cat) animals.get(i)).laz();
			} else if (animals.get(i) instanceof Dog) {
				System.out.print("The dog name is: " + animals.get(i).getName() + " ");
				((Dog) animals.get(i)).swim();
			} else if (animals.get(i) instanceof Animal) {
				System.out.println("bingo!");
			}
		}
		
		System.out.println(Animal.count);
		
		HashMap <String, String> mapAl = new HashMap<String,String>();
		String str1 = "Test String1";
		String str2 = "Test";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		mapAl.put(str1, "al1");
		mapAl.put(str2, "al2");
	}

}
