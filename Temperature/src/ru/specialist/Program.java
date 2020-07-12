package ru.specialist;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		
		System.out.print("T (C): ");
		double tc = sc.nextDouble();
		
		double tf = tc * 9 / 5 + 32;
		
		System.out.printf("T (F): %.3f\n", tf);
		

	}

}
