package week2.day4;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        int top = 0;
        int bottom = size - 1;
        int left = 0;
        int right = size - 1;
        int num = 1;
        while (top != size / 2 + 1) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num;
                matrix[bottom][i] = num;
            }
            for (int j = top; j <= bottom; j++) {
                matrix[j][left] = num;
                matrix[j][right] = num;
            }
            left++;
            right--;
            top++;
            bottom--;
            num++;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
