
public class Clock {

    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        hours = new BoundedCounter(23);
        minutes = new BoundedCounter(59);
        seconds = new BoundedCounter(59);
        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
    }

    public void tick() {
        this.seconds.next();
        if (this.seconds.getValue() == 0) {
            minutes.next();
            if (this.minutes.getValue() == 0) {
                hours.next();
            }
        }
    }

    public String toString() {
        return (this.hours.toString() + ":" + this.minutes.toString() + ":" + this.seconds.toString());
    }
}
