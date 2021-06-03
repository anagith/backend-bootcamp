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
        System.out.println(integerArrayList.clone());
        System.out.println(integerArrayList);



    }
}
