package creational.prototype.solution.contract;

public interface EmailTemplate extends Cloneable {
    // for cloning its imp
    EmailTemplate clone();

    void setContent(String content);
    void send(String to);
}
