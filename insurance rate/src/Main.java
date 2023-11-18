import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Insurance rate calculation software");
        System.out.println("Enter your age");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println("Do you smoke? true/false");
        boolean isSmoker = in.nextBoolean();
        int iRate = 0;
        if (age > 25 && age <= 35)
            iRate = (isSmoker) ? 92:33;
        else if (age > 35 && age <= 45)
            iRate = (isSmoker) ? 179 : 50;
        else if (age > 45 && age <= 65)
            iRate = (isSmoker) ? 1007 : 318;

        System.out.println("Your insurance rate is " + iRate + "$");
    }
}




