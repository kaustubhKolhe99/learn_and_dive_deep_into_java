package exception2;

public class exceptionPropagation {
    public static void main(String[] args) {
        methodA();
    }
    static  void methodA(){
        methodB();
    }static  void methodB(){
        methodC();
    }static  void methodC(){
        System.out.println(5/0); // exception propagation
    }
}
