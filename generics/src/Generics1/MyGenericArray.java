package Generics1;

public class MyGenericArray<T> {
    T[] array;
    public MyGenericArray(T[] array){
        this.array=array;

    }
    public T[] getArray(){
        return array;

    }
    public T getElement(int idx){
        return array[idx];

    }
    public void  setElement(int idx){
        this.array = array;
    }

}
