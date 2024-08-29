package testProject;

class Dog1 {
	void show() {
		System.out.println("Dog");
	}

}
class Cat{
	void show() {
		System.out.println("Cat");
	}
}
class BullDog extends Dog1{
	void show() {
		System.out.println("BullDog");
	}
}

public abstract class Dog implements AnimalFour{
	public static void main(String[] args) {
		System.out.println("Implementing type Casting");
		Dog1 d = new Dog1();
		BullDog bd =(BullDog)d;
		bd.show();
	
	
	
	}
}