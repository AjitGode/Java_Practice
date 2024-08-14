package Operators;

public class AllOperators {
    public static void main(String[] args) {

        // Arithmatic operations :

        int x= 25;
        int y=43;
        int  sum=0, sub=0, mul=0, div=0;

        sum= x+y;
        System.out.println("The sum is :"+sum);

        sub= x-y;
        System.out.println("The sub is :"+sub);

        mul= x*y;
        System.out.println("The mul is :"+mul);

        div= x/y;
        System.out.println("The div is :"+div);

        // Increment/Decrement operator :

        int I= 10;
        int J= ++I;

        System.out.println("After pre Increment :"+I);

        int O=I++;
        System.out.println("After PostIncrement :"+O);

        int S=30;
        int W=--S;

        System.out.println("After Pre Decrement :"+S);

        int Q=S--;
        System.out.println("After PostDecrement :"+Q);

        // Relational operator:

        int A=32;
        int B=21;

        System.out.println(A>B);
        System.out.println(A<B);
        System.out.println(A>=B);
        System.out.println(A==B);
        System.out.println(A!=B);
        System.out.println(A<=B);

        //Equality Operator :

        String a = "Ajit";
        String b = "Gode";

        System.out.println(a==b);

        String c= "Ajit";
        System.out.println(a==c);

        String Obj1 = new String("Ajit");
        String Obj2 = new String("Ajit");

        System.out.println(Obj1==Obj2);


        // String Concatination :

        String k= "Ajit";
        String l= "Gode";

        System.out.println("String k+l :"+(k+l));

        int p= 25;

        System.out.println("Striing k + int p :"+ (k+p));

        System.out.println(k.concat(l));

        // instanceof Operator :


    }
}
