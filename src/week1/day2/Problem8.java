package week1.day2;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
       /* In program we have byte b, short c , int a,  variables, print result of these actions
        -  print average of them
        -  print product of them*/
        Scanner scanner = new Scanner(System.in);
        byte b = scanner.nextByte();
        short c = scanner.nextShort();
        int a = scanner.nextInt();
        float average = (a + b + c) / 3f;
        long product = a * b * c;
        System.out.println(average);
        System.out.println(product);
    }
}
