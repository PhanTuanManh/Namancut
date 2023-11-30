package StructuralPatterns.Adapter;

public class AdapterClient {
    public static void main(String[] args) {
        // Sử dụng interface Student với đối tượng StudentAdapter để làm việc với LegacyStudent
        Student student1 = new StudentAdapter(new LegacyStudent("John Doe", 12345));
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student ID: " + student1.getStudentID());

        // Sử dụng interface Student với đối tượng StudentAdapter để làm việc với LegacyStudent khác
        Student student2 = new StudentAdapter(new LegacyStudent("Jane Smith", 67890));
        System.out.println("Student Name: " + student2.getName());
        System.out.println("Student ID: " + student2.getStudentID());
    }
}