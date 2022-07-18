
public class Time implements Comparable<Time> {
    private final int hours;
    private final int minutes;

    public Time(int hours, int minutes) {
        checkTime(hours, minutes);
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes;
    }

    @Override
    public int compareTo(Time o) {
        int hoursDifference = this.hours - o.hours;
        if (hoursDifference == 0) {
            return this.minutes - o.minutes;
        }
        return hoursDifference;
    }

    private void checkTime(int hours, int minutes) {
        if (hours > 23 || hours < 0 || minutes > 59 || minutes < 0) {
            throw new IllegalArgumentException("Incorrect time!");
        }
    }
}
