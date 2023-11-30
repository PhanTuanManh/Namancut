package StructuralPatterns.Composite;

public class CompositeClient {
    public static void main(String[] args) {
        // Tạo đối tượng sinh viên
        StudentComponent student1 = new StudentLeaf("John Doe");
        StudentComponent student2 = new StudentLeaf("Jane Smith");

        // Tạo đối tượng nhóm
        GroupComposite group1 = new GroupComposite("Group 1");
        group1.addMember(student1);
        group1.addMember(student2);

        // Hiển thị thông tin sinh viên và nhóm
        student1.displayDetails();
        System.out.println();

        student2.displayDetails();
        System.out.println();

        group1.displayDetails();
    }
}