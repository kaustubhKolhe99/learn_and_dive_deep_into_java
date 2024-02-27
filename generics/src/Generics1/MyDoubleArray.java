package Generics1;

public class MyDoubleArray {
    Double[] array;
    public MyDoubleArray(Double[] array){
        this.array=array;

    }
    public Double[] getArray(){
        return array;

    }
    public Double getElement(int idx){
        return array[idx];

    }

    public void  setElement(int idx){
        this.array = array;
    }

}
