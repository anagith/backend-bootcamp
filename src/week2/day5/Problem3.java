package week2.day5;

public class Problem3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 15; i ++)
        {
            System.out.print("1 ");
        }
        for (int i = 10; i <= 100; i = i+7)
        {
            System.out.print("2 ");
        }

        //DOES NOT COMPILE
        //for (float i = 1.5; i <= 10.3; i = i+0.4)

    }
}
