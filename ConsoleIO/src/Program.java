
import java.time.LocalDate;
import java.time.LocalTime;
//import java.io.InputStreamReader;
//import java.io.BufferedReader;
//import java.io.IOException;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) 
		//throws IOException
	{
		System.out.print("Hello");
		System.out.println("Sergey");

		/*
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("Ваше имя: ");
		String name = reader.readLine();
		
		System.out.print("Ваш возраст: ");
		int age = Integer.parseInt( reader.readLine() );
		//Double.parseDouble(s)*/
		
		// На ветке 5 ворон
		// 372
		// На ветке 372 вороны
		
		Scanner sc = new Scanner( System.in );
		System.out.print("Ваше имя: ");
		String name = sc.nextLine();
		System.out.print("Ваш возраст: ");
		int age = sc.nextInt();
		
		
		// Привет, Сергей - 42!
		System.out.printf("Привет, %2$s - %1$d!\n", age, name );
		String result = 
				String.format("Привет, %-10s - %x!\n", name, age);
		
		System.out.print(result);
		
		// PI = 3.1415...
		System.out.printf("PI = %10.2f\n", Math.PI);
		
		LocalTime now = LocalTime.now();
		
		System.out.printf("%1$tH:%1$tM:%1$tS\n", now);
		System.out.printf("%tH:%<tM:%<tS\n", now);
		System.out.printf("%tT\n", now);
		System.out.printf("%tR\n", now);
		System.out.printf("%tF\n", LocalDate.now());
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
