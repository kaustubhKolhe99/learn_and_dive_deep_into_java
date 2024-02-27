 public sealed class Parent permits Child {
    final String name ;
    public Parent(){
        name = "john";
    }
    void print(){

        System.out.println(name);
    }
}
