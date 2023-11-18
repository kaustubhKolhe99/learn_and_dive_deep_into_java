import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner in = new Scanner(System.in);
        if(in.hasNextInt()){
            int num = in.nextInt();
            if(num<0){
                System.out.println("negative number");

            }else {
                System.out.println("Positive number");
            }
        }else {
            System.out.println("Please only enter integers");

        }


    }
}