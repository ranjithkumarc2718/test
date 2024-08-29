package practice;
public class ObjectCreation {
	void display() {
		System.out.println("Print method using object creation");
	}
	ObjectCreation(){
		System.out.println("Calling constructor initiated object using new keyword");
	}

	public static void main(String[] args) {			
		ObjectCreation obj = new ObjectCreation();
		obj.display();
	}
	/**
	  Java provides five ways to create an object.
	 
	  Using new Keyword ,
	  Using clone() method ,
	  Using newInstance() method of the Class class,
	  Using newInstance() method of the Constructor class,
	  Using Deserialization
	 */

}
