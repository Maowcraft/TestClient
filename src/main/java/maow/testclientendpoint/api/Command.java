package maow.testclientendpoint.api;

public interface Command {
    String getName();
    void run(String[] args);
}
