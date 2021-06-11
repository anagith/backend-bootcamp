package week7.day4;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, String> integerStringMyHashMap = new MyHashMap<>();
        integerStringMyHashMap.put(1, "aaa");
        integerStringMyHashMap.put(11, "ava");
        integerStringMyHashMap.put(11,"as");
        //integerStringMyHashMap.delete(11);
        System.out.println(integerStringMyHashMap);
    }
}
