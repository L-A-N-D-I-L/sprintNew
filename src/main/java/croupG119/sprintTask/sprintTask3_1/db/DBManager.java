package croupG119.sprintTask.sprintTask3_1.db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Long id = 5l;
    static{
        students.add(new Student(1l, "Zhansaya", "Batyrbek", 70, "B"));
        students.add(new Student(2l, "Sali", "Jirni", 40, "F"));
        students.add(new Student(3l, "Vanessa", "Jekson", 68, "B"));
        students.add(new Student(3l, "Muktar", "Ironov", 95, "A"));
    }
    public static ArrayList<Student> getStudents() {
        return students;
    }
    public static void addStudent(Student student){
        student.setId(id);
        students.add(student);
        id++;
    }
}
