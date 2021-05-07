package week2.day5;

import java.util.Random;
import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int[][] result = new int[m][n];
        int[][] result2 = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                for (int j = 0; j < matrix.length; j++) {
                    for (int i = n - 1; i >= 0; i--) {
                        result[j][n - i - 1] = matrix[i][j];
                    }
                }
                for (int i = 0; i < result.length; i++) {
                    for (int j = 0; j < result[i].length; j++) {
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            }
            case 2: {
                for (int j = n - 1; j >= 0; j--) {
                    for (int i = m - 1; i >= 0; i--) {
                        result2[n - j - 1][m - i - 1] = matrix[j][i];
                    }
                }
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(result2[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            }
            default:
                System.out.println("Illegal choice");
        }
    }
}
