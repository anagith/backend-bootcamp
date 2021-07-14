package week1.day4;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input=scanner.nextInt();
        if(input%5==0)
        {
            System.out.println("Number is a multiple of a 5");
        }
        else {
            System.out.println("Number is not a multiple of a 5");
        }
    }
}
