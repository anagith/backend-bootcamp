package week8.day3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // System.out.println(NumberOfTimeCharAppears("/home/user/Desktop/homework.txt", 'a'));
        try {
            long dataPosition = 0; //to be determined later
            int data = 123;
            RandomAccessFile raf = new RandomAccessFile("datafile", "rw");
            //Write the file.
            raf.writeLong(0); //placeholder
            raf.writeChars("blahblahblah");
            dataPosition = raf.getFilePointer();
            raf.writeInt(data);
            raf.writeUTF("yadayadayada");
            //Rewrite the first byte to reflect updated data position.
            raf.seek(0);
            raf.writeLong(dataPosition);
            raf.close();
        } catch (FileNotFoundException e) {
            System.err.println("This shouldn't happen: " + e);
        } catch (IOException e) {
            System.err.println("Writing error: " + e);
        }
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
