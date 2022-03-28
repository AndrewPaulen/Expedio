import java.io.*;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class airlinesLoader extends airlinesConstants{

    public airlinesLoader(){
        
    }
        /**
         * @author David Wamai
         * A method that returns a list of flights by looping through JSON elements. 
         * Each iteration of the loop will copy the contents from each element and add them to an array list
         * @return an array list of flights yielded from flights.json
         */
        public static ArrayList<Airline> getAirlines(){
            
            ArrayList<Airline> airlines = new ArrayList<Airline>();

            try {
                FileReader reader = new FileReader(AIRLINES_FILE_NAME);
                JSONParser parser = new JSONParser(); //investigate why this is never used but still included
                JSONArray airlinesJSON = (JSONArray)new JSONParser().parse(reader);

                for(int i = 0; i < airlinesJSON.size(); i++){
                    JSONObject airlineJSON = (JSONObject)airlinesJSON.get(i);
                    String airlineName = (String)airlineJSON.get(AIRLINE_NAME);
                    
                    airlines.add(new Airline(airlineName));
                }
                return airlines;
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            return null;


        }

        public String getAirline(){
            Random rand = new Random();
            int randomNumber = rand.nextInt(10 - 0 + 1)+0;

            ArrayList<Airline> airline = getAirlines();

            return airline.get(randomNumber).getName();
        }

        public String tooString(){
            Airline airline = new Airline();
            return airline.getName();
        }
}
