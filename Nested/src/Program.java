
public class Program {

	public static void main(String[] args) {
		Outer.Nested n = new Outer.Nested();
		
		Outer o = new Outer(10);
		Outer o2 = new Outer(20);
		
		n.increment(o);
		
		Outer.Inner i = o.new Inner ();
		i.increment();
		
		
		System.out.println(o.getData());

	}

}
