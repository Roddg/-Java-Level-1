package ru.specialist;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("Решение квадратного уравнения");
		Scanner sc = new Scanner( System.in );
		
		System.out.print("a = ");
		double a = sc.nextDouble();
		System.out.print("b = ");
		double b = sc.nextDouble();
		System.out.print("c = ");
		double c = sc.nextDouble();
		
		if (a == 0.0)
			System.out.println("Это не квадратное уравнение");
		else {
			double d = b*b - 4*a*c;
			// Math.pow(b, 2)
			if (d < 0.0)
				System.out.println("Корней нет");
			else {
				if (d == 0.0) {
					double x = -b / (2 * a);
					System.out.printf("x = %f\n", x);
				}
				else {
					double ds = Math.sqrt(d);
					double x1 = (-b+ds) / (2*a);
					double x2 = (-b-ds) / (2*a);
					System.out.printf("x1 = %f\nx2 = %f\n", x1, x2);
				}
			}
		}
	}

}
