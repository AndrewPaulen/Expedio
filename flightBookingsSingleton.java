import java.util.ArrayList;
import java.util.UUID;
/**
 * a class that produces a single instance of a flightBooking
 * @author David Wamai 
 */
public class flightBookingsSingleton {
    
    private static flightBookingsSingleton flightBookings;
    private ArrayList<Flight> flightBookingsList;
    /**
     * a constructor for the flightBookingsSingleton class
     */
    private flightBookingsSingleton() {
        flightBookingsList = flightBookingsLoader.getFlightBookings();
    }
    /**
     * a method that produces a single instance of a flightBooking
     * only if one doesnt exist already. If an instance of a flightBooking
     * already exists, then it returns the same instance
     * @return an instance of flightBooking
     */
    public static flightBookingsSingleton getInstance() {
        if(flightBookings == null){
            flightBookings = new flightBookingsSingleton();
        }
        return flightBookings;
    }
    /**
     * checks for existing flight bookings 
     * @param flightID the identification number of a flight
     * @return a true express for an existing flight booking or a flase expression 
     */
    public boolean hasFlightBookings(String flightID){
        for(Flight flightBooking: flightBookingsList){
            if(flightBooking.getFlightID().equals(flightID)){
                return true;
            }
        }
        return false;
    }
    /**
     * functionally the same as hasFlightBookings, but returns the flightBooking rather
     * than a true or fasle expression 
     * @param flightID the identification number of a flight
     * @return an existing flight booking
     */
    public Flight getFlightBooking(String flightID){
        for(Flight flight: flightBookingsList){
            if(flight.getFlightID().equals(flightID)){
                return flight;
            }
        }
        return null;
    }
    /**
     * a method that returns all existing flightBookings. 
     * @return an ArrayList of flightBookings. 
     */
    public ArrayList<Flight> getFlightBookings(){
        return flightBookingsList;
    }
    /**
     * a method that will add a new flightBooking to an already existing list of flight bookings. 
     * @param flightID the identification number of a flight. 
     * @param airline the airline of the plane 
     * @param availability checks for seat vacancy 
     * @param departingLocation the location from which the plane leaves. 
     * @param departureDate the date from which the flight leaves. 
     * @param departureTime the time of which the flight leaves.
     * @param arrivalLocation the location at which the flight arrives. 
     * @param arrivalDate the date of which the flight arrives. 
     * @param arrivalTime the time at which the flight arrives. 
     * @return a true boolean expression of the flight was successfully added to the list. 
     */
   
    /**
     * will save the list of flight bookings 
     */
    public void saveFlightBookings(ArrayList<Flight> bookings){
        flightBookingsWriter.saveFlightBookings(bookings);
    }

    public boolean haveBooking(String flightID) {
		for(Flight flight : flightBookingsList) {
			if(flight.getFlightID().equals(flightID)) {
				return true;
			}
		}
		
		return false;
	}

    public boolean addBooking(String flightID, String airline, String available, String departureLocation, String departureDate, String departureTime, String arrivalLocation, String arrivalDate, String arrivalTime, boolean hasTransfer, int numTransfers, String transferDuration, String seatNumber){
        if(haveBooking(flightID)) return true;

        flightBookingsList.add(new Flight(flightID, airline, available, departureLocation, departureDate, departureTime, arrivalLocation, arrivalDate, arrivalTime, hasTransfer, numTransfers, transferDuration, seatNumber));
        saveFlightBookings(flightBookingsList);
        return true;
    }
}
