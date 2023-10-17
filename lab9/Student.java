package lab9;
public class Student {
    private String name;
    private int iDNumber;

    public Student(String name, int iDNumber) {
        this.name = name;
        this.iDNumber = iDNumber;
    }

    public String getName() {
        return name;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Марина", 3);
        students[1] = new Student("Саша", 1);
        students[2] = new Student("Павлик", 4);
        students[3] = new Student("Даня", 2);
        students[4] = new Student("Алексей", 5);

        System.out.println("Исходный массив студентов:");
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getIDNumber());
        }

        insertionSort(students);

        System.out.println("\nОтсортированный массив студентов по iDNumber:");
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getIDNumber());
        }
    }
}