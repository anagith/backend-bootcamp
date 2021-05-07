package week2.day4;

import java.util.Scanner;

public class Problem4 {
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
        int numberOfAthlete = 0;
        int maxCount = 0;
        for (int i = 0; i < m; i++) {
            maxCount += matrix[0][i];
        }

        int count = 0;
        for (int i = 1; i < n; i++) {
            count = 0;
            for (int j = 0; j < m; j++) {
                count += matrix[i][j];
                if (count > maxCount) {
                    maxCount = count;
                    numberOfAthlete = i;
                }
            }
        }
        System.out.println("max is "+ maxCount + " line is  " + numberOfAthlete);
    }
}
