package ru.specialist;

import ru.specialist.stuff.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import ru.specialist.graph.*;

//import static java.lang.Math.sin;
import static java.lang.Math.*;
import static java.lang.System.out;
import static ru.specialist.stuff.Person.showTotal;

/*
 * BankAccount
 *   owner
 *   balance
 *   
 *   deposite(summa)
 *   boolean withdraw(summa)
 *   
 *   toString()  Сергей : 1000.00
 *   
 *   static transfer(source, dest, summa)
 * 
 * 
 * interface Colorfull
 * 
 * 
 */


public class Program {

	public static void main(String[] args) throws IOException {
		
		{
			double x = 1;
			double y = sin(sqrt(x*PI));
			
		}
		{
			
			
			
			showTotal();
			
			Person p1 = new Person("Сергей", 42);
			
			//p1.name = "Сергей";
			//p1.age  = 42;
			
			Person p2 = new Person("Костя");
			//p2.name = "Костя";
			//p2.age = 14;
			
			Person px = new Person();
			
			List<Person> persons = new LinkedList<>();
			
			persons.add(p1);
			persons.add(p2);
			persons.add(px);
			
			/*class PersonComparatorByName implements Comparator<Person> {
				@Override
				public int compare(Person p1, Person p2) {
					return p1.name.compareTo(p2.name);
				}
			}
			Comparator<Person> cmp = new PersonComparatorByName();*/
			
			/*Comparator<Person> cmp = new  Comparator<Person>() {
				public int compare(Person p1, Person p2) {
					return p1.name.compareTo(p2.name);
				}
			};*/
			
			/*Collections.sort(persons, 
			new Comparator<Person>() {
				public int compare(Person p1, Person p2) {
					return p1.name.compareTo(p2.name);
				}
			});*/
			//Collections.sort(persons, (x1, x2) -> x1.name.compareTo(x2.name) );
			class MyComparator {
				public int myCompare(Person p1, Person p2) {
					return p1.getAge() - p2.getAge();
				}
				
			}
			final MyComparator cmp = new MyComparator();
			
			//Collections.sort(persons, (x1, x2) -> cmp.myCompare(x1, x2));
			Collections.sort(persons, cmp::myCompare);
			//Collections.sort(persons);
			//Collections.sort(persons, 
			//		(x1, x2) -> x1.getAge() - x2.getAge() );
			
			for(Person p : persons)
				p.show();
			
			
			//p1.show(); // this == p1
			//p2.show(); // this == p2
			//px.show();
			System.out.println(Person.counter);
			
			Person.showTotal();
		}
		{
			Point p1 = new Point();
			p1.moveBy(5, 7);
			p1.draw(); // Point.draw()
			
			GraphObject g1 = p1; // implicit conv ref
			g1.draw(); // Point.draw()
			
			GraphObject g2; // = new GraphObject(); 
			
			/*
			 * 
			 * Class		Method		Address
			 * GraphObject	draw		XXX
			 * Point		draw		YYY
			 * Circle		draw		ZZZ
			 * 
			 */

			if (g1 instanceof Point) {
				Point p3 = (Point)g1; // explicit conv ref
				p3.moveBy(10, 10);
			}
			
			Object o1 = p1;
			o1 = "abc";
			double d = 2.5;
			o1 = d; //  (Object)new Double( d ) boxing
			
			double d2 = (double) o1; // Object => Double =>double unboxing
			Point p2 = new Point(10, 20);
			p2.moveBy(2, 3);
			
			//p1.draw();
			//p2.draw();
			
			try
			{
				Circle c1 = Circle.createCircle(10, 20, 50, "green"); 
						//new Circle(10, 20, 50, "green"); // Object, GraphObject, Circle
				c1.scale(1.5);
				
				Scaleable s1 = c1;
				
				g1 = c1;
				
				if (g1 instanceof Scaleable) {
					s1 = (Scaleable)g1;
					s1.scale(2);
				}
				
				//g1.draw(); // Circle.draw();
				
				o1 = c1;
				
				
				//c1.r = -100;
				c1.setR( 100 );
				//c1.scale(-2);
				
				//System.out.println(c1.getR());
				//c1.draw();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			
			GraphScene.scaleScene(3);
			GraphScene.drawScene();
			
		}
		{
			BankAccount b1 = new BankAccount("Sergey");
			BankAccount b2 = new BankAccount("Andrey");
			
			b1.deposite(1000);
			
			BankAccount.transfer(b1, b2, 300);
			
			out.println(b1);
			out.println(b2);
			
			
			
			
			
			
		}

	}

}
