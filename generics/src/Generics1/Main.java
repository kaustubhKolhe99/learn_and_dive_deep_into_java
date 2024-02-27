package Generics1;

public class Main {
    public static void main(String[] args) {
        Double[] doubleArr = {5.5,4.8,8.9,1.8,14.6,4.5,8.7,4.6};
        MyDoubleArray myDoubleArray = new MyDoubleArray(doubleArr);
        double element = myDoubleArray.getElement(0);
        System.out.println(element);

        Object[] objects = {1,5,8,2.5,"apple "};
        MyObjArray myObjArray = new MyObjArray(objects);
        Object element2 = myObjArray.getElement(0);
        System.out.println(element2);

        Integer[] numbers = {5,9,7,6,1,7,5,56};
        MyGenericArray<Integer> myGenericArray = new MyGenericArray<>(numbers);
        int num = myGenericArray.getElement(5);
        System.out.println(num);



        }
}
