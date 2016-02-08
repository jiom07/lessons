package ru.alex.tests;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello");
		int var1 = 1;
		int var2;
		long varLong = 100;
		byte b;
		short sh;
		float fl = 1.7f;
		double db = 1.45;
		float fl1 = 3 * 2.5f;
		System.out.println(fl1);
		char cg = 'f';
		String str = "test class";
		boolean bool = true; // = false;
		int[] arrayInt = new int[15];
		int arr1[] = { 1, 2, 56, 4, 5, 7 };
		int[][][] arrCh;
		arrCh = new int[124][178][134];
		{
			int k = 0;
			{
				k = 123;
				{
					int h = 0;
					k = 654;

				}

				// .h=123;
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		int counter = 0;
		for (int i = 0; i < 124; i++) {
			for (int j = 0; j < 178; j++) {
				for (int k = 0; k < 134; k++) {
					arrCh[i][j][k] = counter;
					counter++;
				}
			}
		}

		// int j=0;
		// while(j<100){
		// j++;
		// }
		// counter=0;
		int i = 0;
		while (i < 124) {
			int j = 0;
			while (j < 178) {
				int k = 0;
				while (k < 134) {
					arrCh[i][j][k] = counter;
					counter++;
					k++;
				}
				j++;
			}
			i++;
		}

		i = 0;
		do {

			int j = 0;

			do {
				int k = 0;

				do {
					arrCh[i][j][k] = counter;
					counter++;
					k++;
				} while (k < 134);
				j++;
			} while (j < 178);
			i++;
		} while (i < 124);

		System.out.println(counter);

		System.out.println(arrCh[123][177][133]);
		if (i < 100) {

		} else {

		}
		if (i > 10) {

		} else if (i < 5) {

		} else {

		}
		char ch = 'b';
		i = 0;
		switch (ch) {
		case 'a':
			i++;
			break;
		case 'b':
			i--;
			break;
		default:
			i = 100;
		}
		System.out.println(i);
	}
}
