package CreationalDesignPatterns.FactoryPattern;

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}