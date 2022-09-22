import java.util.ArrayList;
import java.util.List;

public class AirlineService {
    private final List<Airline> airlines = new ArrayList<>();

    public void addNewAirline(Airline airline) {
        airlines.add(airline);
    }

    public List<Airline> findAirlinesByDestination(String destination) {
        return airlines.stream().filter((airline -> airline.getDestination().equals(destination))).toList();
    }

    public List<Airline> findAirlinesByDayOfWeek(DayOfWeek dayOfWeek) {
        return airlines.stream().filter((airline -> airline.getDayOfWeeks().contains(dayOfWeek))).toList();
    }

    public List<Airline> findAirlinesByDayOfWeekAndTimeAfter(DayOfWeek dayOfWeek, Time time) {
        return findAirlinesByDayOfWeek(dayOfWeek).stream()
                .filter((airline -> airline.getDepartureTime().compareTo(time) > 0)).toList();
    }
}