package Generics4;

public class Main {
    public static void main(String[] args) {
        MyArray<String> myStringArray1= new MyArray<>(new String[]{"John"});
        MyArray<String> myStringArray2 = new MyArray<>(new String[]{"John", "Tom"});
        System.out.println(myStringArray1.isLongerThan(myStringArray2));

        MyArray<Integer> integerMyArray = new MyArray<>(new Integer[]{1,6,7,5});

        myStringArray1.isLongerThan(integerMyArray);
        System.out.println();
    }

}
