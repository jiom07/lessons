package ru.alex.tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import ru.alex.cars.AbstractCar;
import ru.alex.cars.Car;
import ru.alex.cars.Moto;
import ru.alex.cars.Track;

public class MapsTest {
	
	private Map<String, AbstractCar> cars = new HashMap<String,AbstractCar>();
	
	public String carNum (){
		Random rand=new Random();
		int num1=rand.nextInt(9);
		int num2= rand.nextInt(9);
		int num3=rand.nextInt(9);
		
		char ch1=(char)(rand.nextInt(25)+65);
		System.out.println(ch1);
		char ch2=(char)(rand.nextInt(25)+65);
		char ch3=(char)(rand.nextInt(25)+65);
		String nomer="";
		nomer= nomer+ String.valueOf(ch1);
		nomer= nomer+ String.valueOf(num1);
		nomer= nomer+ String.valueOf(num2);
		nomer= nomer+ String.valueOf(num3);
		nomer= nomer+ String.valueOf(ch2);
		nomer= nomer+ String.valueOf(ch3);
		return nomer;
	}
	
	public MapsTest genCars(){
		
		for (int i= 0; i<5; i++){
			Random rnd=new Random();
			int r2=rnd.nextInt(3);
			switch(r2){
			case 0:
				
				cars.put(carNum(), new Car());
				break;
			case 1:
				cars.put(carNum(), new Track());
				break;
			case 2:
				cars.put(carNum(), new Moto());
				break;
			}
			
		}
		return this;
	}
	public  void printCars(){
		List<String> arr = new ArrayList<String>();
		String val= " value";
		for (int i=0;i<10;i++){
			arr.add(i+val);
			
		}
		
		for(Map.Entry<String,AbstractCar> entry: cars.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
	
	public static void main(String args[]){
		///carNum();
	   MapsTest obj=new MapsTest();
	   obj.genCars().printCars();
	}

}
