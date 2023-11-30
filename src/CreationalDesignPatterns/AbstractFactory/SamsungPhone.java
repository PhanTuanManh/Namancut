package CreationalDesignPatterns.AbstractFactory;

class SamsungPhone implements Phone {
    @Override
    public void makeCall() {
        System.out.println("Making a call with Samsung Phone");
    }
}