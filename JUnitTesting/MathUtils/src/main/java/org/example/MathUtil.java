package org.example;

public class MathUtil {
    public  int add( int a , int b){
        return  a+b;
    }
    public  int subtract( int a , int b){
        return  a-b;
    }
    public  int division ( int x , int y) throws Exception {
        if(x==0 || y==0){
            throw new Exception("Zeros Arent allowed");
        }
        return  x/y;
    }
}
