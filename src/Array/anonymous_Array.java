package Array;

public class anonymous_Array {
    public static void main(String[] args) {
        int sumResult = sum(new int []{10,20,30});
        int divResult = div(new int []{32,67,87});
        int subResult = sub(new int [] {11,23,45});
        int mulResult = mul(new int []{45,78,90});

        System.out.println("Sum of array :" +sumResult);
        System.out.println("Div of array :" +divResult);
        System.out.println("Sub of array :" +subResult);
        System.out.println("Mul of array :" +mulResult);
    }

    public static int sum(int[] x) {
        int sum = 0;
        for(int x1:x){
            sum= sum +x1;
        }
       return sum;
    }
    public static int div(int[] y) {
        int div=1;
        for(int x2:y){

            div= div/x2;

        }
        return div;
    }

    public static int sub(int[] z) {
        int sub=z[0];

        for(int i=1;i<z.length;i++){
            sub= sub + z[i];
        }
    return sub;
    }

    public static int mul(int[] w) {
        int mul=1;
        for(int w1:w){
            mul= mul*w1;
        }
        return mul;
    }
}
