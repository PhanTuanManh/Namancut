package StructuralPatterns.Bridge;

class RegularStudent extends StudentAbstraction {
    RegularStudent(StudentType studentType) {
        super(studentType);
    }

    @Override
    void showDetails() {
        System.out.println("Regular Student Details:");
        studentType.showType();
    }
}