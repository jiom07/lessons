package ru.alex.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ru.alex.cars.Car;
import ru.alex.cars.Moto;
import ru.alex.cars.Soundable;
import ru.alex.zoo.Cat;
import ru.alex.zoo.Dog;

public class testInterface {
	public static void main(String args[]) {
		List<Soundable> soundsList = new ArrayList<Soundable>();
		soundsList.add(new Cat(""));
		soundsList.add(0, new Dog(""));
		soundsList.add(new Car());
		soundsList.get(0).toDo();
		soundsList.get(1).toDo();
		soundsList.get(2).toDo();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++==");
		Soundable sounds[] = new Soundable[10];
		for (int i = 0; i < 10; i++) {
			Soundable sound = null;
			Random ran = new Random();
			int type = ran.nextInt(4);
			switch (type) {
			case 0:
				sound = new Car();
				break;
			case 1:
				sound = new Dog("Lucky");
				break;
			case 2:
				sound = new Moto();
				break;
			case 3:
				sound = new Cat("Fluke");
			}

			sounds[i] = sound;
		}

		for (int i = 0; i < sounds.length; i++) {
			sounds[i].toDo();
			if (sounds[i] instanceof Cat) {
				System.out.println("Cat");
			} else if (sounds[i] instanceof Moto) {
				System.out.println("Moto");
			} else if (sounds[i] instanceof Car) {
				System.out.println("Car");
			}

		}
	}
}
