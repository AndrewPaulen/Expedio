import java.util.Scanner;

public class FlightUI {
    private String departureDest;
    private String arrivalDest;
    private Flight flight;

    public void DepatureArrival() {
        Scanner input = new Scanner(System.in);
        System.out.println("*** Book Flight***\n\n" +
                "Please enter your desired departure airport: ");
        departureDest = input.nextLine();
        System.out.println("Please enter your desired arrival airport: ");
        arrivalDest = input.nextLine();
        System.out.println("Fetching available flights...\n\n" +
                "Available flights:\n");
        flight.toString();
    }
}
