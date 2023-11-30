package CreationalDesignPatterns.AbstractFactory;

class DellLaptop implements Laptop {
    @Override
    public void performTask() {
        System.out.println("Performing a task on Dell Laptop");
    }
}