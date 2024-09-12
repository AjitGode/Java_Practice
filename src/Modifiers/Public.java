package Modifiers;

public class Public {

    public void greet() {
        System.out.println("Hello, welcome!");
    }

    public static void main(String[] args) {

        Public p = new Public();

        p.greet();

        // Creating an object of another class (Person)
        Person person = new Person("Ajit", 25);

        // Accessing public fields of Person
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);

        // Calling the public method of the Person class
        person.introduce();

    }

}

class Person {


    public String name;
    public int age;

    // Constructor to initialize the fields
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public method - accessible from any other class
    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I'm " + age + " years old.");
    }
}



