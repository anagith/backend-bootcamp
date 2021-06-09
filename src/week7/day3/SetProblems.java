package week7.day3;

import java.util.*;

public class SetProblems<T> {


    public static <T> int getNumberOfElements(Set<T> set) {
        Iterator iterator = set.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            count++;
            iterator.next();
        }
        return count;
    }

    public static <T> boolean isEmpty(Set<T> set) {
        return getNumberOfElements(set) == 0;
    }

    public static <T> Set<T> clone(Set<T> set) {
        Set<Object> objects = new HashSet<>();
        Iterator<T> iterator = set.iterator();
        while (iterator.hasNext()) {
            objects.add((T) iterator.next());
        }
        return (Set<T>) objects;
    }

    public static <T> TreeSet<T> convertHashSetToTreeSet(HashSet<T> hashSet) {
        TreeSet<T> ts = new TreeSet<>();
        Iterator<T> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            ts.add(iterator.next());
        }
        return ts;
    }

    public static <T> boolean compare(Set<T> set1, Set<T> set2) {
        if (set1.size() != set2.size()) {
            return false;
        }
        Iterator<T> iterator = set1.iterator();
        Iterator<T> iterator1 = set2.iterator();
        while (iterator.hasNext() && iterator1.hasNext()) {
            if (!iterator.next().equals(iterator1.next())) {
                return false;
            }
        }
        return true;
    }


    public static <T> ArrayList<T> convertSetToList(Set<T> set) {
        ArrayList<T> arrayList = new ArrayList<>();
        Iterator<T> iterator = set.iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next());
        }
        return arrayList;
    }

    public static <T> void removeAll(Set<T> set) {
        Iterator<T> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print("removing " + iterator.next());
            iterator.remove();
            System.out.println();
        }
    }

    public static <T> void iterateTreeSet(TreeSet<T> ts) {
        Iterator<T> iterator = ts.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    public static <T> T getLastInTreeSet(TreeSet<T> treeSet) {
        Iterator<T> iterator = treeSet.iterator();
        T last = null;
        while (iterator.hasNext()) {
            last = iterator.next();
        }
        return last;
    }

    public static <T> T getFirstInTreeSet(TreeSet<T> treeSet) {
        Iterator<T> iterator = treeSet.iterator();
        T first = iterator.next();
        return first;
    }

    public static void getLessThanSeven(TreeSet<Integer> treeSet) {
        getLessThan(treeSet, 7);
    }

    public static void getLessThan(TreeSet<Integer> treeSet, Integer val) {
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Integer temp = iterator.next();
            if (temp <= val) {
                System.out.print(temp + " ");
            }
        }
    }

    public static <T> void remove(TreeSet<T> set, T value) {
        Iterator<T> iterator = set.iterator();
        while (iterator.hasNext()) {
            T temp = iterator.next();
            if (temp.equals(value)) {
                iterator.remove();
            }
        }
    }



}
