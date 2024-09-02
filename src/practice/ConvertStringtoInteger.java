package practice;

public class ConvertStringtoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="100";
		//convert string to Integer
		int i =Integer.parseInt(str);
		int j =Integer.valueOf(str);
		
		// added integer value performed binary operation
		System.out.println(i+210);
		//String concatenation happened
		System.out.println(str+200);
		
		System.out.println(j);
		

	}

}
