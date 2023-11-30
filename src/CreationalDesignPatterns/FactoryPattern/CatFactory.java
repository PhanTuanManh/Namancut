package CreationalDesignPatterns.FactoryPattern;

class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
