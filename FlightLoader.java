import java.io.*;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class FlightLoader extends FlightCosntants{

    public FlightLoader(){
        
    }
        /**
         * @author David Wamai
         * A method that returns a list of flights by looping through JSON elements. 
         * Each iteration of the loop will copy the contents from each element and add them to an array list
         * @return an array list of flights yielded from flights.json
         */
        public static ArrayList<Flight> getFlights(){
            
            ArrayList<Flight> flights = new ArrayList<Flight>();

            try {
                FileReader reader = new FileReader(FLIGHTS_FILE_NAME);
                JSONParser parser = new JSONParser();
                JSONArray flightsJSON = (JSONArray)new JSONParser().parse(reader);

                for(int i = 0; i < flightsJSON.size(); i++){
                    JSONObject flightJSON = (JSONObject)flightsJSON.get(i);
                    String flightID = (String)flightJSON.get(FLIGHT_ID);
                    String departingLocation = (String)flightJSON.get(DEPARTURE_LOC);
                    String arrivalLocation = (String)flightJSON.get(ARRIVAL_LOC);
                    String numPassengers = (String)flightJSON.get(NUM_PASSENGERS);
                    String airline = (String)flightJSON.get(AIRLINE);
                    String availability = (String)flightJSON.get(AVAILABILITY);
                    String arrivalTime = (String)flightJSON.get(ARRIVAL_TIME);
                    String departureTime = (String)flightJSON.get(DEPARTURE_TIME);
                    String arrivalDate = (String)flightJSON.get(ARRIVAL_DATE);
                    String departureDate = (String)flightJSON.get(DEPARTURE_DATE);


                   flights.add(new Flight(flightID, airline, 
                   availability, departingLocation, 
                   departureDate, departureTime, 
                   arrivalLocation, arrivalDate, arrivalTime));
                   
                }
                return flights;
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            return null;


        }
}
