import java.io.*;
import java.util.ArrayList;
import java.util.UUID;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 * a class that provides json-out functionality for the Type Hotel
 * @author David Wamai 
 */
public class HotelLoader extends HotelConstants{

    public HotelLoader(){
        
    }
    /**
     * a method that reutrns an Array List of hotels based on hotels.json
     * @return an array list of hotels. 
     */
    public static ArrayList<Hotel> getHotels() {
        
        ArrayList<Hotel> hotels = new ArrayList<Hotel>();

        try {
            FileReader reader = new FileReader(HOTEL_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray hotelsJSON = (JSONArray)new JSONParser().parse(reader);

            for (int i = 0; i < hotelsJSON.size(); i++){
                JSONObject hotelJSON = (JSONObject)hotelsJSON.get(i);
                UUID id = UUID.fromString((String)hotelJSON.get(HOTEL_ID));
                String name = (String)hotelJSON.get(HOTEL_NAME);
                Location location = (Location)hotelJSON.get(HOTEL_LOCATION);
                boolean vacancy = (boolean)hotelJSON.get(HOTEL_VACANCY);
                int numRooms = (int)hotelJSON.get(NUM_HOTEL_ROOMS);

                hotels.add(new Hotel(id, name, location, vacancy));
            }
            return hotels;
        }
        catch (Exception e){
            e.printStackTrace();
        }
            return null;
    }
    
}

