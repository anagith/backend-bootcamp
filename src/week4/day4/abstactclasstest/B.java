package week4.day4.abstactclasstest;

import week4.day4.abstactclasstest.abstractclass.A;

public class B extends A {
     public int x;
    public B(String str,int x) {
        super(str);
        this.x=x;
    }

    @Override
    public String toString() {
        return "B{" +
                "x=" + x +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected String getName() {
        return name;
    }
}
