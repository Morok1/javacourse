package singleton;

public class Singleton {
    private Singleton() {
    }

    private static Singleton INSTANCE;

    public static Singleton getSingleton() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public void printText() {
        System.out.println("Hello im singleton!");
    }
}
