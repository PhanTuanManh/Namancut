package CreationalDesignPatterns.AbstractFactory;

class IPhone implements Phone {
    @Override
    public void makeCall() {
        System.out.println("Making a call with iPhone");
    }
}