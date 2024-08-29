package testProject;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Demo1/* extends Apple */ {
	/*
	 * @Override public void color() { System.out.println("Yellow"); }
	 */
	
	/*
	 * public void method() { for (int i=0;i<3;i++) { System.out.println(i); } }
	 */
	
	/*
	 * public class Main{ static int[] x; static { x[0]=102; } }
	 */
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * float val1=5.3f; float val2=2.3f; float result =val1%val2;
		 * System.out.println(result);
		 */
		
		/*
		 * method(); print(i);  Ans+ Compilation fails
		 */
		
		/* System.out.println(x); */
		/*
		 * Apple apple = new Demo1(); apple.color();
		 */
		
		LocalDateTime date1 = LocalDateTime.now();
		System.out.println(date1.isAfter(date1.plusDays(1)));

		String inputDate="22-12-1998";
		LocalDate input= LocalDate.parse(inputDate);
		System.out.println(input);
	}

}
