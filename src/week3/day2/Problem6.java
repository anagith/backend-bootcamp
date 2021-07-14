package week3.day2;

public class Problem6 {
    public static void main(String[] args) {
        System.out.println(square(2));
        System.out.println(square(2.0f));
        System.out.println(square(2, 3));
    }

    public static double square(int a) {
        return Math.PI * Math.pow(a, 2);
    }

    public static double square(float a) {
        return Math.pow(a, 2);
    }

    public static double square(float a, float b) {
        return a * b;
    }
}
