package week7.day5;


import java.util.*;


public class Problem12 {

    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(5);
        integers.add(2);
        integers.add(5);
        integers.add(4);
        integers.add(3);
        integers.add(3);
        integers.add(3);

        TreeMap sorted = sort(integers);
        print(sorted);

    }

    public static TreeMap sort(List<Integer> list) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < list.size(); i++) {
            int count = count(list, list.get(i));
            treeMap.put(list.get(i), count);
        }
        Comparator valueComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                Integer v1 = treeMap.get(o1);
                Integer v2 = treeMap.get(o2);
                int compare = v1.compareTo(v2);
                if (compare == 0) {
                    return 1;
                } else {
                    return compare;
                }
            }
        };
        TreeMap<Integer, Integer> sortedByValues = new TreeMap<Integer, Integer>(valueComparator);
        sortedByValues.putAll(treeMap);
        return sortedByValues;
    }

    private static int count(List<Integer> list, int element) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(element)) {
                count++;
            }
        }
        return count;
    }

    private static void print(TreeMap<Integer, Integer> treeMap) {
        Iterator<Map.Entry<Integer, Integer>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            for (int i = 0; i < entry.getValue(); i++) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

}
