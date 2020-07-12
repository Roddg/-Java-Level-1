package ru.specialist;

public class Program {
	public static void main(String[] args) {
		int a = -10;
		if (a > 0) {
			System.out.println("a > 0");
			System.out.println("a больше нуля");
		}
		else {
			if (a > -100)
				System.out.println("a > -100");
			else
				System.out.println("a НЕ больше нуля");
		}
		
		int n = 10;
		/*String s;
		if (n == 0)
			s = "ноль";
		else
			s = "не ноль";*/
		
		System.out.println((n != 0) ? ((n> 100) ? "много" : "мало") : "ноль");
		
		int k = 20;
		int y =1;
		final int x = y;
		/*String result;
		switch(k) {
			case -1:
			case 1:
				result = "один";
				break; // return
			case 2:
				result = "два";
				break;
			case 3:
				result = "три";
				break;
			default:
				result = "Много";
		}*/
		String result = switch(k) {
			case 1, -1 -> "один";
			case 2 ->"два";
			case 3 -> "три";
			default -> "Много";
		};
		/*String result = switch(k) {
			case 1: yield "один";
			case 2: yield"два";
			case 3: yield "три";
			default: yield "Много";
		}*/
		
		
		System.out.println(result);
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
