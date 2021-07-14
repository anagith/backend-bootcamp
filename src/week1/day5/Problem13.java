package week1.day5;

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter quiz score");
        int quizScore = scanner.nextInt();
        System.out.println("enter mid-term score");
        int midTermScore = scanner.nextInt();
        System.out.println("enter final score");
        int finalScore = scanner.nextInt();

        int averageScore = (quizScore + midTermScore + finalScore) / 3;

        switch ((averageScore + 20) / 20) {
            case 1:
            case 2: {
                System.out.println("grade=F");
                break;
            }
            case 3: {
                System.out.println("grade=C");
                break;
            }
            case 4: {
                System.out.println("grade=B");
                break;
            }
            case 5: {
                System.out.println("grade=A");
                break;
            }
            default:
                System.out.println(" please input correct grades");
        }
    }
}