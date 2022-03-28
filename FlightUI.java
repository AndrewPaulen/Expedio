import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
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
        System.out.println("Please enter your desired departure airport: \n");
        departureDest = input.nextLine();
        Location departing = LocationsLoader.getLocation(departureDest);
        System.out.println("Please enter your desired arrival airport: \n");
        arrivalDest = input.nextLine();
        Location destination = LocationsLoader.getLocation(arrivalDest);
        System.out.println("Please enter departure date (e.g., MM/DD/YY): \n");
        String date = input.nextLine();
        int numFriends = friendCheck();
        availableFlights(departing, destination, date);
        // chooseFlight(departing, destination, numFriends, availableFlights);
        Plane plane = new Plane();
        String [] seatNumbers = plane.seating(numFriends);
        System.out.println("Sucessfully booked tickets! Returning to Main Menu...");
        MainMenuLoginUI ui = new MainMenuLoginUI();
        input.close();
        ui.MainMenuUI();
    }

    public ArrayList<Flight> availableFlights(Location aDeparting, Location aDestination, String date) {
        ArrayList<Flight> availableFlights = new ArrayList<Flight>();

        System.out.println("Fetching available flights...\n" +
                "\n*** Available flights ***\n");

        for (int i = 0; i < 4; i++) {
            airlinesLoader loader = new airlinesLoader();
            Random rand = new Random();
            int randomNumber = rand.nextInt(1080 - 1 + 1) + 1;
            System.out.println("Flight "+i);
            System.out.println(aDeparting.toString() + " to " + aDestination.toString());
            hasConnecting(randomNumber);
            System.out.println("Flight Duration: " + randomNumber + " minutes.");
            System.out.println("Airline: " + loader.getAirline() + "\n\n");
            System.out.println("Date: ");
        }
        return availableFlights;
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

    public void hasConnecting(int num) {
        Random rand = new Random();
        LocationsLoader loader = new LocationsLoader();
        int randumNumber = rand.nextInt(2 - 1 + 1) + 1;
        if (num > 540) {
            System.out
                    .print("with " + randumNumber + " connecting flight(s) from " + loader.locationByIndex(num) + "\n");
        }
    }

    public void chooseFlight(ArrayList<Flight> availableFlights){
        System.out.println("Please select your perferred flight (Enter a number): \n");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String selectedFlight = availableFlights.get(input).toString();
        System.out.println("You've chosen: "+selectedFlight);
    }   

    public void finalize(){
        System.out.println("");
    }
}
