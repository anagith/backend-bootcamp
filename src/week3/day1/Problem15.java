package week3.day1;

import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
        int[] grades = inputGrade(numberOfStudents);
        System.out.println(String.format("%.2f", averageGrade(grades)));
        System.out.println(min(grades));
        System.out.println(max(grades));

    }

    public static int[] inputGrade(int numberOfStudents) {
        int[] grades = new int[numberOfStudents];
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= grades.length; i++) {
            System.out.print("Enter the grade for student " + i + " :");
            int grade = scanner.nextInt();
            if (grade < 0 || grade > 100) {
                System.out.println("please input grade from 0 to 100");
                break;
            }
            grades[i - 1] = grade;
        }
        return grades;
    }

    public static double averageGrade(int[] grades) {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }

    public static int min(int[] grades) {
        int min = 100;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }

    public static int max(int[] grades) {
        int max = 0;
        for (int i = 0; i < grades.length; i++) {
            if (max < grades[i]) {
                max = grades[i];
            }
        }
        return max;
    }
}
