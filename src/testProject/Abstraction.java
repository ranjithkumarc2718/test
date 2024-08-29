package testProject;

abstract class AnimalsNew {
    abstract void sound();
    abstract void soundO();
}

class DogThree extends AnimalsNew {
    void sound() {
        System.out.println("Dog barks");
    }
    void soundO() {
//        System.out.println("Dog barks");
    }
}
public class Abstraction{   
    public static void main(String[] args) {
    	AnimalsNew obj = new DogThree();
    	obj.sound();
    }
 }

