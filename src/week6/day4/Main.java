package week6.day4;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> integerMyArrayList = new MyArrayList<>();
        integerMyArrayList.add(1);
        integerMyArrayList.add(2);
        integerMyArrayList.add(3);
        integerMyArrayList.add(4);
        integerMyArrayList.add(5);

        MyArrayList<Integer> integerMyArrayList1 = new MyArrayList<>();
        integerMyArrayList1.add(1);
        integerMyArrayList1.add(2);
        //integerArrayList.reverse();
        //integerArrayList.join(integerArrayList1);
        //System.out.println(integerArrayList.clone());
        //System.out.println(integerArrayList);


        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();
        integerMyLinkedList.add(1);
        integerMyLinkedList.add(2);
        integerMyLinkedList.add(null);
        integerMyLinkedList.add(4);
        integerMyLinkedList.add(5);
        integerMyLinkedList.add(6);
        integerMyLinkedList.add(7);
        integerMyLinkedList.add(8);
        integerMyLinkedList.add(9);
        //integerLinkedList.removeFirstAndLast();
        //integerLinkedList.clear();
        //integerLinkedList.remove(null);
        //integerLinkedList.swap(2,5);

        /*LinkedList<Integer> clone = integerLinkedList.clone();
        System.out.println(clone);
        integerArrayList.add(3);
        System.out.println(clone);*/
        //System.out.println(Arrays.toString(integerLinkedList.toArray()));
/*      Node<Object> objectNode = new Node<>(null);
        Node<Object> objectNode1 = new Node<>(null);
        System.out.println(objectNode1.equals(objectNode));*/

        integerMyLinkedList.set(2, 56);
        System.out.println(integerMyLinkedList);


    }
}
