package ru.specialist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		//int[] nums = new int[3];
		//nums[0] = 100;
		//nums[1] = 50;
		
		//int[] nums = new int[] { 10, 50, 0};
		int[] nums = {10, 50, 0};
		
		System.out.println(nums.length);
		
		for(int i=0; i < nums.length; i++)
			System.out.println(nums[i]);
		
		//System.out.println(nums[0]);
		//System.out.println(nums[1]);
		//System.out.println(nums[2]);
		// 1 2 3
		// 4 5 6
		
		int[][] matrix = {
				{1,2,3},
				{4,5}
		};
		
		System.out.println(matrix.length);
		for(int i=0; i< matrix.length; i++) {
			for(int j=0; j < matrix[i].length; j++)
				System.out.printf("%4d", matrix[i][j]);
			System.out.println();
		}
		
		
		
		String[] names = new String[] {
				"Сергей", "Наталия", "Костя", "Саша"
		};
		Arrays.sort(names);
		
		//for(int i=0; i <names.length; i++)
		//	System.out.println( names[i] );
		for(String s : names)
			System.out.println( s );
		
		//List
		//ArrayList
		//LinkedList
		// Set HashSet
		// Map HashMap Hashtable
		// Object
		// Generic
		List<String> persons =
				new ArrayList<String>();
		
		System.out.println( persons.size() );
		persons.add("Елена");
		persons.add("Наталия");
		persons.add("Анна");
		persons.add("Дарья");
		persons.add("Глафира");
		
		//persons.set(2, "Светлана");
		
		persons.remove("Глафира");
		
		System.out.println( persons.size() );
		
		/*Iterator<String> iter = persons.iterator();
		while (iter.hasNext()) {
			String p = iter.next();
			System.out.println(p);
		}*/
		//System.out.println(persons);
		
		Collections.sort(persons);
		
		for(String p : persons) {
			System.out.println(p);
		}
		
		
			
		// bad
		//for(int i = 0; i < persons.size(); i++)
		//	System.out.println(persons.get(i));
		
		// import java.util.Random
		Random rnd = new Random();
		int x = rnd.nextInt(100)+1; // 1 .. 100
		
		System.out.println(x);
		//rnd.nextInt(100) // 0 ..99
		
		//String s = "abc";
		//s.isEmpty()
				
		// пользователь вводит непустые имена
		// которые сохраняются в коллекцию
		// при вводе пустого имени, ввод заканчивается
		// имена выводятся в отсортированном виде
		
		
		{
			int a = 10;
			int b = a;
			a++;
			System.out.printf("a = %d\nb = %d\n", a, b); // 11 10
		}
		
		{
			//Integer[] a;
			
			int[] a = {10};
			int[] b = a.clone();
			a[0]++;
			System.out.printf("a = %d\nb = %d\n", a[0], b[0]); // 11 11
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
