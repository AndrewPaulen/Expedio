import java.io.*;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class hotelBookingsLoader extends hotelBookingsConstants{
    
    public hotelBookingsLoader() {

    }

    public static ArrayList<Hotel> getHotelBookings(){

        ArrayList<Hotel> hotelBookings = new ArrayList<Hotel>();

        try{
            FileReader reader = new FileReader(HOTEL_BOOKINGS_FILENAME);
            JSONParser parser = new JSONParser();
            JSONArray hotelBookingsJSON = (JSONArray)new JSONParser().parse(reader);

            for(int i = 0; i< hotelBookingsJSON.size(); i++){
                JSONObject hotelBookingJSON = (JSONObject)hotelBookingsJSON.get(i);
                String checkInTime = (String)hotelBookingJSON.get(CHECK_IN_TIME);
                String checkInDate = (String)hotelBookingJSON.get(CHECK_OUT_DATE);
                String hotelLocation = (String)hotelBookingJSON.get(HOTEL_LOCATION);
                String checkOutTime = (String)hotelBookingJSON.get(CHECK_OUT_TIME);
                String checkOutDate = (String)hotelBookingJSON.get(CHECK_OUT_DATE);
                String guestFirstName = (String)hotelBookingJSON.get(GUEST_FIRST);
                String guestLastName = (String)hotelBookingJSON.get(GUEST_LAST);
                String roomNumber = (String)hotelBookingJSON.get(ROOM_NUMBER);
                boolean availabiltiy = (boolean)hotelBookingJSON.get(AVAILABILITY);
                String hotelID = (String)hotelBookingJSON.get(HOTEL_ID);

                hotelBookings.add(new Hotel(guestFirstName, hotelLocation, availabiltiy,));
            }
            return hotelBookings;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
