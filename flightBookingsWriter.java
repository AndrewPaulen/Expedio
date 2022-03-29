
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**a class that provides json-in functionality for flight bookings
 * @author David Wamai 
 */
public class flightBookingsWriter extends flightBookingsConstants{
    /**
     *  a constructor for the flight bookings writer. 
     */
    public flightBookingsWriter(){
        
    }
    /**
     * a method that saves all existing fligth bookings found in an array list to a json file. 
     * the method WILL NOT add anything to the specified json file name if the found arraylist is
     * not populated
     */
    public static void saveFlightBookings(ArrayList<Flight> newFlightList){
        FlightSingleton flightBookings = FlightSingleton.getInstance();
        JSONArray jsonFlights = new JSONArray();

        //creating all the json objects
        for(int i=0; i < newFlightList.size();i++){
            jsonFlights.add(getFlightJSON(newFlightList.get(i)));
        }

        //write JSON file
        try(FileWriter file = new FileWriter(FLIGHTBOOKINGS_FILE_NAME)){
            file.write(jsonFlights.toJSONString());
            file.flush();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    /**
     * a method the returns a JSONObject of a flight booking. This can be used elsewhere but is
     * mainly for the sake of saveFlightBookings() cleanliness. 
     * @param flight the particular flight in question 
     * @return a JSONObject of the flight specified. 
     */
    public static JSONObject getFlightJSON(Flight flight){
        JSONObject flightBookingsDetails = new JSONObject();
        flightBookingsDetails.put(DEPARTURE_TIME, flight.getDepartureTime().toString());
        flightBookingsDetails.put(DEPARTURE_DATE, flight.getDepartureDate());
        flightBookingsDetails.put(DEPARTURE_LOCATION, flight.getDepLocation());
        flightBookingsDetails.put(ARRIVAL_TIME, flight.getArrivalTime().toString());
        flightBookingsDetails.put(ARRIVAL_DATE, flight.getArrivalDate());
        flightBookingsDetails.put(ARRIVAL_LOCATION, flight.getArrLocation());
        String[] seats = flight.getSeatNumber();
        flightBookingsDetails.put(SEAT_NUMBER, flight.seatNumtoString(seats));
        flightBookingsDetails.put(AIRLINE, flight.getAirline().toString());
        flightBookingsDetails.put(AVAIL, flight.getAvailable().toString());
        flightBookingsDetails.put(FLIGHT_ID, flight.getFlightID().toString());
        flightBookingsDetails.put(DURATION, flight.getDuration());

        
  

        return flightBookingsDetails;
    }
}
