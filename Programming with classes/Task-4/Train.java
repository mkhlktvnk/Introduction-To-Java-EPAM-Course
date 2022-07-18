
public class Train {
    private final long number;
    private final String destination;
    private final Time departureTime;

    public Train(String destination, long number, Time departureTime) {
        this.destination = destination;
        this.number = number;
        this.departureTime = departureTime;
    }

    public long getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return "Train{" +
                "number=" + number +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime +
                '}';
    }
}
