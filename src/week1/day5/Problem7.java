package week1.day5;

import java.io.IOException;

public class Problem7 {
    public static void main(String[] args) throws IOException {
        /*What is the correct way to declare a variable
        a. int 1x=10;
        b. int x=10;
        c. float x=10.0f;
        d. string x="10";
        Enter your choice:*/
        char choice = (char) System.in.read();
        switch (choice) {
            case 'a':
            case 'd': {
                System.out.println("Invalide choice");
                break;
            }
            case 'b':
            case 'c': {
                System.out.println("congrats");
                break;
            }
            default: {
                System.out.println("please input a b c or d ");
            }
        }
    }
}
