package ru.specialist;

import java.util.Scanner;
import java.util.Random;

public class Program {
	
	public static final int MAX_ATTEMPTS = 7;

	public static void main(String[] args) {
		int x = new Random().nextInt(100)+1;
		//System.out.println( x );
		
		Scanner sc = new Scanner(System.in);
		int y, attempts = 0;
		
		do {
			System.out.print("������ ����� (1-100): ");
			y = sc.nextInt();
			if (y == 0) break;
			attempts++;
			if (y > x) System.out.println("�����");
			if (y < x) System.out.println("����");
		} while ( (y != x) && (attempts < MAX_ATTEMPTS));
		
		if (y == x)
			System.out.printf("�� ��������. ����� �������: %d\n", attempts);
		else
			System.out.println("�� ���������");
		

	}

}
