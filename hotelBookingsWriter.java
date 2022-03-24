
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 * a class that adds json-in functionality for hotelBookings. 
 */
public class hotelBookingsWriter extends hotelBookingsConstants{
    
    public hotelBookingsWriter(){
        
    }
    /**
     * loops through an array list of hotel bookings and transposes each one to a json object. each object is written to the appropriate json file. 
     */
    public static void saveHotelBookings(){
        HotelSingleton hotelBookings = HotelSingleton.getInstance();
        ArrayList<Hotel> hotelBookingsList = hotelBookings.getHotels();
        JSONArray jsonHotels = new JSONArray();

        //creating all the json objects
        for(int i=0; i < hotelBookingsList.size();i++){
            jsonHotels.add(getHotelJSON(hotelBookingsList.get(i)));
        }

        //write JSON file
        try(FileWriter file = new FileWriter(HOTEL_BOOKINGS_FILENAME)){
            file.write(jsonHotels.toJSONString());
            file.flush();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    /**
     * creates a new json object based off the provided hotels parameters
     * @param hotel the specified hotel
     * @return a JSONObject of a hotel of type Hotel
     */
    public static JSONObject getHotelJSON(Hotel hotel){
        JSONObject hotelBookingDetails = new JSONObject();
        hotelBookingDetails.put(CHECK_IN_TIME, hotel.getCheckInTime().toString());
        hotelBookingDetails.put(CHECK_IN_DATE, hotel.getCheckInDate().toString());
        hotelBookingDetails.put(HOTEL_LOCATION, hotel.getLocation().toString());
        hotelBookingDetails.put(CHECK_OUT_TIME, hotel.getCheckOutTime().toString());
        hotelBookingDetails.put(CHECK_OUT_DATE, hotel.getCheckOutDate().toString());
        hotelBookingDetails.put(ROOM_NUMBER, hotel.getRoomNumber().toString());
        hotelBookingDetails.put(AVAILABILITY, hotel.getVacancy());
        hotelBookingDetails.put(HOTEL_ID, hotel.getID());

        return hotelBookingDetails;
    }
}
