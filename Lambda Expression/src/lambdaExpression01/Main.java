package lambdaExpression01;

public class Main {
    public static void main(String[] args) {
        myInterface myInterface = ()-> System.out.println(5);
        myInterface.printNumber();

        myInterface2 myInterface2 = (x) -> System.out.println(x);
        myInterface2.print("Java");

        myInterface3 myInterface3 = ((x, y) -> {
            System.out.println(x+y);
        });
        myInterface3.add(5,6);
        myInterface4 myInterface4 = ((x, y, z) -> x+y+z);
        System.out.println(myInterface4.add(5,8,7));




    }
}
