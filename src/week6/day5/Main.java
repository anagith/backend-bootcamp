package week6.day5;



public class Main {
    public static void main(String[] args) {
/*        MyArrayDeque<Integer> integerMyArrayDeque = new MyArrayDeque<>();

        integerMyArrayDeque.addFirst(1);
        integerMyArrayDeque.addLast(2);
        integerMyArrayDeque.addLast(3);
        integerMyArrayDeque.addLast(4);
        integerMyArrayDeque.addLast(5);

        integerMyArrayDeque.removeLast();
        integerMyArrayDeque.removeFirst();
        System.out.println(integerMyArrayDeque.getFirst());
        System.out.println(integerMyArrayDeque.getLast());

        System.out.println(integerMyArrayDeque);*/

        MyStack<Integer> integerMyStack = new MyStack<>();
        integerMyStack.push(1);
        integerMyStack.push(2);
        integerMyStack.push(3);
        integerMyStack.push(4);
        integerMyStack.push(5);
        integerMyStack.pop();
        System.out.println(integerMyStack);

    }
}
