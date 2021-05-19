package week4.day3;

public class Dog extends Animal {
    @Override
    protected void eat() {
        System.out.println("dog իս eat");
    }

    @Override
    protected void voice() {
        System.out.println("dog's voice");
    }
}
