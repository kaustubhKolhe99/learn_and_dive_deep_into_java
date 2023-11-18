import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num%2==1){
            System.out.printf("The entered number is odd");

        }else{
            System.out.printf("The entered number is even");
        }
    }
}