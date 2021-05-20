package week4.day4.abstactclasstest.abstractclass;

public abstract class A {
    public A() {
    }

    public A(String name) {
        this.name = name;
    }

    protected String name;
    protected abstract String getName();
}
