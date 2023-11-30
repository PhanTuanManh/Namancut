package StructuralPatterns.Bridge;

abstract class StudentAbstraction {
    protected StudentType studentType;

    StudentAbstraction(StudentType studentType) {
        this.studentType = studentType;
    }

    abstract void showDetails();
}