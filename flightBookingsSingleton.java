import java.util.ArrayList;
import java.util.UUID;

public class flightBookingsSingleton {
    
    private static flightBookingsSingleton flightBookings;
    private ArrayList<Flight> flightBookingsList;

    private flightBookingsSingleton() {
        flightBookingsList = flightBookingsLoader.getFlights();
    }

    public static flightBookingsSingleton getInstance() {
        if(flightBookings == null){
            flightBookings = new flightBookingsSingleton();
        }
        return flightBookings;
    }

    public boolean hasFlightBookings(String flightID){
        for(Flight flightBooking: flightBookingsList){
            if(flightBooking.getFlightID().equals(flightID)){
                return true;
            }
        }
        return false;
    }

    public Flight getFlightBooking(String flightID){
        for(Flight flight: flightBookingsList){
            if(flight.getFlightID().equals(flightID)){
                return flight;
            }
        }
        return null;
    }

    public ArrayList<Flight> getFlightBookings(){
        return flightBookingsList;
    }

    public boolean addFlightBooking(String flightID, String airline, String availability, String departingLocation, String departureDate, String departureTime, String arrivalLocation, String arrivalDate, String arrivalTime){
        if(hasFlightBookings(flightID)){
            return false;
        }

        flightBookingsList.add(new Flight(flightID, airline, availability, departingLocation, departureDate, departureTime, arrivalLocation, arrivalDate, arrivalTime));
        return true;
    }
    
    public void saveFlightBookings(){
        flightBookingsWriter.saveFlightBookings();
    }
}
