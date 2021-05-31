package week6;

import week6.day1.DynamicArray;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(2);
        dynamicArray.add("String");
        System.out.println(dynamicArray.get(1));

    }
}
