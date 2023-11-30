package CreationalDesignPatterns.FactoryPattern;

class DogFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
