package week8.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println(NumberOfTimeCharAppears("/home/user/Desktop/homework.txt", 'a'));
        System.out.println(getInt("/home/user/Desktop/homework.txt"));
    }

    private static int NumberOfTimeCharAppears(String filePath, char ch) {
        int count = 0;
        try (BufferedReader bf = new BufferedReader(new FileReader(filePath))) {
            char temp;
            int i;
            while ((i = bf.read()) != -1) {
                temp = (char) i;
                if (temp == ch) {
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    private static int getInt(String filePath) {
        long index = getIndex(filePath);
        int integer = 0;
        try (BufferedReader bf = new BufferedReader(new FileReader(filePath))) {
            int i = 0;
            int ch;
            while (i < index) {
                ch = bf.read();
                i++;
            }
            int k;
            while ((k = (i = bf.read())) >= 48 && k <= 57) {
                integer += i - 48;
                integer *= 10;
            }
            integer /= 10;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return integer;
    }

    private static long getIndex(String filePath) {
        long index = 0;
        try (BufferedReader bf = new BufferedReader(new FileReader(filePath))) {
            int i, k;
            while ((k = (i = bf.read())) >= 48 && k <= 57) {
                index += i - 48;
                index *= 10;
            }
            index /= 10;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return index;
    }
}
