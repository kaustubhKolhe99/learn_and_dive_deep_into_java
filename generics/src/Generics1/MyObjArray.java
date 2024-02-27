package Generics1;

public class MyObjArray {
    Object[] array;
    public MyObjArray(Object[] array){
        this.array=array;

    }
    public Object[] getArray(){
        return array;

    }
    public Object getElement(int idx){
        return array[idx];

    }
    public void  setElement(int idx){
        this.array = array;
    }

}
