package prototype;

import java.util.Date;

public class Clock implements Cloneable{

    private Date time;

    public Clock(Date time) {
        this.time = time;
    }

    public Date getTime() {
        return time;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Clock cloned = (Clock) super.clone();
        cloned.time = (Date) this.time.clone();
        return cloned;
    }
}
