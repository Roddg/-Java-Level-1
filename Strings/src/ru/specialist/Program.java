package ru.specialist;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		String str = "\ta  \n \u002F \\ \" bc";
		String st1 = "abc";
		String st2 = "abc";
		
		String str2 = new String("abc");
		
		System.out.println(str);
		System.out.println(str2);
		
		String hello = "Привет";
		String name = "Сергей";
		String result = hello + " " + name + "!";
		// "Привет"
		// "Сергей"
		// "Привет "
		// "Привет Сергей"
		// "Привет Сергей!"
		
		
		
		System.out.println(result);
		System.out.println(result.length());
		System.out.println(result.charAt(0));
		System.out.println( result.charAt( result.length()-1 ) );
		System.out.println( result.contains("С") );
		System.out.println( result.indexOf("Сергей") );
		System.out.println( result.isEmpty() );
		System.out.println( result.isBlank() );
		System.out.println( result.trim() );
		System.out.println( result.substring(7) );
		System.out.println( result.substring(7, 13) );
		String newString = result.replace("Сергей", "Костя");
		System.out.println( newString );
		System.out.println( result );
		
		System.out.println( result = result.toUpperCase() );
		System.out.println( result );
		//System.out.println( result.replaceAll() );
		// phone
		// xxx-xx-xx
		// \d
		String phonePattern = "[2-9]\\d\\d-\\d\\d-\\d\\d";
		String phone = "134-96-00";
		
		System.out.println( phone.matches(phonePattern));
		
		String names = "Сергей,Наталия,Костя,Саша";
		System.out.println(names);
		String[] namesArr = names.split(",");
		Arrays.sort(namesArr);
		names = String.join(",", namesArr);
		System.out.println(names);
		
		
		
		// BAD
		// 1 2 3 .. 100
		/*String r = "";
		for(int i=1; i <= 100; i++)
			r += String.valueOf(i) + " ";*/
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i <= 100; i++)
			sb.append(i).append(" ");
		
		String r = sb.toString();
		
		
		System.out.println(r);
		
		
		String s1 = "Sergey";
		String s2 = new Scanner(System.in).nextLine();
		
		// System.out.println( s1 == s2 ); // by ref
		System.out.println( s1.equals(s2) );  // by value
		
		// s1 > s2 =>  > 0
		// s1 < s2 =>  < 0
		// s1.equals(s2) == true => 0
		// "Sergey" < "andrey"
		
		System.out.println( s1.compareTo(s2) ); 
		
		
		
		
		
	}

}
