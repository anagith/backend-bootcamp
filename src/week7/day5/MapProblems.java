package week7.day5;

import java.util.*;


public class MapProblems<K, V> {

    public static <K, V> Map<K, V> copy(Map<K, V> map) {
        HashMap<K, V> copy = new HashMap<>();
        Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            copy.put((K) entry.getKey(), (V) entry.getValue());
        }
        return copy;
    }

    public static <K, V> void removeAll(HashMap<K, V> hashMap) {
        Iterator<Map.Entry<K, V>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.print("removing " + iterator.next());
            iterator.remove();
            System.out.println();
        }
    }

    public static <K, V> boolean contains(HashMap<K, V> hashMap, K key, V value) {
        HashMap<K, V> copy = new HashMap<>();
        Iterator<Map.Entry<K, V>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            if (entry.getKey().equals(key) && entry.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static <K, V> void getKeySet(HashMap<K, V> hashMap) {
        Set<K> ks = hashMap.keySet();
        Iterator<K> iterator = ks.iterator();
        System.out.print("Key set [ ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.print("]");
    }

    public static <K, V> void getValueSet(HashMap<K, V> hashMap) {
        Iterator<V> iterator = hashMap.values().iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    public static <K, V> void getFirstAndLastKey(TreeMap<K, V> treeMap) {
        Iterator<Map.Entry<K, V>> iterator = treeMap.entrySet().iterator();
        System.out.println("First key " + iterator.next().getKey());
        Map.Entry<K, V> entry = iterator.next();
        while (iterator.hasNext()) {
            entry = iterator.next();
        }
        System.out.println("Last key " + entry.getKey());
    }

    public static <K, V> Set<K> getReverseKeys(Map<K, V> map) {
        Set<K> ks = map.keySet();
        ArrayList<K> list = new ArrayList<>(ks);
        Collections.sort(list, Collections.reverseOrder());
        ks = new LinkedHashSet<>(list);
        return ks;
    }

    public static <K extends Comparable<K>, V> Set<K> greaterThan(Map<K, V> map, K key) {
        Set<K> set = new HashSet<>();
        Iterator<K> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            K next = iterator.next();
            if (next.compareTo(key) >= 0) {
                set.add(next);
            }
        }
        return set;
    }


}
