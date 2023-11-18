package Generics4;

public class MyArray <T>{
    T[] array;

    public MyArray(T[] array){
        this.array= array;
    }

    boolean isLongerThan(MyArray<?> otherArray){ // ?
        return this.array.length>otherArray.array.length;
    }
}
