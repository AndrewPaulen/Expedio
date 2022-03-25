import java.util.ArrayList;
import java.util.UUID;

/**
 * a class that produces and maintains only one instance of a hotelBooking
 * @author David Wamai 
 */
public class hotelBookingsSingleton {
    private static hotelBookingsSingleton hotelBookings;
    private ArrayList<Hotel> hotelBookingsList;
    /**
     * will check for an already existing instance of a hotel booking and will return the same instance if one is found.
     * If there is no instance, one will be created. 
     * @return an instance of hotelBookings
     */
    private static hotelBookingsSingleton getInstance(){
        if(hotelBookings == null){
            hotelBookings = new hotelBookingsSingleton();
        }
        return hotelBookings;
    }
    /**
     * will check to see if a specified hotel booking exists. will return true if one is found. 
     * @param hotelID the specified hotel 
     * @return true if a booking is found, false if one is not found. 
     */
    public boolean hasHotelBooking(String hotelID){
        for(Hotel hotelBooking: hotelBookingsList){
            if(hotelBooking.getHotelID().equals(hotelID)){
                return true;
            }
        }
        return false;
    }
    /**
     * functionally the same as hasHotelBooking(), but will return the booking of type Hotel rather
     * than a boolen expression
     * @param hotelID the specified hotel
     * @return a hotel of type Hotel. 
     */
    public Hotel getHotelBooking(String hotelID){
        for(Hotel hotel: hotelBookingsList){
            if(hotel.getHotelID().equals(hotelID)){
                return hotel;
            }
        }
        return null;
    }
    /**
     * @return an array list of hotel bookings. 
     */
    public ArrayList<Hotel> getHotelBookings(){
        return hotelBookingsList;
    }
    /**
     * will add a hotel booking to the array list containing hotel bookings. 
     * @param hotelID the hotels identification number 
     * @param location the hotels location 
     * @param vacancy a boolean value that determines room vacancy 
     * @param checkInTime the booking check-in-time
     * @param checkInDate the booking check-in-date
     * @param checkOutTime the booking check-out-time
     * @param checkOutDate the booking check-out-date
     * @return a true boolean value if the add() function executes successfully. 
     */
    public boolean addHotelBooking(String hotelID, Location location, boolean vacancy, String checkInTime, String checkInDate, String checkOutTime, String checkOutDate){
        if(hasHotelBooking(hotelID)){
            return false;
        }

        hotelBookingsList.add(new Hotel(hotelID, location, vacancy, checkInTime, checkOutTime, checkInDate, checkOutDate));
        return true;
    }
    /**
     * will save the list of hotel bookings to a json file utilizing the hotelBookingsWriter. 
     */
    public void saveHotelBooking(){
        hotelBookingsWriter.saveHotelBookings();
    }
}
