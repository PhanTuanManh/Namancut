package CreationalDesignPatterns.AbstractFactory;

public class ElectronicClient {
    public static void main(String[] args) {
        ElectronicFactory samsungFactory = new SamsungFactory();
        Phone samsungPhone = samsungFactory.createPhone();
        Laptop dellLaptop = samsungFactory.createLaptop();

        samsungPhone.makeCall();
        dellLaptop.performTask();

        ElectronicFactory appleFactory = new AppleFactory();
        Phone iPhone = appleFactory.createPhone();
        Laptop hpLaptop = appleFactory.createLaptop();

        iPhone.makeCall();
        hpLaptop.performTask();
    }
}
