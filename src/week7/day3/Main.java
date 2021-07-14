package week7.day3;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        //System.out.println(SetProblems.isEmpty(integers));
        integers.add(2);
        integers.add(5);
        integers.add(1);
        integers.add(7);
        integers.add(10);

        HashSet<Integer> integers2 = new HashSet<>();
        //System.out.println(SetProblems.isEmpty(integers));
        integers2.add(4);
        integers2.add(5);
        integers2.add(1);
        integers2.add(7);
        integers2.add(10);
        //System.out.println(SetProblems.getNumberOfElements(integers));
        //System.out.println(SetProblems.isEmpty(integers));
        //Set<Integer> clone=SetProblems.clone(integers);
        /*TreeSet<Integer> ts=SetProblems.convertHashSetToTreeSet(integers);
        System.out.println(ts);*/
        // System.out.println(SetProblems.compare(integers, integers2));

        /*SetProblems.removeAll(integers);
        System.out.println(integers);*/

        TreeSet<Integer> integers1 = new TreeSet<>();
        integers1.add(2);
        integers1.add(10);
        integers1.add(1);
        integers1.add(6);
        integers1.add(4);
        integers1.add(5);
        //SetProblems.iterateTreeSet(integers1);
        //System.out.println(SetProblems.getLastInTreeSet(integers1));
        //System.out.println(SetProblems.getFirstInTreeSet(integers1));
        //SetProblems.getLessThanSeven(integers1);
        System.out.println(integers1);
        SetProblems.remove(integers1,5);
        System.out.println(integers1);
//        Iterator<Integer> iterator = integers1.iterator();
//        while (iterator.hasNext()){
//            int num = iterator.next();
//            if(num == 5){
//                iterator.remove();
//            }
//        }
//        System.out.println(integers1);

    }
}
