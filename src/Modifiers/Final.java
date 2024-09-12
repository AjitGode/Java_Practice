package Modifiers;

final class Vehicle{

    public void start(){
        System.out.println("The vehicle starts.");
    }
}
// The following class declaration would cause an error because Vehicle is final:

//class Car extends Vehicle{
//    public void Model(){
//        System.out.println("BMW");
//    }
//}
public class Final {
    public static void main(String[] args) {


        Vehicle vehicle = new Vehicle();
        vehicle.start();

//        Car car = new Car();
//        car.Model();
//
//        Vehicle vehicle1 = new Car();
//        vehicle1.start();
    }
}
