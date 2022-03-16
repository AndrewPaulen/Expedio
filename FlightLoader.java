import java.io.*;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class FlightLoader extends FlightConstants{
    
        public static ArrayList<Flight> getFlights(){
            
            ArrayList<Flight> flights = new ArrayList<Flight>();

            try {
                FileReader reader = new FileReader(FLIGHTS_FILE_NAME);
                JSONParser parser = new JSONParser();
                JSONArray flightsJSON = (JSONArray)new JSONParser().parse(reader);

                for(int i = 0; i < flightsJSON.size(); i++){
                    JSONObject flightJSON = (JSONObject)flightsJSON.get(i);
                    String passengerUID = (String)flightJSON.get(FLIGHT_ID);
                    String departingLocation = (String)flightJSON.get(DEPARTING);
                    String arrivalLocation = (String)flightJSON.get(ARRIVING);
                    String numPassengers = (String)flightJSON.get(NUM_PASSENGERS);

                    //flights.add(new Flight(passengerUID, departingLocation, arrivalLocation, numPassengers));
                }
                return flights;
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            return null;


        }
}
