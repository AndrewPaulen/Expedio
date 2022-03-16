
import java.util.ArrayList;
import java.util.UUID;

public class FlightSingleton {
    private static FlightSingleton flights;
    private ArrayList<Flight> flightList;    

    private FlightSingleton() {
        flightList = FlightLoader.getFlights();
    }

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

    public boolean addFlight(String flightID, String airline, boolean available, String departureLocation, String departureTime, String arrivalLocation, String arrivalTime, int duration){ //add params
        if(hasFlight(flightID)){
            return false;
        }

        flightList.add(new Flight(flightID, airline, available, departureLocation, departureTime, arrivalLocation, arrivalTime));
        return true;
    }

    public void saveFlights() {
        FlightWriter.saveFlights();
    }
}
