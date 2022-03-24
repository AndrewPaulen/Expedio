import java.util.Scanner;

public class FlightUI {
    private String departureDest;
    private String arrivalDest;
    private Flight flight;

    public void bookFlight() {
        System.out.println("*** Book Flight ***\n\n");
        depatureArrival();
    }

    public void depatureArrival() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your desired departure airport: ");
        departureDest = input.nextLine();
        System.out.println("Please enter your desired arrival airport: ");
        arrivalDest = input.nextLine();
        availableFlights();
        input.close(); // shash is a la croix boi. he smells bad.
    }

    public void availableFlights() {
        System.out.println("Fetching available flights...\n\n" +
                "Available flights:\n");
        flight.toString();
    }
}
