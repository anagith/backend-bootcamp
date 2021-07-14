package week7.day5;

import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(1, "a");
        integerStringHashMap.put(4, "b");
        integerStringHashMap.put(3, "c");
        integerStringHashMap.put(5, "d");

       /* HashMap<Integer, String> copy = MapProblems.copy(integerStringHashMap);
        System.out.println(copy);*/

        /*System.out.println(integerStringHashMap);
        MapProblems.removeAll(integerStringHashMap);*/
        //System.out.println(integerStringHashMap);

        // System.out.println(MapProblems.contains(integerStringHashMap, 5, "b"));
        //MapProblems.getKeySet(integerStringHashMap);
        //MapProblems.getValueSet(integerStringHashMap);


        TreeMap<Integer, String> integerStringTreeMap = new TreeMap<>();
        integerStringTreeMap.put(1, "a");
        integerStringTreeMap.put(5, "c");
        integerStringTreeMap.put(4, "u");
        integerStringTreeMap.put(15, "t");
        integerStringTreeMap.put(66, "r");
        integerStringTreeMap.put(12, "d");

        //MapProblems.getFirstAndLastKey(integerStringTreeMap);
        //System.out.println(MapProblems.getReverseKeys(integerStringTreeMap));
        //System.out.println(MapProblems.greaterThan(integerStringTreeMap, 7));

    }
}
