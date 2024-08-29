package practice;

public class NestedIf {
	
	public static void main(String[] args) {
		
		int a=100;
		int b=2000;
		int c=20001;
		
		if (a>b) {
//			System.out.println("A is greater than b");
			if(a>c) {
				System.out.println("A is greater than all");
			}
		}else if(b>c) {
			System.out.println("B is greater than all");
			
		}else {
			System.out.println("C is greater than all");
		}
		
		
	}

}
