import java.util.Scanner;

/**
 * @author Sophia Riley
 */
public class FlightUI {
    private String departureDest;
    private String arrivalDest;

    public void bookFlight() {
        System.out.println("\n*** Book Flight ***");
        depatureArrival();
    }

    public void depatureArrival() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your desired departure airport: ");
        departureDest = input.nextLine();
        Location departing = LocationsLoader.getLocation(departureDest);
        ChicagoDest(departureDest);
        System.out.println("Please enter your desired arrival airport: ");
        arrivalDest = input.nextLine();
        Location destination = LocationsLoader.getLocation(arrivalDest);
        ChicagoArr(departureDest);
        availableFlights(departing, destination);
        input.close();
    }

    public void availableFlights(Location aDeparting, Location aDestination) {
        System.out.println("Fetching available flights...\n" +
                "\n*** Available flights ***");
        System.out.println(aDeparting.toString() + " to " + aDestination.toString());
        System.exit(0);
    }

    public void ChicagoDest(String departureDest) {
        Scanner scanner = new Scanner(System.in);
        if (departureDest.equalsIgnoreCase("Chicago")) {
            System.out.println("Sorry, we hate Chicago! Please enter another destination.");
            departureDest = scanner.nextLine();
        }
    }

    public void ChicagoArr(String departureDest) {
        Scanner scanner = new Scanner(System.in);
        if (arrivalDest.equalsIgnoreCase("Chicago")) {
            System.out.println("Sorry, we hate Chicago! Please enter another destination.");
            departureDest = scanner.nextLine();
        }
    }
}
