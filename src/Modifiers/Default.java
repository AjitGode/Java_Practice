package Modifiers;


public class Default {

    // This method also has default access (no modifier specified)
    void Greet(){
        System.out.println("Hello from the default method!");
    }

    public static void main(String[] args) {

        Default obj = new Default();

        // Call the default method greet
        obj.Greet();
    }
}
