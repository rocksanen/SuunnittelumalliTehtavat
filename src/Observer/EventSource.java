package Observer;

import java.util.Observable;

public class EventSource extends Observable implements Runnable {
    @Override
    public void run() {

        ClockTimer timer = new ClockTimer();
        DigitalClock digitalClock = new DigitalClock(timer);

        boolean stillAlive = true;

        while (stillAlive) {

            try {
                Thread.sleep(1000);
                setChanged();
                notifyObservers(digitalClock);
                timer.tick();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void addObserver(Observer observer) {}
}
