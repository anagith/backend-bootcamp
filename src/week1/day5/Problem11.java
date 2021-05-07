package week1.day5;

import java.io.IOException;
import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int first = scanner.nextInt();
        System.out.println("enter second number");
        int second = scanner.nextInt();
        System.out.println("Enter an operator (+, -, *, /)");
        char choice = (char) System.in.read();
        switch (choice) {
            case '+': {
                System.out.println(first + second);
                break;
            }
            case '-': {
                System.out.println(first - second);
                break;
            }
            case '*': {
                System.out.println(first * second);
                break;
            }
            case '/': {
                if (second == 0) {
                    System.out.println("division by 0");
                } else {
                    System.out.println((double) first / second);
                }
                break;
            }
            default:
                System.out.println("please input valid operation");
        }
    }
}
