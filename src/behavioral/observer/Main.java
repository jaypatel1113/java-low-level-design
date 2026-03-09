package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer emailAlert = event -> System.out.println("Email: " + event);
        Observer smsAlert   = event -> System.out.println("SMS:   " + event);

        subject.subscribe(emailAlert);
        subject.subscribe(smsAlert);

        subject.notifyObservers("Order placed");
        subject.unsubscribe(smsAlert);
        subject.notifyObservers("Order shipped");
    }
}
