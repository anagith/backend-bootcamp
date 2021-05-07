package week2.day5;

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int number = 0;
        for (int i = 0; i < n; i += 2) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = number;
                number++;
            }
            if (i < n - 1) {
                for (int j = m - 1; j >= 0; j--) {
                    matrix[i + 1][j] = number;
                    number++;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
