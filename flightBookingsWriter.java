
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class flightBookingsWriter extends flightBookingsConstants{
    
    public flightBookingsWriter(){
        
    }
    public static void saveFlightBookings(){
        FlightSingleton flightBookings = FlightSingleton.getInstance();
        ArrayList<Flight> flightBookingsList = flightBookings.getFlights();
        JSONArray jsonFlights = new JSONArray();

        //creating all the json objects
        for(int i=0; i < flightBookingsList.size();i++){
            jsonFlights.add(getFlightJSON(flightBookingsList.get(i)));
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

    public static JSONObject getFlightJSON(Flight flight){
        JSONObject flightBookingsDetails = new JSONObject();
        flightBookingsDetails.put(DEPARTURE_TIME, flight.getDepartureTime().toString());
        flightBookingsDetails.put(DEPARTURE_DATE, flight.getDepartureDate().toString());
        flightBookingsDetails.put(DEPARTURE_LOCATION, flight.getDepartureLocation().toString());
        flightBookingsDetails.put(ARRIVAL_TIME, flight.getArrivalTime().toString());
        flightBookingsDetails.put(ARRIVAL_DATE, flight.getArrivalDate().toString());
        flightBookingsDetails.put(ARRIVAL_LOCATION, flight.getArrivalLocation().toString());
        flightBookingsDetails.put(SEAT_NUMBER, flight.getSeatNumber().toString());
        
  

        return flightBookingsDetails;
    }
}
