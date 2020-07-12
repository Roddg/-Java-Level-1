package ru.specialist;

public class Program {
	
	// int gcd(int k1, int k2)
	// НОД(35, 14) == 7
	// k1 > k2
	// k1 % k2 = k3 (if k == 0) => k2
	// k2 % k3 = k4
	// k3 % k4 = k5
	// gcd (1071, 462) == 21
	// gcd (462, 1071) == 21
	
	public static int gcd(int k1, int k2) {
		int k3;
		
		while ( (k3 = k1 % k2) != 0 ) {
			k1 = k2;
			k2 = k3;
		}
		
		return k2;
		
	}
	
	
	
	public static double average(int a, int b) {
		double avg = (a + b) / 2d;
		if (avg >= 0d)
			return avg;
		else
			return -avg;
		
	}
	
	// Overloading
	public static void sayHello(int age) {
		System.out.printf("Привет, %d!\n", age);
	}
	
	public static void sayHello() {
		sayHello("Unknown");
	}
	public static void sayHello(String name) {
		System.out.printf("Привет, %s!\n", name);
	}
	
	public static void sayHello(String name, int age) {
		System.out.printf("Привет, %s - %d!\n", name, age);
	}
	
	public static double average(int... m /*int[] m*/) {
		int summa = 0;
		for(int k : m)
			summa += k;
		
		return (double)summa / m.length;
		
	}
	
	static void test1(int k) {
		k++;
		System.out.printf("test1 k = %d\n", k); // 11
	}
	static void test2(int[] k) {
		k[0]++;
		System.out.printf("test2 k = %d\n", k[0]); // 11
	}
	static void test3(Integer k) {
		//k++; // k = k + 1;
		k = 11; // k = new Integer(11);
		System.out.printf("test3 k = %d\n", k); // 11
		//System.out.printf("test3 hash k = %d\n", k.hashCode()); // 11
	}
	
	public static void main(String[] args) {
		{
			int k = 10;
			test1(k);
			System.out.printf("main1 k = %d\n", k); // 10
		}
		{
			int[] k = {10};
			test2(k);
			System.out.printf("main1 k = %d\n", k[0]); // 11
		}
		{
			Integer k = 10;
			test3(k);
			System.out.printf("main3 k = %d\n", k); // 10
		}
		
		//Program p = new Program();
		//p.sayHello();
		Program.sayHello("Сергей", 42);
		sayHello("Костя");
		sayHello(18);
		sayHello();
		
		double x = average(10, 11);
		System.out.println(x);

		System.out.println( average(10, 11) );
		
		System.out.println( average(new int[] {10, 11, 12, 13}) );
		
		System.out.println( average(10, 11, 12, 13, 14) );
		
		System.out.println( gcd(1071, 462) );
		System.out.println( gcd(462, 1071) );
	}

}
