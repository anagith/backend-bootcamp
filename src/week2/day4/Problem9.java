package week2.day4;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        int top = 0;
        int bottom = size - 1;
        int left = 0;
        int right = size - 1;
        int num = 1;
        int count = 0;

        for (int i = left; i <= right; i++) {
            matrix[top][i] = num;
        }
        count++;
        top += 2;

        if (count != size) {
            for (int i = top - 1; i <= bottom; i++) {
                matrix[i][right] = num;

            }
            count++;
            right -= 2;
        }

        if (count != size) {
            for (int i = right + 1; i >= left; i--) {
                matrix[bottom][i] = num;
            }
            count++;
            bottom -= 2;
        }
        if (count != size) {
            for (int i = bottom + 1; i >= top; i--) {
                matrix[i][left] = num;

            }
            count++;
            left += 2;
        }
        while (true) {
            if (count == size) {
                break;
            }

            for (int i = left - 1; i <= right; i++) {
                matrix[top][i] = num;
            }
            count++;
            if (count == size) {
                break;
            }
            top += 2;


            for (int i = top - 1; i <= bottom; i++) {
                matrix[i][right] = num;
            }
            count++;
            if (count == size) {
                break;
            }
            right -= 2;

            for (int i = right + 1; i >= left; i--) {
                matrix[bottom][i] = num;

            }
            count++;
            if (count == size) {
                break;
            }
            bottom -= 2;

            for (int i = bottom + 1; i >= top; i--) {
                matrix[i][left] = num;
            }
            count++;
            if (count == size) {
                break;
            }
            left += 2;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
