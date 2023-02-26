package observer;

public class DigitalClock implements Observer{

    private final ClockTimer timer;

    public DigitalClock(ClockTimer ct) {

        this.timer = ct;
        timer.attach(this);

    }
    @Override
    public void update(Subject theChangedSubject) {

        if(theChangedSubject == timer) {draw();}
    }

    private void draw() {

        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();

        String tunti = "";
        String minuutti = "";
        String sekunti = "";

        if(hour < 10) {tunti = "0";}
        if(minute < 10) {minuutti = "0";}
        if(second < 10) {sekunti = "0";}

        System.out.println("Kello on: " + tunti + hour + ":" + minuutti + minute + ":" + sekunti + second);
    }
}
