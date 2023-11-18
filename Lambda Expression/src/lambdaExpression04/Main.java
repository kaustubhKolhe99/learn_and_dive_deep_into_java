package lambdaExpression04;
interface MyInterface{
    void test(String x);
}
public class Main {
    public Main(String x){

    }
    public static void sayHello(String name){
        System.out.println("Hello " +name);
    }

    public static void main(String[] args) {
        MyInterface myInterface = (x -> System.out.println(x));
        MyInterface myInterface2 = (System.out::println);
        MyInterface myInterface3 = Main::sayHello;

        MyInterface myInterface4 = Main::new;
    }
}
