package CreationalDesignPatterns.AbstractFactory;

class UndergraduateFactory implements StudentFactory {
    @Override
    public Student createStudent(String name, int studentID) {
        return new Undergraduate(name, studentID);
    }
}