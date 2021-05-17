package week4.day1;

public class Main {
    public static void main(String[] args) {
        /*String[] courses={"CS","Business","FL","Physics"};
        University university = new University("YSU",1201,1300,
                17,65,courses);
        university.admission();*/

        /*int[] arr={5,4,7,1,6};
        Arithmetic arithmetic = new Arithmetic(arr);
        arithmetic.option();*/


        Student[] students = {
                new Student("EFG", 20, 55),
                new Student("ABC", 19, 50),
                new Student("AAA", 30, 40)
        };
        Sort sort = new Sort(students);
        sort.sort(students, 10.0);
        for (int i = 0; i < sort.students.length; i++) {
            students[i].printInfo();
            System.out.println();
        }

    }
}
