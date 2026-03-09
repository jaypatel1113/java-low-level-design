package creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.showMessage();
        s2.showMessage();

        System.out.println("Same instance? " + (s1 == s2)); // true
    }
}
