package week2.day4;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int max = matrix[0][0];
        int row = 0;
        int column = 0;
        for (int i = 1; i < m; i++) {
            if (matrix[0][i] > max) {
                max = matrix[0][i];
                column = i;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        System.out.print("max element is " + max + " row is " + row + " column is " + column);
    }
}
