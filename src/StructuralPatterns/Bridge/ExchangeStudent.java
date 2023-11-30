package StructuralPatterns.Bridge;

class ExchangeStudent extends StudentAbstraction {
    ExchangeStudent(StudentType studentType) {
        super(studentType);
    }

    @Override
    void showDetails() {
        System.out.println("Exchange Student Details:");
        studentType.showType();
    }
}