package Operators;

public class stringConcat {
    public static void main(String[] args) {
        // string concatnation

        String A= "Ajit";
        String B= "Gode";

        System.out.println("String A + B :" +( A + B));

        // num + string

        int a= 25;
        System.out.println("String A + int a :" +(A+a));

        // concat method

        String C= A.concat(B);
        System.out.println("Concatination using method :" +C);
    }
}
