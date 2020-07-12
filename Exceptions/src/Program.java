
public class Program {
	
	static void test(String s1, String s2)
			throws MyException
	{
		try
		{
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
			
			if (n1 > 100 || n1 < 0)
				//throw new IllegalArgumentException("n1 out of [1..100]");
				throw new MyException("n1 out of [1..100]", n1);
			
			int n = n1 / n2;
			
			System.out.println(n);
		}
		//catch(NumberFormatException | ArithmeticException ex) {
		//	System.out.println(ex.getMessage());
		//}
		//catch(NumberFormatException ex) {
		//	System.out.println("не число");
		//}
		catch(NumberFormatException ex) {
			System.out.println("не число");
		}
		catch(RuntimeException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("finally");
		}
		
		System.out.println("продолжение test");
	} 
	
	
	public static void main(String[] args) 
	
	{
		
		try {
			test("123", "0");
		}
		catch(ArithmeticException abc) {
			System.out.println(abc.getMessage());
		} catch (MyException e) {
			System.out.printf("%s. Invalid data: %d\n", e.getMessage(), e.getInvalidData());		
		}

		
		System.out.println("продолжение main");
	}

}
