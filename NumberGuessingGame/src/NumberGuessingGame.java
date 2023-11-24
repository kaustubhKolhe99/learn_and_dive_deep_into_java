import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    static int RandomNumber(int bound){
        Random random = new Random();
        return random.nextInt(bound)+1;

    }

    public static void main(String[] args) {
        int guess, chance = 3;
        Scanner in = new Scanner(System.in);
        int randomNumber = RandomNumber(10);
        System.out.println("Welcome to Number Guessing game \uD83C\uDFB2 \uD83C\uDFB2 \n");
        System.out.println("You have 3 lives ");
        System.out.print("❤\uFE0F ❤\uFE0F ❤\uFE0F \n");

        System.out.println("Guess a Number Between 1-10 \uD83D\uDC40 \uD83D\uDE42");

        do {
            guess = in.nextInt();
            if (guess> 10 || guess<0){
                System.out.println("\uD83E\uDEF5 \uD83D\uDCA9 \uD83D\uDD95 \n");
                if(chance!=0) System.out.println("Guess again");

                continue;
            }
            if (guess>randomNumber){
                System.out.println("Your guess is too high \uD83E\uDD0C \n");
                System.out.printf("You have %d lives left \n", --chance);
                for (int i = 0; i < chance; i++) {
                    System.out.print("❤\uFE0F ");

                }
                System.out.println("\n");
                if(chance!=0) System.out.println("Guess again");

            }else if (guess< randomNumber) {
                System.out.println("Your guess is too low \uD83E\uDD0F \n");
                System.out.printf("You have %d lives left \n", --chance);
                for (int i = 0; i < chance; i++) {
                    System.out.print("❤\uFE0F ");

                }
                System.out.println("\n");
                if(chance!=0) System.out.println("Guess again");

            }else {
                System.out.println("Your Guess is correct number \uD83D\uDC4C ");
                break;
            }
        }while (chance !=0);





    }
}
