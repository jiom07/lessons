package ru.alex.vt;

public class Methods {

	public static void main(String[] args) {
		Reader r = new Reader();
		r.Scan();
		r.i=count(r.i);
		r.k=count(r.k);
		System.out.println("For now your number is "+r.i);
		System.out.println("For now your number is "+r.k);
	}
	
	private static int count(int x){
		x = x + 1;
		return x;
	}

}
