package CreationalDesignPatterns.FactoryPattern;

class Undergraduate implements Student {
    private String name;
    private int studentID;

    Undergraduate(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    @Override
    public String getDetails() {
        return "Undergraduate Student: " + name + ", Student ID: " + studentID;
    }
}
