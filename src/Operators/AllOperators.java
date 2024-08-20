package Operators;

class Animala{
    public void sound(){
        System.out.println("Some generic animal sound");
    }
}

class Dogd extends Animala{
    public void sound(){
        System.out.println("Bark");
    }
}

class Catc extends Animala{
    public void sound(){
        System.out.println("Meow");
    }
}

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

          Animala M = new Animala();
          Dogd D = new Dogd();
          Catc C = new Catc();

          System.out.println("M is an instance of Animala :"+(M instanceof Animala));
          System.out.println("D is an instance of Animala :"+(D instanceof Animala));
          System.out.println("C is an instanceof Animala "+(C instanceof Animala));

          // Bitwise operators :

          int h= 5;  //00000101
          int j = 3; //00000011

          System.out.println(h & j);
          System.out.println(h ^ j);
          System.out.println(h | j);
          System.out.println(~h);

          // Short Circuit Operator :

        int t = 5;
        int r = 10;


        if(t > 10 && r > 10) {
            System.out.println("Both conditions are true");
        } else {
            System.out.println("At least one condition is false");
        }


        if(t > 10 || r > 10) {
            System.out.println("At least one condition is true");
        } else {
            System.out.println("Both conditions are false");
        }



    }
}
