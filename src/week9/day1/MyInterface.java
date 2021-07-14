package week9.day1;

import java.util.function.DoubleFunction;


@FunctionalInterface
public interface MyInterface {
    public double sum(int[] arr, DoubleFunction<Double> function);
}
