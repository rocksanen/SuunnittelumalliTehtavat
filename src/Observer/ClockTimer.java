package Observer;

public class ClockTimer extends Subject{
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    void tick() {

        if(second < 59) {
            second += 1;
        }else if(minute < 59) {
            minute += 1;
            second = 0;
        }else if(hour < 23) {
            hour += 1;
            minute = 0;
            second = 0;
        }else{
            hour = 0;
            minute = 0;
            second = 0;
        }

        ilmoita();
    }
}
