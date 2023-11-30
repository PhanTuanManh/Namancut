package CreationalDesignPatterns.AbstractFactory;

public class StudentManagementClient {
    public static void main(String[] args) {
        // Sử dụng Abstract Factory để tạo ra Undergraduate
        StudentFactory undergraduateFactory = new UndergraduateFactory();
        Student undergraduateStudent = undergraduateFactory.createStudent("John Doe", 12345);
        System.out.println(undergraduateStudent.getDetails());

        // Sử dụng Abstract Factory để tạo ra Postgraduate
        StudentFactory postgraduateFactory = new PostgraduateFactory();
        Student postgraduateStudent = postgraduateFactory.createStudent("Jane Smith", 67890);
        System.out.println(postgraduateStudent.getDetails());
    }
}