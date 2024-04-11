package deadline_singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StudentManager {
    private String name;
    private int age;
    private String className;
    private double score;

    // Constructor
    public StudentManager (String name, int age, String className, double score) {
        this.name = name;
        this.age = age;
        this.className = className;
        this.score = score;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

public class Deadline_Singleton {
    private static Deadline_Singleton instance;
    private List<StudentManager> studentList;

    // Private constructor to prevent instantiation from outside
    private Deadline_Singleton() {
        studentList = new ArrayList<>();
    }

    // Method to get the instance of Deadline_Singleton
    public static synchronized Deadline_Singleton getInstance() {
        if (instance == null) {
            instance = new Deadline_Singleton();
        }
        return instance;
    }

    // Method to add a student to the list
    public synchronized void addStudent(StudentManager student) {
        studentList.add(student);
    }

    // Method to remove a student from the list
    public synchronized void removeStudent(StudentManager student) {
        studentList.remove(student);
    }

    // Method to retrieve the list of students
    public synchronized List<StudentManager> getStudentList() {
        return studentList;
    }

    public static void main(String[] args) {
        // Creating a new student manager instance
        Deadline_Singleton studentManager = Deadline_Singleton.getInstance();
        Scanner scanner = new Scanner(System.in);

        // Input from keyboard
        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.print("Class: ");
            String className = scanner.nextLine();
            System.out.print("Score: ");
            double score = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            StudentManager student = new StudentManager(name, age, className, score);
            studentManager.addStudent(student);
        }

        // Getting the list of students
        List<StudentManager> students = studentManager.getStudentList();

        // Displaying the information of each student
        System.out.println("List of students:");
        for (StudentManager student : students) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Class: " +
                    student.getClassName() + ", Score: " + student.getScore());
        }
    }
}