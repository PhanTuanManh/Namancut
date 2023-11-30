package CreationalDesignPatterns.FactoryPattern;

class PostgraduateFactory implements StudentFactory {
    @Override
    public Student createStudent(String name, int studentID) {
        return new Postgraduate(name, studentID);
    }
}