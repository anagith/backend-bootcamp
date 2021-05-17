package week4.day1;

public class Employee {
    String name;
    String workPlace;
    int age;
    int salary;

    public Employee() {
    }

    public Employee(String name, String workPlace, int age, int salary) {
        this.name = name;
        this.workPlace = workPlace;
        this.age = age;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println(this.name + " " + this.age + " " + this.workPlace + " " + this.salary);
    }

}
