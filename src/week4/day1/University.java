package week4.day1;

public class University {
    String name;
    int countOfStudents;
    int maxCountOfStudents;
    int minAgeOfStudent;
    int maxAgeOfStudent;
    String[] courses;

    public University() {
    }

    public University(String name, int countOfStudents, int maxCountOFStudents, int minAgeOfStudent, int maxAgeOfStudent, String[] courses) {
        this.name = name;
        this.countOfStudents = countOfStudents;
        this.maxCountOfStudents = maxCountOFStudents;
        this.minAgeOfStudent = minAgeOfStudent;
        this.maxAgeOfStudent = maxAgeOfStudent;
        this.courses = courses;
    }

    public void printInfo() {
        System.out.println(name + " " + countOfStudents + " " + maxCountOfStudents + " "
                + minAgeOfStudent + " " + maxAgeOfStudent);
    }

    public boolean checkAge(int age) {
        if (age >= minAgeOfStudent && age <= maxAgeOfStudent) {
            return true;
        }
        return false;
    }

    public void register() {
        if (countOfStudents < maxCountOfStudents) {
            countOfStudents++;
            System.out.println("registered");
        } else {
            System.out.println("couldn't register");
        }

    }

    public void admission() {
        for (int i = 0; i < courses.length; i++) {
            System.out.print(courses[i] + " " + i);
            System.out.println();
        }
        System.out.println("choose");
        Menu menu = new Menu();
        int choose = menu.scanner.nextInt();
        if (choose < courses.length) {
            System.out.println("input your age");
        }
        int age = menu.scanner.nextInt();
        if (checkAge(age)) {
            register();
        }
    }
}
