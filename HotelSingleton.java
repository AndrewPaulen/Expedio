
import java.util.ArrayList;
import java.util.UUID;
/**
 * a class that produces a single instance of a Hotel
 */
public class HotelSingleton {
    private static HotelSingleton hotels;
    private ArrayList<Hotel> hotelList;

    private HotelSingleton() {
        hotelList = HotelLoader.getHotels();
    }
    /**
     * a method that creates an instance of hotelSingleton if one doesnt exist already. 
     * if one does exist, then the same instance is returned. 
     * @return
     */
    public static HotelSingleton getInstance() {
        if(hotels == null) {
            hotels = new HotelSingleton();
        }

        return hotels;
    }
    /**
     * checks for an existing hotel
     * @param hotelName name of the hotel. 
     * @return true if the hotel exists, false if it does not. 
     */
    public boolean hasHotel(String hotelName){
        for(Hotel hotel: hotelList){
            if(hotel.getName().equals(hotelName)){
                return true;
            }
        }
        return false;
    }
    /**
     * functionally the same as hasHotel(), but returns a type Hotel rather than a boolean value. 
     * @param hotelName
     * @return
     */
    public Hotel getHotel(String hotelName){
        for(Hotel hotel: hotelList){
            if(hotel.getName().equals(hotelName)){
                return hotel;
            }
        }
        return null;
    }
    /**
     * returns an array list of hotels. 
     * @return
     */
    public ArrayList<Hotel> getHotels(){
        return hotelList;
    }

    public boolean addHotel(String hotelName, Location location, boolean vacancy, String checkInTime, String checkOutTime, String checkInDate, String checkOutDate){
        if(hasHotel(hotelName)){
            return false;
        }

        hotelList.add(new Hotel(hotelName, location, vacancy, checkInTime, checkOutTime, checkInDate, checkOutDate));
        return true;
    }

    public void saveHotels() {
        HotelWriter.saveHotels();
    }
}
