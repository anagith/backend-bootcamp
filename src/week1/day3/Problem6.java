package week1.day3;

import java.io.IOException;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char a = (char) System.in.read();
        char b = (char) System.in.read();
        char c = (char) System.in.read();
        String name = String.valueOf(a) + b + c;
        int age = scanner.nextInt();
        String result = name + age;
        System.out.println(result);

    }
}
