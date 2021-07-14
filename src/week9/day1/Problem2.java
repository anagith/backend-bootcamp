package week9.day1;

import java.util.function.Predicate;

public class Problem2 {
    public static void main(String[] args) {

        //System.out.println(isOdd(4));
        //System.out.println(isPrime(3));
        System.out.println(isPalindrome(991));

    }

    public static boolean isOdd(Integer integer) {
        Predicate<Integer> predicate = number -> number % 2 == 1;
        return (predicate.test(integer));
    }

    public static boolean isPrime(Integer integer) {
        Predicate<Integer> predicate1 = number -> number == 2;
        Predicate<Integer> predicate2 = number -> {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            ;
            return true;
        };
        return predicate1.or(predicate2).test(integer);
    }

    public static boolean isPalindrome(Integer integer) {
        String string = integer.toString();
        StringBuilder sb = new StringBuilder(string);
        Predicate<String> predicate = str -> str.equals(sb.reverse().toString());
        return predicate.test(string);
    }
}
