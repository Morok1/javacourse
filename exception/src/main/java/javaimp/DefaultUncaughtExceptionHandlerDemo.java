package javaimp;

public class DefaultUncaughtExceptionHandlerDemo {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        } catch (RuntimeException e) {
            System.out.println("Message with cause" + e.getMessage());
        }
    }
}
