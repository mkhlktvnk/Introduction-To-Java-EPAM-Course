import java.util.Objects;

public class Time implements Comparable<Time> {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(Time time) {
        this.hours = time.hours;
        this.minutes = time.minutes;
        this.seconds = time.seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        if (!isHoursValid(hours)) {
            this.hours = 0;
        } else {
            this.hours = hours;
        }
    }

    public void setMinutes(int minutes) {
        if (!isMinutesValid(minutes)) {
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }
    }

    public void setSeconds(int seconds) {
        if (!isSecondsValid(seconds)) {
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }

    public void increaseHours(int hours) {
        if (!isHoursValid(this.hours + hours)) {
            this.hours = 0;
        } else {
            this.hours += hours;
        }
    }

    public void increaseMinutes(int minutes) {
        if (!isMinutesValid(this.minutes + minutes)) {
            this.minutes = 0;
        } else {
            this.minutes += minutes;
        }
    }

    public void increaseSeconds(int seconds) {
        if (!isSecondsValid(this.seconds + seconds)) {
            this.seconds = 0;
        } else {
            this.seconds += seconds;
        }
    }

    public void decreaseHours(int hours) {
        if (!isHoursValid(this.hours - hours)) {
            this.hours = 0;
        } else {
            this.hours -= hours;
        }
    }

    public void decreaseMinutes(int minutes) {
        if (!isMinutesValid(this.minutes - minutes)) {
            this.minutes = 0;
        } else {
            this.minutes -= minutes;
        }
    }

    public void decreaseSeconds(int seconds) {
        if (!isSecondsValid(this.seconds - seconds)) {
            this.seconds = 0;
        } else {
            this.seconds -= seconds;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hours == time.hours && minutes == time.minutes && seconds == time.seconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, minutes, seconds);
    }

    @Override
    public String toString() {
        return String.format("%2d:%2d:%2d", hours, minutes, seconds);
    }

    private boolean isHoursValid(int hours) {
        return hours < 24 && hours >= 0;
    }

    private boolean isMinutesValid(int minutes) {
        return minutes < 60 && minutes >= 0;
    }

    private boolean isSecondsValid(int seconds) {
        return seconds < 60 && seconds >= 0;
    }

    @Override
    public int compareTo(Time o) {
        int hoursDiff = this.hours - o.hours;
        if (hoursDiff == 0) {
            int minutesDiff = this.minutes - o.minutes;
            if (minutesDiff == 0) {
                return this.seconds - o.seconds;
            }
            return minutesDiff;
        }
        return hoursDiff;
    }
}
