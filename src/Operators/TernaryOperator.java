package Operators;

public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println(" Ternary Operator ");
        boolean n = (40<60) ? true:false;
        System.out.println(n);

        int num = 5;
        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println(result);
    }
}
