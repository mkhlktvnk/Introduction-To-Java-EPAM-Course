import java.util.ArrayList;
import java.util.List;

public class Airline {
    private String destination;
    private long flightNumber;
    private AircraftType aircraftType;
    private Time departureTime;
    private List<DayOfWeek> dayOfWeeks;

    public Airline(String destination, long flightNumber, AircraftType aircraftType, Time departureTime, List<DayOfWeek> dayOfWeeks) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.dayOfWeeks = new ArrayList<>(dayOfWeeks);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public long getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(long flightNumber) {
        this.flightNumber = flightNumber;
    }

    public AircraftType getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(AircraftType aircraftType) {
        this.aircraftType = aircraftType;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public List<DayOfWeek> getDayOfWeeks() {
        return new ArrayList<>(dayOfWeeks);
    }

    public void setDayOfWeeks(List<DayOfWeek> dayOfWeeks) {
        this.dayOfWeeks = new ArrayList<>(dayOfWeeks);
    }
}