import java.io.*;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 * a class that provides json-out functionality for hotelBookings. 
 */
public class hotelBookingsLoader extends hotelBookingsConstants{
    
    public hotelBookingsLoader() {

    }
    /**
     * a method that loops through a json file and transcribes each element to a java parameter. 
     * @return an array list of hotels. 
     */
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
                Location hotelLocation = (Location)hotelBookingJSON.get(HOTEL_LOCATION);
                String checkOutTime = (String)hotelBookingJSON.get(CHECK_OUT_TIME);
                String checkOutDate = (String)hotelBookingJSON.get(CHECK_OUT_DATE);
                String guestFirstName = (String)hotelBookingJSON.get(GUEST_FIRST);
                String guestLastName = (String)hotelBookingJSON.get(GUEST_LAST);
                String roomNumber = (String)hotelBookingJSON.get(ROOM_NUMBER);
                boolean availabilty = (boolean)hotelBookingJSON.get(AVAILABILITY);
                String hotelID = (String)hotelBookingJSON.get(HOTEL_ID);

                hotelBookings.add(new Hotel(guestLastName, hotelLocation, availabilty, checkInTime, checkOutTime, checkInDate, checkOutDate, roomNumber));
            }
            return hotelBookings;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
