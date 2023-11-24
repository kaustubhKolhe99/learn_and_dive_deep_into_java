import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {


    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(10));

        System.out.println(getRandomNumber1(10, 60));
        System.out.println(getRandomNumber2(10, 60));
        System.out.println(getRandomNumber3(10,60));
        System.out.println(getRandomNumber4(10,60));
    }


    static int getRandomNumber1(int min , int max){
        Random random = new Random();
        int range = max-min;
        return random.nextInt(range) +min;
    }
    static int getRandomNumber2(int min , int max){
        Random random = new Random();
        return  random.ints(min , max)
                .findFirst()
                .orElse(0 );

    }
    static  int getRandomNumber3 (int min , int max){
        int range= max - min;
        int rand = (int)(Math.random()*range)+min;
        return rand;

    }
    static int getRandomNumber4(int min , int max){
        return ThreadLocalRandom.current().nextInt(min , max);
    }
}
