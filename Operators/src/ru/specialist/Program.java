package ru.specialist;

public class Program {
	public static void main(String[] args) {
		int a = -10;
		if (a > 0) {
			System.out.println("a > 0");
			System.out.println("a ������ ����");
		}
		else {
			if (a > -100)
				System.out.println("a > -100");
			else
				System.out.println("a �� ������ ����");
		}
		
		int n = 10;
		/*String s;
		if (n == 0)
			s = "����";
		else
			s = "�� ����";*/
		
		System.out.println((n != 0) ? ((n> 100) ? "�����" : "����") : "����");
		
		int k = 20;
		int y =1;
		final int x = y;
		/*String result;
		switch(k) {
			case -1:
			case 1:
				result = "����";
				break; // return
			case 2:
				result = "���";
				break;
			case 3:
				result = "���";
				break;
			default:
				result = "�����";
		}*/
		String result = switch(k) {
			case 1, -1 -> "����";
			case 2 ->"���";
			case 3 -> "���";
			default -> "�����";
		};
		/*String result = switch(k) {
			case 1: yield "����";
			case 2: yield"���";
			case 3: yield "���";
			default: yield "�����";
		}*/
		
		
		System.out.println(result);
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
