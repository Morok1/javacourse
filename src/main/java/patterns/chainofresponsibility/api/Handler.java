package patterns.chainofresponsibility.api;

public interface Handler {
    boolean handleRequest(Handler handler);
}
