
import java.util.ArrayList;
import java.util.UUID;

/**
 * a class that produces only a single instance of a Flight. 
 * @author David Wamai 
 */
public class FlightSingleton {
    private static FlightSingleton flights;
    private ArrayList<Flight> flightList;    
    /**
     * a constructor method that defines the singleton 
     */
    private FlightSingleton() {
        flightList = FlightLoader.getFlights();
    }
    /**
     * 
     * @returns an instance of the flight singleton class such that only one instance exists in runtime 
     */
    public static FlightSingleton getInstance() {
        if(flights == null){
            flights = new FlightSingleton();
        }
        return flights;
    }
    /**
     * checks for an already existing instance of a flight
     * @param flightID the identification number of the flight 
     * @return a true boolean value if the flight exists. 
     */
    public boolean hasFlight(String flightID){ //fix
        for (Flight flight: flightList){
            if(flight.getFlightID().equals(flightID)){
                return true;
            }
        }
        return false;
    }
    /**
     * functionally the same as hasFlight(), but returns the type Flight rather than 
     * a boolean expression 
     * @param flightID the identification number of a flight
     * @return a flight of type Flight. 
     */
    public Flight getFlight(String flightID){
        for(Flight flight: flightList){
            if(flight.getFlightID().equals(flightID)){
                return flight;
            }
        }
        return null;
    }
    /**
     * @return an array list of flghts. Most efficiently used when called with the constructor. 
     */
    public ArrayList<Flight> getFlights(){
        return flightList;
    }
    /**
     * a method that adds a Flight to an array List and returns true if the function exected successfully. 
     * @param flightID the identification number of the flight. 
     * @param airline the iarline of the de[arting flight.
     * @param availability checks for seat vacancy 
     * @param departingLocation the location from which the flight departs
     * @param departureDate the date from which the flight departs. 
     * @param departureTime the time at which the flight departs. 
     * @param arrivalLocation the location at which the flight arrives 
     * @param arrivalDate the date at which the flight arrives 
     * @param arrivalTime the time at which the flight arrives 
     * @return a true boolean expression if the function executes successfully. 
     */
    public boolean addFlight(String flightID, String airline, String availability, String departingLocation, String departureDate, String departureTime, String arrivalLocation, String arrivalDate, String arrivalTime, String transferDuration, int numTransfers, boolean hasTransfer){ 
        if(hasFlight(flightID)){
            return false;
        }

        flightList.add(new Flight(flightID, airline, availability, departingLocation, departureDate, departureTime, arrivalLocation, arrivalDate, arrivalTime, hasTransfer, numTransfers, transferDuration));
        return true;
    }
    /**
     * a method that utilizes the flight writer to save the list of flights to a json file. 
     */
    public void saveFlights() {
        FlightWriter.saveFlights();
    }
}
