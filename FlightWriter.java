import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 * a class that adds json-in functionality to flights.json
 * @author David Wamai 
 */
public class FlightWriter extends FlightCosntants{
    /**
     * a constructor for the FlightWriter
     */
    public FlightWriter(){
        
    }
    /**
     * a method that loops through an array list of flights and parses
     * each one as a json element. the element is the written to the appropriate json file. 
     */
    public static void saveFlights(){
        FlightSingleton flights = FlightSingleton.getInstance();
        ArrayList<Flight> flightList = flights.getFlights();
        JSONArray jsonFlights = new JSONArray();

        for(int i = 0; i < flightList.size(); i++){
            jsonFlights.add(getFlightJSON(flightList.get(i)));
        }

        try (FileWriter file = new FileWriter(FLIGHTS_FILE_NAME)){
            file.write(jsonFlights.toJSONString());
            file.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    /**
     * can be used elsewhere, but this method allows for
     * a more straightforward approach to saveFlights(). Will convert the constructing parameters
     * of a flight into json-compatible elements. 
     * @param flight any chosen flight of type Flight 
     * @return a JSONObject of the specified flight. 
     */
    public static JSONObject getFlightJSON(Flight flight){
        JSONObject flightDetails = new JSONObject();
        flightDetails.put(FLIGHT_ID, flight.getFlightID().toString());
        flightDetails.put(AIRLINE, flight.getAirline().toString());
        flightDetails.put(AVAILABILITY, flight.getAvailable().toString());
        flightDetails.put(DEPARTURE_LOC, flight.getDepartureLocation().toString());
        flightDetails.put(DEPARTURE_DATE, flight.getDepartureDate().toString());
        flightDetails.put(DEPARTURE_TIME, flight.getDepartureTime().toString());
        flightDetails.put(ARRIVAL_LOC, flight.getArrivalLocation().toString());
        flightDetails.put(ARRIVAL_DATE, flight.getArrivalDate().toString());
        flightDetails.put(ARRIVAL_TIME, flight.getArrivalTime().toString());

       return flightDetails;
    }
}
