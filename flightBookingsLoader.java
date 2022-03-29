import java.io.*;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class flightBookingsLoader extends flightBookingsConstants{

    public flightBookingsLoader(){
        
    }
        /**
         * @author David Wamai
         * A method that returns a list of flights by looping through JSON elements. 
         * Each iteration of the loop will copy the contents from each element and add them to an array list
         * @return an array list of flights yielded from flights.json
         */
        public static ArrayList<Flight> getFlightBookings(){
            
            ArrayList<Flight> flightBookings = new ArrayList<Flight>();

            try {
                FileReader reader = new FileReader(FLIGHTBOOKINGS_FILE_NAME);
                JSONParser parser = new JSONParser(); //investigate why this is never used but still included
                JSONArray flightBookingsJSON = (JSONArray)new JSONParser().parse(reader);

                for(int i = 0; i < flightBookingsJSON.size(); i++){
                    JSONObject flightBookingJSON = (JSONObject)flightBookingsJSON.get(i);
                    String departureTime = (String)flightBookingJSON.get(DEPARTURE_TIME);
                    String departureDate = (String)flightBookingJSON.get(DEPARTURE_DATE);
                    String departureLocation = (String)flightBookingJSON.get(DEPARTURE_LOCATION);
                    String arrivalTime = (String)flightBookingJSON.get(ARRIVAL_TIME);
                    String arrivalDate = (String)flightBookingJSON.get(ARRIVAL_DATE);
                    String arrivalLocation = (String)flightBookingJSON.get(ARRIVAL_LOCATION);
                    String seatNum = (String)flightBookingJSON.get(SEAT_NUMBER);
                    String lastName = (String)flightBookingJSON.get(LAST_NAME);
                    String firstName = (String)flightBookingJSON.get(FIRST_NAME);
                    String airline = (String)flightBookingJSON.get(AIRLINE);
                    String available = (String)flightBookingJSON.get(AVAIL);
                    String flightID = (String)flightBookingJSON.get(FLIGHT_ID);
                    boolean hasTransfer = (boolean)flightBookingJSON.get(HAS_TRANSFER);
                    String transferDuration = (String)flightBookingJSON.get(TRANSFER_DURATION);
                    

                   flightBookings.add(new Flight(flightID, airline, available, departureLocation, departureDate, departureTime, arrivalLocation, arrivalDate, arrivalTime, hasTransfer, 1, transferDuration));
                   
                }
                return flightBookings;
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            return null;


        }
}

