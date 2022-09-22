public class Time implements Comparable<Time> {
    private int hours;
    private int minutes;

    public Time(int hours, int minutes) throws InvalidTimeException {
        checkTime(hours, minutes);
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @Override
    public int compareTo(Time o) {
        return this.hours == o.hours ? this.minutes - o.minutes : this.hours - o.hours;
    }

    private void checkTime(int minutes, int hours) throws InvalidTimeException {
        if (minutes <= 0 || minutes >= 60 || hours < 0 || hours > 23) {
            throw new InvalidTimeException();
        }
    }
}
