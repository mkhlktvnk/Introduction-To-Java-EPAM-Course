import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void sortTrainsByNumber(List<Train> trains) {
        trains.sort(Comparator.comparingLong(Train::getNumber));
    }

    public static void sortTrainsByDestination(List<Train> trains) {
        trains.sort(Comparator.comparing(Train::getDestination).thenComparing(Train::getDepartureTime));
    }

    public static void main(String[] args) {
        List<Train> trains = new ArrayList<>();
        trains.add(new Train("Bobruisk", 321, new Time(18, 30)));
        trains.add(new Train("Gomel", 223, new Time(18, 30)));
        trains.add(new Train("Minsk", 111, new Time(18, 30)));
        trains.add(new Train("Gomel", 223, new Time(18, 40)));
        sortTrainsByDestination(trains);
        System.out.println(trains);
        sortTrainsByNumber(trains);
        System.out.println(trains);

        int number;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Index = ");
            while (!scanner.hasNextInt()) {
                System.out.println("Incorrect input! Try Again!");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0 || number > trains.size());
        System.out.println(trains.get(number));
    }
}
