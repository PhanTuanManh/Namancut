package CreationalDesignPatterns.Singleton;
import java.util.ArrayList;
import java.util.List;
public class StudentManager {

    private StudentManager() {
        students = new ArrayList<>();
    }


    private static StudentManager instance;


    private List<String> students;


    public static StudentManager getInstance() {
        if (instance == null) {
            instance = new StudentManager();
        }
        return instance;
    }


    public void addStudent(String studentName) {
        students.add(studentName);
    }


    public void displayStudents() {
        System.out.println("List of Students:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}