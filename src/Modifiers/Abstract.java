package Modifiers;

abstract class Animal {

    // An abstract method (no body, must be implemented by subclasses)
    abstract void sound();

    void sleep(){
        System.out.println("This animal is sleeping.");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("The dog barks.");
    }
}
public class Abstract {
    public static void main(String[] args) {
        // We can't create an object of the abstract class Animal directly

        Dog dog = new Dog();

        dog.sound();
        dog.sleep();

    }
}
