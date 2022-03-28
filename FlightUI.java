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
        ChicagoDest(departureDest);
        System.out.println("Please enter your desired arrival airport: \n");
        arrivalDest = input.nextLine();
        Location destination = LocationsLoader.getLocation(arrivalDest);
        ChicagoArr(departureDest);
        friendCheck();
        availableFlights(departing, destination);
        input.close();
    }

    public void availableFlights(Location aDeparting, Location aDestination) {
        System.out.println("Fetching available flights...\n" +
                "\n*** Available flights ***\n");
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

    public void friendCheck(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many tickets would you like to purchase?");
        int input = scanner.nextInt();
        
        if(input != 1){
            String[] friends = new String[input];
            for(int i = 0; i < input; i++){
                String friend;
                System.out.println("Please enter the first name of passenger "+(i+1));
                if(i == 0){
                    scanner.nextLine();
                    friend = scanner.nextLine();
                    friends[i] = friend;
                    continue;  
                } else {
                    friend = scanner.nextLine();
                
                    friends[i] = friend;
                }
                
            }
            System.out.println(input+" tickets for "+"\n");
            for(String name: friends){
                System.out.println(name);
            }
            System.out.println();
        } else if(input == 0){
            System.out.println("Please enter a number other than zero");
        }
        scanner.close();
    }
}
