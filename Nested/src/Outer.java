import java.util.Comparator;

public class Outer {
	
	public Comparable<Integer> getMyComparator() {
		/*final int k = 1;
		//k++;
		class MyComparator implements Comparable<Integer> {
			public int compareTo(Integer x) {
				return k*data - x;
			}
		}
		Comparable<Integer> cmp = new  MyComparator();*/
		
		
		Comparable<Integer> cmp = 
			new Comparable<Integer>() {
				public int compareTo(Integer x) {
					return data - x;
				}
			};
		
		
		return cmp;
		
	}
	
	public boolean isGreater(int x) {
		Comparable<Integer> cmp = getMyComparator();
		return cmp.compareTo(x) > 0;
		
	}
	
	
	public static class Nested {
		public void increment(Outer o) {
			o.data++;
		}
		
	}
	
	public class Inner {
		
		private int data;
		
		public void increment() {
			data++; // Inner.data
			Outer.this.data++; // Outer.data++
		}
		
	}
	
	private int data;

	public int getData() {
		return data;
	}

	public Outer(int data) {
		this.data = data;
		Inner i = new Inner(); // this.new Inner();
	}
	
	

}
