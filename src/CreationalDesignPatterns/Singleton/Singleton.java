package CreationalDesignPatterns.Singleton;

public class Singleton {

    private static volatile Singleton instance;


    private Singleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static Singleton getInstance() {

        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, I am a CreationalDesignPatterns.Singleton!");
    }
}