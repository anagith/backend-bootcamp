package week5.day2;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(2);
        myArrayList.add(5);
        myArrayList.add(4);
        Integer[] myArrayList1 = {2, 3};
        myArrayList.removeAll(myArrayList1);
        myArrayList.print();

    }
}
