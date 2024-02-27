package Generics3;

public class GenericMethod {
    public static <T>void getType(T data){
        System.out.println(data +" is from type:" + data.getClass().getSimpleName()) ;

    }
    public  static <T,U> void getTypes(T data , U data2){
        System.out.println(data +" is from type: "+ data.getClass().getSimpleName());
        System.out.println(data2 +" is from type: "+ data2.getClass().getSimpleName());
    }
    public static <T> boolean isEqual(T data1 , T data2){
        return data1==data2;
    }

    public static void main(String[] args) {
        getType("Tom");
        getType(3);
        getTypes(5.6,"kaustubh");
        System.out.println(isEqual(5,5));
    }
}
