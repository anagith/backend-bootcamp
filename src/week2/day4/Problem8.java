package week2.day4;

public class Problem8 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] matrix2 = {{1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}};
        int[][] sum = new int[3][3];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
