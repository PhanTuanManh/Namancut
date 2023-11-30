package CreationalDesignPatterns.AbstractFactory;

class AppleFactory implements ElectronicFactory {
    @Override
    public Phone createPhone() {
        return new IPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new HPLaptop();
    }
}
