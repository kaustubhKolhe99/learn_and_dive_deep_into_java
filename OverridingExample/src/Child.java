public class Child extends Parent {
    public Child(){
        super("john");
        System.out.println("in child constructor");
    }
    @Override
    void print(){
        super.print();
        System.out.println("printing in child class");
    }


}
