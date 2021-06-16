package week8.day3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        //  System.out.println(getInt("/home/user/Desktop/homework.txt"));
        System.out.println(getInt("datafile"));
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
        int data = 0;
        try (RandomAccessFile raf = new RandomAccessFile(filePath, "r")) {
            long index = 0;
            index = raf.readLong();
            raf.seek(index);
            data = raf.readInt();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
