import java.util.ArrayList;
import java.util.UUID;


public class hotelBookingsSingleton {
    private static hotelBookingsSingleton hotelBookings;
    private ArrayList<Hotel> hotelBookingsList;

    private static hotelBookingsSingleton getInstance(){
        if(hotelBookings == null){
            hotelBookings = new hotelBookingsSingleton();
        }
        return hotelBookings;
    }

    public boolean hasHotelBookings(String hotelID){
        for(Hotel hotelBooking: hotelBookingsList){
            if(hotelBooking.getHotelID().equals(hotelID)){
                return true;
            }
        }
        return false;
    }

    public Hotel getHotelBookings(String hotelID){
        for(Hotel hotel: hotelBookingsList){
            if(hotel.getHotelID().equals(hotelID)){
                return hotel;
            }
        }
        return null;
    }

    public ArrayList<Hotel> getHotelBookings(){
        return hotelBookingsList;
    }

    public boolean addHotelBooking(String hotelID, String location, boolean vacancy, String checkInTime, String checkInDate, String checkOutTime, String checkOutDate){
        if(hasHotelBookings(hotelID)){
            return false;
        }

        hotelBookingsList.add(new Hotel(hotelID, location, vacancy, checkInTime, checkOutTime, checkInDate, checkOutDate));
        return true;
    }

    public void saveHotelBooking(){
        hotelBookingsWriter.saveHotelBookings();
    }
}
