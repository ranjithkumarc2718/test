package practice;

public class Operators {

	public static void main(String args[]) {
		
		int a =100;
		int b = 0;
		int c =200;
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(a*a);
		System.out.println(a/a);
		System.out.println(a%a);
		
		System.out.println(~a);
		
		System.out.println(a++ + b++);
		System.out.println(++a + ++b);

		System.out.println(a-- - b--);
		System.out.println(--a - --b);
		
		System.out.println(a<b&&a<c);
		System.out.println(a>b||a<c);
		System.out.println(a<b&a<c);
		System.out.println(a>b|a<c);
	}
	
	
	
	
}
