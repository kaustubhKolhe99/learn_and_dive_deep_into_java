import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score =0;
        System.out.println("Welcome to java quiz");
        System.out.println("JVM is a program that excutes compiled Java code");
        boolean ans = in.nextBoolean();
        if(ans == true){
            score++;

        }
        System.out.println("String is primitive datatype");
        ans = in.nextBoolean();
        if(ans == false){
            score++;

        }
        System.out.println("Java has 9 Primitive data types");
        ans = in.nextBoolean();
        if(ans == false){
            score++;
        }
        System.out.printf("you have answered %d questons correct ", score);
    }
}