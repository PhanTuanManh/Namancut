package StructuralPatterns.Adapter;

class LegacyStudent {
    private String fullName;
    private int rollNo;

    LegacyStudent(String fullName, int rollNo) {
        this.fullName = fullName;
        this.rollNo = rollNo;
    }

    String getFullName() {
        return fullName;
    }

    int getRollNo() {
        return rollNo;
    }
}
