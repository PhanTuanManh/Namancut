package CreationalDesignPatterns.AbstractFactory;

class HPLaptop implements Laptop {
    @Override
    public void performTask() {
        System.out.println("Performing a task on HP Laptop");
    }
}
