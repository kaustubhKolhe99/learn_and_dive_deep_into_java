package lambdaExpression03;
interface MyInterface{
    void test();
}
public class Main {

    String name = "Tom";
    double salary = 5000;

    public static void main(String[] args) {
        int x = 8;

        MyInterface myInterface = ()->{


            System.out.println(x);
        };
        myInterface.test();



    }
}
