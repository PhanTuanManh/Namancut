package CreationalDesignPatterns.Singleton;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.showMessage();

        Singleton singleton2 = Singleton.getInstance();


        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same.");
        }
    }
}
