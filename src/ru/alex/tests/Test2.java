package ru.alex.tests;
import java.util.Random;

public class Test2 {

	public static void main(String[] args) {
		// DO Auto-generated method stub
		Random rnd = new Random();

		int number = rnd.nextInt(4);
		System.out.println(number);
		switch (number) {
		case 0:
			System.out.println("Some");
			// break;
		case 1:
			System.out.println("Out1");
			// break;
		case 2:
			System.out.println("Out2");
			// break;
		default:
			System.out.println("def");
		}
		int i= 3*((9%7)+6)/5;
		
		System.out.println(i);
	}

}
