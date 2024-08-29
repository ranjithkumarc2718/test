package testProject;

public class ExcepDemo {
	public static void main(String[] args) {
		try
		{
			method();
			System.out.print("Inside try");
		}
		catch (RuntimeException ex) {
			System.out.print("Inside catch(RuntimeException)");
		}
		catch(Exception ex1) {
			System.out.print("Inside catch(Exception)");
		}
		finally {
			System.out.print("finally");
		}
		System.out.print("end");
	}
	public static void method() {
		throw new RuntimeException();
	}

}
