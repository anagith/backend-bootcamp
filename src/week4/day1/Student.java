package week4.day1;

public class Student {
    String name;
    int age;
    double weight;

    public Student() {
    }

    public Student(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println(name + " " + age + " " + weight);
    }
}
