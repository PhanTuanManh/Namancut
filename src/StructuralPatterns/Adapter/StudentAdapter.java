package StructuralPatterns.Adapter;

class StudentAdapter implements Student {
    private LegacyStudent legacyStudent;

    StudentAdapter(LegacyStudent legacyStudent) {
        this.legacyStudent = legacyStudent;
    }

    @Override
    public String getName() {
        return legacyStudent.getFullName();
    }

    @Override
    public int getStudentID() {
        return legacyStudent.getRollNo();
    }
}