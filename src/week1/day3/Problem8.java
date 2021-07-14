package week1.day3;


public class Problem8 {
    public static void main(String[] args) {
        String name = "Ana";
        int sum = 0;
        sum += name.charAt(0);
        sum += name.charAt(1);
        sum += name.charAt(2);
        int average = sum / 3;
        System.out.println(average);

    }
}
