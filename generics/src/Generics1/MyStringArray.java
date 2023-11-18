package Generics1;

public class MyStringArray {
    String[] array;
    public MyStringArray(String[] array){
        this.array=array;

    }
    public String[] getArray(){
        return array;

    }
    public String getElement(int idx){
        return array[idx];

    }
    public void  setElement(int idx){
        this.array = array;
    }


}
