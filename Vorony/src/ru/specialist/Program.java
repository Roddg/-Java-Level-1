package ru.specialist;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Сколько ворон на ветке: ");
		int n = sc.nextInt();
		//sc.close();
		
		String v;
		int n2 = n % 100;
		
		if ( (n2 >= 11) && (n2 <= 14) )
			v = "ворон";
		else
			v = switch(n%10) {
				case 1 -> "ворона";
				case 2,3,4 -> "вороны";
				default -> "ворон";
			};
		
		System.out.printf("На ветке %d %s\n", n, v);
		
		
		

	}

}
