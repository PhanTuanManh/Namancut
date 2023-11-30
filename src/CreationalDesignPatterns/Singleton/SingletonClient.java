package CreationalDesignPatterns.Singleton;

public class SingletonClient {
    public static void main(String[] args) {

        StudentManager studentManager = StudentManager.getInstance();

        studentManager.addStudent("John Doe");
        studentManager.addStudent("Jane Smith");

        studentManager.displayStudents();

    }
}
