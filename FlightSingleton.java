
import java.util.ArrayList;
import java.util.UUID;


public class FlightSingleton {
    private static FlightSingleton flights;
    private ArrayList<Flight> flightList;    
    
    private FlightSingleton() {
        flightList = FlightLoader.getFlights();
    }
    /**
     * @returns an instance of the flight singleton class such that only one instance exists in runtime 
     * 
     */
    public static FlightSingleton getInstance() {
        if(flights == null){
            flights = new FlightSingleton();
        }
        return flights;
    }

    public boolean hasFlight(String flightID){ //fix
        for (Flight flight: flightList){
            if(flight.getFlightID().equals(flightID)){
                return true;
            }
        }
        return false;
    }

    public Flight getFlight(String flightID){
        for(Flight flight: flightList){
            if(flight.getFlightID().equals(flightID)){
                return flight;
            }
        }
        return null;
    }

    public ArrayList<Flight> getFlights(){
        return flightList;
    }

    public boolean addFlight(String flightID, String airline, String availability, String departingLocation, String departureDate, String departureTime, String arrivalLocation, String arrivalDate, String arrivalTime){ 
        if(hasFlight(flightID)){
            return false;
        }

        flightList.add(new Flight(flightID, airline, availability, departingLocation, departureDate, departureTime, arrivalLocation, arrivalDate, arrivalTime));
        return true;
    }

    public void saveFlights() {
        FlightWriter.saveFlights();
    }
}
