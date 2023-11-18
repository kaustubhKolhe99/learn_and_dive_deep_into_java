package Generics3;

public interface MinMax<T extends Number> {
    T min(T x , T y);
    T max(T x , T y);
}
class MyClass implements MinMax<Double> {
    @Override
    public Double min(Double x, Double y) {
        return x < y ? x : y;

    }


    @Override
    public Double max(Double x, Double y) {
        return x > y ? x : y;
    }
}



