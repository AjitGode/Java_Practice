package Operators;

public class equalityOperators {
    public static void main(String[] args) {
        String A = "Ajit";
        String B = "Gode";

        System.out.println(A==B); // A and B are diff so opt will be false

        String C = "Ajit";
        System.out.println(A==C); // A and C are same so opt will be true

        int a =97;
        char c = 'a';

        System.out.println(a==c); // a nd c are same because c has ASCII value 97 so it will give true opt

        // objects

        String Obj1 = new String("Ajit");
        String Obj2 = new String("Ajit");

        System.out.println(Obj1==Obj2); // obj1 and obj2 has diff address so opt will be false

        // also we can use equals() method

        String Obj3 = new String("Ajit");
        System.out.println(Obj1.equals(Obj3)); // equals() check only values so its opt will be true

    }
}
