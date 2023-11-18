import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            System.out.println("before exception");
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            System.out.println(5/0);
            System.out.println("after exception");


        }catch (ArithmeticException | InputMismatchException ise){
            System.out.println("error happened");
        }catch (Exception e){
            System.out.println("error");
        }
        finally {
            System.out.println("in the finally  block");
        }


    }
}