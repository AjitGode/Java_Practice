package Operators;

public class incDec {
    public static void main(String[] args) {
        int a=90;
        int b=++a;
        System.out.println("After pre increment :"+a);

        int c=a++;
        System.out.println("After post increment :"+c);

        // decrement

        int x=70;
        int y=--x;
        System.out.println("After post decrement :"+x);

        int z=x--;
        System.out.println("After post decrement :"+z);
    }


}
