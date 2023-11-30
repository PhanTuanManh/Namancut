package CreationalDesignPatterns.FactoryPattern;

class Postgraduate implements Student {
    private String name;
    private int studentID;

    Postgraduate(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    @Override
    public String getDetails() {
        return "Postgraduate Student: " + name + ", Student ID: " + studentID;
    }
}