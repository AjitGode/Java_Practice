package Revision;

public class HandlerIntervew {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException ex){
            System.out.println(ex);
            System.out.println("AE");
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("E");
        }
    }
}
