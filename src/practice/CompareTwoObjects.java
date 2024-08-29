package practice;

public class CompareTwoObjects {
	
	public static void main(String[] args) {
	
	
Long a = new Long(100);
Double b = new Double(100.501);
System.out.println("Objects are not equal, hence it returns "+b.equals(a));
System.out.println("Objects are equal, hence it returns "+b.equals(100.501));

	}
}
