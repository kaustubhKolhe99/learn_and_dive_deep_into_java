import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("fizzbuzz");

        } else if (num % 3 == 0) {
            System.out.println("fizz");

        } else if (num % 5 == 0) {
            System.out.println("buzz");
        }
    }
}



