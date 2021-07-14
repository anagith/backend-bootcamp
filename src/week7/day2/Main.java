package week7.day2;

public class Main {
    public static void main(String[] args) {
        MyBST myBST = new MyBST();
        myBST.add(40);
        myBST.add(20);
        myBST.add(10);
        myBST.add(30);
        myBST.add(60);
        myBST.add(70);
        myBST.add(5);
        myBST.add(13);
        myBST.add(55);

        myBST.BFS();
        myBST.remove(60);
        System.out.println();
        myBST.BFS();
        //myBST.iterativePreorder();
        System.out.println();
        System.out.println(myBST.height());
    }
}
