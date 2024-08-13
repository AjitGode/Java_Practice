package Operators;

class Animal{
    public void sound(){
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Bark");
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("Meow");
    }
}

public class instanceofOp {
    public static void main(String[] args) {
        // Create instances of Animal, Dog, and Cat

        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        // Use instanceof to check the type of each object
        System.out.println("a is an instance of Animal: " + (a instanceof Animal)); // true
        System.out.println("d is an instance of Dog: " + (d instanceof Animal)); // true
        System.out.println("c is an instance of Cat: " + (c instanceof Animal)); // true

        System.out.println("d is an instance of Dog: " + (d instanceof Dog)); // true
       // System.out.println("d is an instance of Cat: " + (d instanceof Cat)); // false
        System.out.println("c is an instance of Cat: " + (c instanceof Cat)); // true

        // Check against Object class
        System.out.println("d instanceof Object: " + (d instanceof Object)); // true

        // Call the sound method using instanceof to check type before casting

        if(d instanceof Dog){
            Dog dog = (Dog)d;
            dog.sound();
        }

        if(c instanceof Cat){
            Cat cat = (Cat)c;
            cat.sound();
        }

    }
}
