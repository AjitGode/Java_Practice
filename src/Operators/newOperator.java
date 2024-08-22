package Operators;

class table {
    int height;
    int width;
    int depth;

    table(int height, int width, int depth) {
        this.height = height;
        this.depth = height;
        this.width = width;
    }
}

public class newOperator {
    public static void main(String[] args) {

        table t1= new table(23, 20, 45);

        table t2=t1;

        int r1 = t2.height;

        System.out.println(t1.height);
        System.out.println(t1.width);
        System.out.println(t1.depth);


        System.out.println(r1);
    }
}
