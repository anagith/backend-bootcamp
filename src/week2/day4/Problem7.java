package week2.day4;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] matrix1 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        int p = scanner.nextInt();
        int[][] matrix2 = new int[n][p];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        int[][] multiple = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                multiple[i][j] = 0;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int l = 0; l < n; l++) {
                    multiple[i][j] += matrix1[i][l] * matrix2[l][j];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(multiple[i][j] + " ");
            }
            System.out.println();
        }
    }
}
