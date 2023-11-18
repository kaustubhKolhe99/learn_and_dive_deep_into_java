package Generics1;

public class MyIntArray {
    int[] array;
    public MyIntArray(int[] array){
        this.array=array;

    }
    public int[] getArray(){
        return array;

    }
    public int getElement(int idx){
        return array[idx];

    }
    public void  setElement(int idx){
        this.array = array;
    }


}
