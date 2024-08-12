package Operators;

public class arithmaticOp {
    public static void main(String[] args) {
        // ArithMatic operations

        int N1= 50; int N2= 60;
        int  sum=0, sub=0, mul=0, div=0;

         sum = N1+N2;
        System.out.println("The Sum :" +sum);

        sub= N1 - N2;
        System.out.println("The Sub :" +sub);

        mul= N1 * N2;
        System.out.println("The Mul :" +mul);

        div= N1 / N2;
        System.out.println("The Div :" +div);

        // Addition of DataType

        byte x= 10;
        byte y= 20;

        System.out.println("Addition of byte + byte =int :" +(x+y));

        double a =5.5;
        int b=20;

        System.out.println("Addition of double + double =double :" +(a+b));

        char charVal= 'A';  // Unicode value of 'A' is 65
        int w= 33;
        System.out.println("Addition of char + int =int :" +(charVal+w));

        short c=67;
        short d=89;
        System.out.println("Addition of short + short  =int :" +(c+d));

        long f= 300;
        System.out.println("Addition of byte + long  =long :" +(x+f));

        System.out.println("Addition of double + long  =double :" +(a+f));

    }
}
