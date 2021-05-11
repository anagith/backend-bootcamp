package week3.day2;

public class Problem9 {
    public static void main(String[] args) {
        int fahrenheit = 12;
        System.out.println(fahrenheit + " fahrenheit is " + fahrenheitCelsius(fahrenheit) + " celsius ");
        float celsius = 2.78f;
        System.out.println(celsius + " celsius is " + fahrenheitCelsius(celsius) + " fahrenheit ");
    }

    public static float fahrenheitCelsius(float celsius) {
        float fahrenheit = celsius * 9 / 5 + 32;
        return fahrenheit;
    }

    public static float fahrenheitCelsius(int fahrenheit) {
        float celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
}
