package week6.day4;

import java.util.HashSet;
import java.util.Set;

public class OptionalProblems {
    public static void main(String[] args) {
        /*Integer[] arr = {1, 3, 4};
        MyArrayList<Integer> arrayList = new MyArrayList<>(arr);
        System.out.println(findMissingNumber(arrayList, 4));*/

        /*Integer[] arr = {1, 3, 4, 2, 3};
        MyArrayList<Integer> arrayList = new MyArrayList<>(arr);
        System.out.println(findDuplicate(arrayList));*/

       /* Integer[] arr = {1, 3, 4, 2, 3};
        MyArrayList<Integer> arrayList = new MyArrayList<>(arr);
        findPair(arrayList, 6);*/

        /*Integer[] arr = {1, 3, 4, 2, 3, 2};
        MyArrayList<Integer> arrayList = new MyArrayList<>(arr);
        System.out.println(findDuplicates(arrayList));*/

        /*Integer[] arr = {1, 3, 4, 2, 3, 2};
        MyArrayList<Integer> arrayList = new MyArrayList<>(arr);
        reverseArray(arrayList);
        System.out.println(arrayList);*/

        System.out.println(noAdjacentEqualChar("aabbbbddddd"));
    }

    public static int findMissingNumber(MyArrayList<Integer> arrayList, int count) {
        int expectedSum = count * (count + 1) / 2;
        int sum = 0;
        for (int i = 0; i < arrayList.getSize(); i++) {
            sum += arrayList.get(i);
        }
        return expectedSum - sum;
    }

    public static int findDuplicate(MyArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.getSize(); i++) {
            for (int j = 0; j < arrayList.getSize(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j)) && i != j) {
                    return arrayList.get(i);
                }
            }
        }
        return 0;
    }

    public static void findPair(MyArrayList<Integer> arrayList, int sum) {
        for (int i = 0; i < arrayList.getSize(); i++) {
            for (int j = i + 1; j < arrayList.getSize(); j++) {
                if (arrayList.get(i) + arrayList.get(j) == sum) {
                    System.out.print(arrayList.get(i) + "," + arrayList.get(j));
                    System.out.println();
                }
            }
        }
    }

    public static Set<Integer> findDuplicates(MyArrayList<Integer> arrayList) {
        Set<Integer> duplicates = new HashSet<>();
        for (int i = 0; i < arrayList.getSize(); i++) {
            for (int j = 0; j < arrayList.getSize(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j)) && i != j) {
                    duplicates.add(arrayList.get(i));
                }
            }
        }
        return duplicates;
    }

    public static void reverseArray(MyArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.getSize() / 2; i++) {
            int temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(arrayList.getSize() - i - 1));
            arrayList.set(arrayList.getSize() - i - 1, temp);
        }
    }

    public static int noAdjacentEqualChar(String str) {
        int count = 0;
        int temp = 1;
        int i = 0;
        while (i < str.length()) {
            for (int j = i; j < str.length() - 1; j++) {
                if (str.charAt(j) == str.charAt(j + 1)) {
                    temp++;
                } else {
                    break;
                }
            }
            i += temp;
            count += temp / 2;
            temp = 1;
        }
        return count;
    }
}
