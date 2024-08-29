package testProject;

class Animals {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class CatOne extends Animals {
    void sound() {
        System.out.println("Meow");
    }
}

public class Overidding {
    public static void main(String[] args) {
        Animals myAnimal = new CatOne();
        myAnimal.sound();
    }
}
