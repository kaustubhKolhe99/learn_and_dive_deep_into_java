package LambdaExpression02;

public class Main {

    static void myPrint(Calculator calculator , double x , double y ){
        double result = calculator.calc(x,y);
        System.out.println(result);

    }

    public static void main(String[] args) {
//        Calculator add = ((x, y) -> x +y);
        myPrint(((x, y) -> x +y), 4,5);

//        Calculator sub = ((x, y) -> x - y);
        myPrint(((x, y) -> x - y) , 3,4);
        myPrint(((x, y) -> x/y) , 4,4);
        myPrint(((x, y) -> x*y), 2,5);



    }
}
