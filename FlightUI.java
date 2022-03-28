import java.lang.reflect.Array;
import java.util.Arrays;
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
        friendCheck();
        availableFlights(departing, destination);
        Plane plane = new Plane();
        plane.seating();
        input.close();

    }

    public void availableFlights(Location aDeparting, Location aDestination) {
        System.out.println("Fetching available flights...\n" +
                "\n*** Available flights ***\n");
        
        
        for(int i = 0; i < 4; i++){
            airlinesLoader loader = new airlinesLoader();
            Random rand = new Random();
            int randomNumber = rand.nextInt(1080 - 1 + 1) + 1;
            System.out.println(aDeparting.toString() + " to " + aDestination.toString());
            hasConnecting(randomNumber);
            System.out.println("Flight Duration: "+randomNumber+" minutes.");
            System.out.println("Airline: "+loader.getAirline()+"\n\n");
        }
        
        
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
                System.out.println("Please enter the first and last name of passenger "+(i+1));
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

    public void hasConnecting(int num){
        Random rand = new Random();
        LocationsLoader loader = new LocationsLoader();
        int randumNumber = rand.nextInt(2 - 1 + 1)+1;
        if(num > 540){
            System.out.print("with "+randumNumber+" connecting flight(s) from "+loader.locationByIndex(num)+"\n");
        }
    }

}
