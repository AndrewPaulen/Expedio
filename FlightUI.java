import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

/**
 * The UI for booking a flight
 * 
 * @author Sophia Riley
 */
public class FlightUI {
    private String departureDest;
    private String arrivalDest;

    /**
     * The first string to be printed to the terminal.
     */
    public void bookFlight() {
        System.out.println("\n*** Book Flight ***");
        depatureArrival();
    }

    /**
     * Prompts the user to enter a departure airport, an arrival airport, and the
     * date they want to fly
     */
    public void depatureArrival() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your desired departure airport: \n");
        departureDest = input.nextLine();
        Location departing = LocationsLoader.getLocation(departureDest);
        System.out.println("Please enter your desired arrival airport: \n");
        arrivalDest = input.nextLine();
        Location destination = LocationsLoader.getLocation(arrivalDest);
        System.out.println("Please enter departure date (e.g., MM/DD/YY): \n");
        String date = input.nextLine();
        int numFriends = friendCheck();
        ArrayList<Flight> availableFlights = availableFlights(departing, destination, date);
        Flight chosenFlight = chooseFlight(availableFlights);
        Plane plane = new Plane();
        String[] seatNumbers = plane.seating(numFriends);
        finalize(seatNumbers, chosenFlight);

        System.out.println("Sucessfully booked tickets! Returning to Main Menu..."); // getting rid of this soon
        MainMenuLoginUI ui = new MainMenuLoginUI();
        input.close();
        ui.MainMenuUI();
    }

    /**
     * Displays available flights to the user
     * 
     * @param aDeparting   The location of the departure airport
     * @param aDestination The location of the arrival airport
     * @param date         The date of the flight
     * @return availableFlights The flights that are available to book
     */
    public ArrayList<Flight> availableFlights(Location aDeparting, Location aDestination, String date) {
        ArrayList<Flight> availableFlights = new ArrayList<Flight>();

        System.out.println("Fetching available flights...\n" +
                "\n*** Available flights ***\n");

        for (int i = 0; i < 4; i++) {
            airlinesLoader loader = new airlinesLoader();
            Random rand = new Random();
            int randomNumber = rand.nextInt(1080 - 1 + 1) + 1;
            System.out.println("Flight " + (i + 1));
            System.out.println(aDeparting.toString() + " to " + aDestination.toString());
            hasConnecting(randomNumber);
            System.out.println("Flight Duration: " + randomNumber + " minutes.");
            String airline = loader.getAirline();
            System.out.println("Airline: " + airline);
            System.out.println("Date: " + date + "\n");
            availableFlights.add(new Flight(aDeparting, aDestination, date, airline, randomNumber, null));
        }
        return availableFlights;
    }

    /**
     * We hate Chicago
     * 
     * @param departureDest The destination of the departure airport
     */
    public void ChicagoDest(String departureDest) {
        Scanner scanner = new Scanner(System.in);
        if (departureDest.equalsIgnoreCase("Chicago")) {
            System.out.println("Sorry, we hate Chicago! Please enter another destination.");
            departureDest = scanner.nextLine();
        }

    }

    /**
     * We hate Chicago
     * 
     * @param arrivalDest The destination of the arrival airport
     */
    public void ChicagoArr(String arrivalDest) {
        Scanner scanner = new Scanner(System.in);
        if (arrivalDest.equalsIgnoreCase("Chicago")) {
            System.out.println("Sorry, we hate Chicago! Please enter another destination.");
            departureDest = scanner.nextLine();
        }
    }

    /**
     * Checks to see if there's more than one person trying to book a flight
     * 
     * @return input How many tickets being booked
     */
    public int friendCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many tickets would you like to purchase?");
        int input = scanner.nextInt();

        if (input != 1) {
            String[] friends = new String[input];
            for (int i = 0; i < input; i++) {
                String friend;
                System.out.println("Please enter the first and last name of passenger " + (i + 1));
                if (i == 0) {
                    scanner.nextLine();
                    friend = scanner.nextLine();
                    friends[i] = friend;
                    continue;
                } else {
                    friend = scanner.nextLine();

                    friends[i] = friend;
                }

            }
            System.out.println(input + " tickets for " + "\n");
            for (String name : friends) {
                System.out.println(name);
            }
            System.out.println();
        } else if (input == 0) {
            System.out.println("Please enter a number other than zero");
        }
        return input;
    }

    /**
     * Displays how many connecting flights a flight has
     * 
     * @param num The number of connecting flights
     */
    public void hasConnecting(int num) {
        Random rand = new Random();
        LocationsLoader loader = new LocationsLoader();
        int randumNumber = rand.nextInt(2 - 1 + 1) + 1;
        if (num > 540) {
            System.out
                    .print("with " + randumNumber + " connecting flight(s) from " + loader.locationByIndex(num) + "\n");
        }
    }

    /**
     * Promts the user to chose a flight
     * 
     * @param availableFlights The flights available to be booked
     * @return selectedFlight The flight the user is booking
     */
    public Flight chooseFlight(ArrayList<Flight> availableFlights) {
        System.out.println("Please select your perferred flight (Enter a number): \n");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        Flight selectedFlight = availableFlights.get(input - 1);
        System.out.println("You've chosen: " + selectedFlight.toString());

        return selectedFlight;
    }

    /**
     * Verifys the user's booking
     * 
     * @param seatNumbers    Stores the individual seat numbers booked by the user
     * @param selectedFlight The flight the user is booking
     */
    public void finalize(String[] seatNumbers, Flight selectedFlight) {

        System.out.println("\n***VERIFICATION***\n");
        System.out.println("Flight Summary: \n" + selectedFlight + " Your seats are: ");
        for (String seat : seatNumbers) {
            System.out.println(seat);
        }
        String airline = selectedFlight.getAirline();
        String date = selectedFlight.getDepartureDate();
        int duration = selectedFlight.getDuration();
        String departure = selectedFlight.getDepartureLocation().toString();
        String arrival = selectedFlight.getArrivalLocation().toString();
        UUID ID;
        String flightID = UUID.randomUUID().toString();
        String available = "true";
        Calendar time;
        String departureTime = "9:00";
        String arrivalTime = "21:00";
        boolean hasTransfer = true;
        int numTransfers = selectedFlight.numTransfers;
        String transferDuration = "60 minutes";

        flightBookingsSingleton.getInstance().addBooking(flightID, airline, available, departure, date, departureTime,
                arrival, date, arrivalTime, hasTransfer, numTransfers, transferDuration);

    }

}
