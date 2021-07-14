package week4.day1;

public class Sort {
    Student[] students;

    public Sort() {
    }

    public Sort(Student[] students) {
        this.students = students;
    }

    public void sort(Student[] students, double weight) {
        //using selection sort
        double min;
        int index;
        for (int i = 0; i < students.length; i++) {
            min = students[i].weight;
            index = i;
            for (int j = i; j < students.length; j++) {
                if (students[j].weight < min) {
                    min = students[j].weight;
                    index = j;
                }
            }
            double temp = students[i].weight;
            students[i].weight = min;
            students[index].weight = temp;
        }
    }


    public void sort(Student[] students, String name) {
        //using selection sort
        String min;
        int index;
        for (int i = 0; i < students.length; i++) {
            min = students[i].name;
            index = i;
            for (int j = i; j < students.length; j++) {
                if (students[j].name.compareTo(min) < 0) {
                    min = students[j].name;
                    index = j;
                }
            }
            String temp = students[i].name;
            students[i].name = min;
            students[index].name = temp;
        }
    }

    public void sort(Student[] students, int age) {
        //using bubble sort
        for (int i = 0; i < students.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j + 1].age < students[j].age) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
