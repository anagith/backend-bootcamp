package week9.day1;

import java.util.function.DoubleFunction;


public class MyClass implements MyInterface {
    @Override
    public double sum(int[] arr, DoubleFunction<Double> function) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += function.apply(arr[i]);
        }
        return sum;
    }
}
