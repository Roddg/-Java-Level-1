package ru.specialist;

public class Program {

	public static void main(String[] args) {
		for(int i=1; i <= 10; i++) {
			if (i == 4) continue;
			if (i == 8) break;
			System.out.println(i);
		}
		
		// 1 2 3 4 ... 10
		// 2 4 6 8 ... 20
		// ...
		int rows = 10;
		int cols = 10;
		
		metka:
		for(int i=1; i <= rows; i++) {
			for(int j=1; j <= cols; j++) {
				if (j == 5) break metka;
				System.out.printf("%4d", i*j);
			}
			System.out.println();
		}
		System.out.println("\ncontinue");
		
		int a = 2000;
		//for(;a<1000;)
		while( a < 1000 )
		{
			System.out.println(a);
			a *= 2; // a = a * 2;
		}
		
		a = 2000;
		do {
			System.out.println(a);
		} while ( (a *= 2) < 1000);
		
		//  1 1 2 3 5 8 13 21 ....
		int n1 = 1;
		int n2 = 1;
		System.out.println(n1);
		System.out.println(n2);
		int n3;
		while ( (n3 = n1 + n2) < 1000) {
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
