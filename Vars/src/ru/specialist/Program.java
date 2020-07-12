package ru.specialist;

import java.util.Scanner;

public class Program {
	
	public int q;
	public static final double PI = 3.1415;
	
	public static int counter;

	public static void main(String[] args) {
		{
			// since Java 10
			var program = new Program();
			//var במנש = new ֱמנש();
			
			var x = 5; // int x = 5;
			//x = "abc";
			var str = "abc"; // String str = "abc"
			
		}
		
		System.out.println(Math.PI);
		{
			
			int t = 0b010;
			
			char c = '\u003F';
			
			long r = Integer.MAX_VALUE + 1L;
			int w = (int)r;
			
			System.out.println(r);
			
			
			
			double d =  (double)r / 2;
			float f = 1.5F;
			
			final int z = 10;
			
			final int x = new Scanner(System.in).nextInt();
			System.out.println(x);
			
			// x = 12;
			
		}
		
		{
			int x = 10;
			{
				System.out.println(x);
			}
		}
		{
			//String x = "abc";
			int x = 100;
			System.out.println(x);
		}
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
			
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		
		
		{
		//Integer x = 2; // new Integer(2)
		//Integer y = 3; // new Integer(5)
		//Integer z = x + y;
		
		
		
		
		
		System.out.println(counter);
		
		int a,b;
		
		a = (b = 5);
		
		int userCounter = 10;
		//Math.PI
		
		counter = userCounter + 2 * 3;
		
		System.out.println( counter );
		
		counter = 30;
		
		//counter = counter + 2;
		counter += 2;
		
		
		//b = 10;
		//a = b += 2;
		
		a = 10;
		//a = a + 1;
		//a += 1;
		
		// bad
		// b = a++ + ++a; // UB 
		    // 10  +  12
		
		System.out.println( a );
		System.out.println( b );
		}
		{
			
			boolean a = true;
			boolean b = false;
			
			boolean c = a || !b;
			
			
		}
		
		

	}

}
