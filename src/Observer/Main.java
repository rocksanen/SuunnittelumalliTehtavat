package Observer;

public class Main {

    public static void main(String[] args) {

        EventSource eventSource = new EventSource();
        eventSource.addObserver(theChangedSubject -> {});
        new Thread(eventSource).start();
    }
}
