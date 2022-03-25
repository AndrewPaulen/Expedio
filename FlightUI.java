import java.util.Scanner;

/**
 * @author Sophia Riley
 */
public class FlightUI {
    private String departureDest;
    private String arrivalDest;

    public void bookFlight() {
        System.out.println("*** Book Flight ***\n");
        depatureArrival();
    }

    public void depatureArrival() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your desired departure airport: ");
        departureDest = input.nextLine();
        Location departing = LocationsLoader.getLocation(departureDest);
        // Chicago();
        System.out.println("Please enter your desired arrival airport: ");
        arrivalDest = input.nextLine();
        Location destination = LocationsLoader.getLocation(arrivalDest);
        // Chicago();
        availableFlights(departing, destination);
        input.close();
    }

    public void availableFlights(Location aDeparting, Location aDestination) {
        System.out.println("\nFetching available flights...\n\n" +
                "Available flights:");
        System.out.println(aDeparting.toString() + " to " + aDestination.toString());
        // System.exit(0);
    }

    // public void Chicago() {
    // if (departureDest.equalsIgnoreCase("Chicago") ||
    // arrivalDest.equalsIgnoreCase("Chicago")) {
    // System.out.println("Sorry, we hate Chicago! Please enter another
    // destination.");
    // }
    // }
}
