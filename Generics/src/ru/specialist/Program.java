package ru.specialist;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Program {
	
	public static <T extends Comparable<? super T2>, T2> 
		boolean isGreater(T a, T2 b) {
		return a.compareTo(b) > 0;
	}
	
	public static void main(String[] args) {
		
		System.out.println( isGreater(10, 5) );
		System.out.println( isGreater(2.5, 1.2) );
		System.out.println( isGreater("abc", "cde") );
		
		//Map<String, Program> a;
		//ReadonlyStorage<Object> r0 = new ReadonlyStorage<Object>(10);
		
		ReadonlyStorage<Integer> r1 = new ReadonlyStorage<>(10);
		
		ReadonlyStorage<Double> r2 = new ReadonlyStorage<Double>(10.5);
		ReadonlyStorage<String> r3 = new ReadonlyStorage<String>("abc");
		
		ReadonlyStorage<?> rx = r1;
		rx = r2;
		List<?> array = new ArrayList<Object>();
		
		ReadonlyStorage<Integer>[] arr = new ReadonlyStorage[3];
		
		//ReadonlyStorage<Program> r4 = new ReadonlyStorage<Program>(new Program());
		
		System.out.println(2*r1.getData());
		System.out.println(r2.getData());
		System.out.println(r3.getData());
		//System.out.println(r4.getData());
	}



}
