package ru.alex.cars;

import java.util.Random;

import ru.alex.zoo.Animal;

public class Garage {
	final int sz = 10;
	private AbstractCar[] garage = new AbstractCar[sz];

	public void addCar(AbstractCar car) {
		for (int i = 0; i < sz; i++) {
			if (garage[i] == null) {
				garage[i] = car;
				break;
			}
		}
	}

	public AbstractCar getCar(int box) {
		return garage[box];
	}

	public void pushInGarage() {
		for (int i = 0; i < sz; i++) {

			Random rand = new Random();
			int r1 = rand.nextInt(4);

			switch (r1) {
			case 0:
				addCar(new Car());
				break;
			case 1:
				addCar(new Moto());
				break;
			case 2:
				addCar(new Track());
				break;
			case 3:
				addCar(new Buss());
				break;
			}

		}
	}

	public void printAllCars() {
		int i = 0;
		for (AbstractCar car : garage) {
			System.out.println("i = " + (i++) + car.getType());
			//if(car instanceof Moto){
				/*Moto moto = (Moto) car;
				moto.stayToCircle();*/
				((Moto)car).stayToCircle();
			//}
		}
	}
	
}
