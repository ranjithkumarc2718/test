package testProject;

public class Bank {

	static class Customer{
		public void go() {
			System.out.println("Inside Customer");
		}
	}
	
	static class Account extends Customer{
		public void go() {
			System.out.println("Inside Account");
		}
		
		
	}
	
	static class Branch extends Customer{
		@Override public void go() {
			System.out.println("Inside Branch");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Account();
		Branch branch=(Branch)customer;
		branch.go();

	}

}
