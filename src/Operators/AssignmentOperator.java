package Operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        System.out.println("Simple Assignment Operators");
        int p=150;
        System.out.println(p);

        System.out.println("Chained Assignment Operators");
        int x,y,z;
        int a=x=y=z=20;
        System.out.println(a+" "+x+" "+y+" "+z);

        System.out.println("Compound Assignment Operators");
        x=45;
        System.out.println(x+=5);
        x=45;
        System.out.println(x-=5);
        x=45;
        System.out.println(x*=5);
        x=45;
        System.out.println(x/=5);
        x=45;
        System.out.println(x%=5);
        x=45;
        System.out.println(x>>=5);
        x=45;
        System.out.println(x<<=5);
        x=45;
        System.out.println(x>>>=5);
        x=45;
        System.out.println(x^=5);
        x=45;
        System.out.println(x&=5);
        x=45;
        System.out.println(x|=5);
    }
}
