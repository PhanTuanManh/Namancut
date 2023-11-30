package CreationalDesignPatterns.FactoryPattern;

public class StudentManagementClient {
    public static void main(String[] args) {
        StudentFactory undergraduateFactory = new UndergraduateFactory();
        StudentFactory postgraduateFactory = new PostgraduateFactory();

        // Tạo đối tượng sinh viên thông qua Factory
        Student undergraduateStudent = undergraduateFactory.createStudent("John Doe", 12345);
        Student postgraduateStudent = postgraduateFactory.createStudent("Jane Smith", 67890);

        // In thông tin sinh viên
        System.out.println(undergraduateStudent.getDetails());
        System.out.println(postgraduateStudent.getDetails());
    }
}