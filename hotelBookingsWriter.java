
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class hotelBookingsWriter extends hotelBookingsConstants{
    
    public hotelBookingsWriter(){
        
    }
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

    public static JSONObject getHotelJSON(Hotel hotel){
        JSONObject hotelBookingsDetails = new JSONObject();
        hotelBookingsDetails.put(CHECK_IN_TIME, hotel.getCheckInTime().toString());
        hotelBookingsDetails.put(CHECK_IN_DATE, hotel.getCheckInDate().toString());
        hotelBookingsDetails.put(HOTEL_LOCATION, hotel.getLocation().toString());
        hotelBookingsDetails.put(CHECK_OUT_TIME, hotel.getCheckOutTime().toString());
        hotelBookingsDetails.put(CHECK_OUT_DATE, hotel.getCheckOutDate().toString());
        hotelBookingsDetails.put(ROOM_NUMBER, hotel.getRoomNUmber.toString());
        hotelBookingsDetails.put(AVAILABILITY, hotel.getVacancy());
        hotelBookingsDetails.put(HOTEL_ID, hotel.getID());

        return hotelBookingsDetails;
    }
}
