

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 * piss<3
 */
public class HotelWriter extends HotelConstants{
    
    public HotelWriter(){
        
    }
    public static void saveHotels(){
        HotelSingleton hotels = HotelSingleton.getInstance();
        ArrayList<Hotel> hotelList = hotels.getHotels();
        JSONArray jsonHotels = new JSONArray();

        //creating all the json objects
        for(int i=0; i < hotelList.size();i++){
            jsonHotels.add(getHotelJSON(hotelList.get(i)));
        }

        //write JSON file
        try(FileWriter file = new FileWriter(HOTEL_FILE_NAME)){
            file.write(jsonHotels.toJSONString());
            file.flush();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static JSONObject getHotelJSON(Hotel hotel){
        JSONObject hotelDetails = new JSONObject();
        hotelDetails.put(HOTEL_ID, hotel.getID().toString());
        hotelDetails.put(HOTEL_NAME, hotel.getName());
        hotelDetails.put(HOTEL_LOCATION, hotel.getLocation());
        hotelDetails.put(HOTEL_VACANCY, hotel.getVacancy());
  

        return hotelDetails;
    }
}
