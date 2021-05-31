package week6;

import week6.day1.DynamicArray;
import week6.day1.GenericDynamicArray;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    /*    DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(2);
        dynamicArray.add("String");
        System.out.println(dynamicArray.get(1));*/

        GenericDynamicArray<Integer> genericDynamicArray=new GenericDynamicArray<>();
        genericDynamicArray.add(2);
        genericDynamicArray.add(45);
        genericDynamicArray.add(12);
        genericDynamicArray.add(23);
        genericDynamicArray.print();
        genericDynamicArray.remove(1);
        genericDynamicArray.print();
    }
}
