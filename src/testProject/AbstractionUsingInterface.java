package testProject;

//Define an interface with abstract methods
interface AnimalFour {
 void sound();
 void eat();
}

//Implement the interface in a class
class DogFour implements AnimalFour {
 @Override
 public void sound() {
     System.out.println("Dog barks");
 }

 @Override
	
	  public void eat() { System.out.println("Dog eats"); }
	 
}

//Another class implementing the same interface
class CatFour implements AnimalFour {
 @Override
 public void sound() {
     System.out.println("Cat meows");
 }

 @Override
 public void eat() {
     System.out.println("Cat eats");
 }
}

//Main class to test the implementation
public class AbstractionUsingInterface {
 public static void main(String[] args) {
     AnimalFour dog = new DogFour();
     dog.sound();  // Output: Dog barks
     dog.eat();    // Output: Dog eats

     AnimalFour cat = new CatFour();
     cat.sound();  // Output: Cat meows
     cat.eat();    // Output: Cat eats
 }
}

