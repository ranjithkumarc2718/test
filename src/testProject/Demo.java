package testProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Demo {
public static void main(String[] args) {
	/* System.out.println("Show() inside Employee"); */
	
	/*
	 * int[] x= {111,112,113,114,115,116}; for (int i: x) {
	 * System.out.println("Count is "+i); }
	 */
	
	/*
	 * public int a=20; float b= 30; protected c = 40; private int d =50;
	 */
	
	/*
	 * try { int x=-1, total=55; do { total=(total/x); System.out.print(x); x++;
	 * }while(x==0);
	 * 
	 * }catch (ArithmeticException e) { System.out.print("0"); }
	 */
	
	/*
	 * try { System.out.print("try block "); throw new Error(); }
	 * 
	 * catch(Throwable e) { System.out.print("catch block "); }finally {
	 * System.out.print("finally"); }
	 */
	/*
	 * Integer x = new Integer(89); long y = x.longValue(); System.out.println(y);
	 */
	
	/*
	 * String s1="JAVA", s2="java"; s1.toLowerCase();
	 * System.out.println(s1.equals(s2));
	 */
	
	DateTimeFormatter formater = DateTimeFormatter.ofPattern("EEEE", Locale.US);
	System.out.println(formater.format(LocalDateTime.now()));
	
}
	
	
}
