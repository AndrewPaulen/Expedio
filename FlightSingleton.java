
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

    public boolean addFlight(){ //add params
        if(hasFlight(flightName)){
            return false;
        }

        flightList.add(new Flight(flightName, , ,));
        return true;
    }

    public void saveFlights() {
        FlightWriter.saveFlights();
    }
}
