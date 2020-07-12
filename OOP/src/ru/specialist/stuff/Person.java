package ru.specialist.stuff;

import java.time.LocalDate;

public class Person 
//implements Comparable<Person>
{
	Person mother;
	Person father;
	
	
	// Point
	//  x,y
	//  Point(x,y)
	//  Point()
	//  draw()
	//  moveBy(dx, dy)
	
	//  static ArrayList<Point> points
	// 	static void drawPoints()
	
	public static int counter = 0; 
	
	public static void showTotal() {
		System.out.printf("Total persons: %d\n", Person.counter);
	}
	
	{
		//if ()
		//for
		//this.age = 18;
		this.number = ++counter;
	}
	
	public Person() {
		this("Unknown");
	}
	
	public Person(String name) {
		this(name, 18);
		
		//System.out.println("ctor(name)");
	}
	public Person(String name, int age) {
		this.name = name;
		setAge(age);
		//Person.counter++;
		//counter++;
	}
	
	public String name = "Незнакомец"; 
	
	//private int age;
	private int birthYear;
	
	public int getAge() {
		return LocalDate.now().getYear() - birthYear;
	}

	public void setAge(int age) {
		this.birthYear = LocalDate.now().getYear() - age;
		
	}

	public int number;
	
	public void show() {
		//String name = "abc";
		System.out.printf("%d. %s - %d\n", this.number, this.name, this.getAge());
	}
	
	public void showName() {
		//String name = "abc";
		System.out.printf("%s\n", this.name);
	}

	/*@Override
	public int compareTo(Person p) {
		// +1  if this > p
		// 0   if this == p
		// -1  if this < p
		
		return this.name.compareTo(p.name);
		//return this.getAge() - p.getAge();
	}*/
	

}
