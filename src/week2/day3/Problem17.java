package week2.day3;

import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        boolean desc=true;
        for (int i = 0; i < size - 1; i++) {
            if (array[i] > array[i + 1]) {
                desc=false;
                break;
            }
        }
        boolean asc=true;
        if(!desc)
        {
            for (int i = 0; i < size - 1; i++) {
                if (array[i] < array[i + 1]) {
                    asc =false;
                    break;
                }
            }
        }

        if(asc || desc)
        {
            System.out.print("sorted");
        }
        else {
            System.out.println("not sorted");
        }
    }

}
