package week1.day5;

public class Problem2 {
    public static void main(String[] args) {
        String first="name";
        String second="name";
        String third=new String("name");
        if (first == third) {
            System.out.println("Strings are ==");
        }
        if (first.equals(second)) {
            System.out.println("Strings are equal");
        }
    }
}
