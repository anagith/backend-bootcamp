package week6.day4;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);

        ArrayList<Integer> integerArrayList1 = new ArrayList<>();
        integerArrayList1.add(1);
        integerArrayList1.add(2);
        //integerArrayList.reverse();
        //integerArrayList.join(integerArrayList1);
        //System.out.println(integerArrayList.clone());
        //System.out.println(integerArrayList);


        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.add(null);
        integerLinkedList.add(4);
        integerLinkedList.add(5);
        integerLinkedList.add(6);
        integerLinkedList.add(7);
        integerLinkedList.add(8);
        integerLinkedList.add(9);
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

        integerLinkedList.set(2, 56);
        System.out.println(integerLinkedList);


    }
}
