package CreationalDesignPatterns.AbstractFactory;

class SamsungFactory implements ElectronicFactory {
    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new DellLaptop();
    }
}
