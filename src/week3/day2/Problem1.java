package week3.day2;

public class Problem1 {
    public static void main(String[] args) {
        add(2, 2);
        add(2, 2, 2);
        add(2, 2.0);
        add(2.0, 2);
    }

    public static void add(int a, int b) {
        System.out.println("1st method");
    }

    public static void add(int a, int b, int c) {
        System.out.println("2nd method");
    }

    public static void add(int a, double b) {
        System.out.println("3rd method");
    }

    public static void add(double a, int b) {
        System.out.println("4th method");
    }

}
