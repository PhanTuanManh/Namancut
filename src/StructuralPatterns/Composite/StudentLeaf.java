package StructuralPatterns.Composite;

class StudentLeaf implements StudentComponent {
    private String name;

    StudentLeaf(String name) {
        this.name = name;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student: " + name);
    }
}
