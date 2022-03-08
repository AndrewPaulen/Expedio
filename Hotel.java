import java.util.ArrayList;

/**
 * 
 */
public class Hotel 
{
    protected String location;
    protected Double price;
    protected Double rating;
    protected String brand;
    // Check in and out feel like they don't belong here
    protected String checkInTime;
    protected String checkOutTime;
    protected boolean animal;

    /**
     * 
     * @param room
     * @param preferences
     * @return
     */
    public HotelRoom bookRoom (HotelRoom room, ArrayList <Preferences> preferences)
    {
        // Don't see why we need to pass preferences into the booking method
    }

    /**
     * 
     * @param location
     * @param price
     * @param rating
     * @param brand
     * @param checkInTime
     * @param checkOutTime
     * @return
     */
    public String printItinerary (String location, Double price, Double rating, String brand, String checkInTime, String checkOutTime)
    {
        // Changed to String because we cannot print here
        // Can we change this to toString for ease of use?
        // Also do we need to pass all this stuff in when the class has attributes for them?
    }

    /**
     * 
     * @param price
     * @param checkInTime
     * @param checkOutTime
     * @param location
     * @param roomType
     * @return
     */
    public String displayHotelRoom (Double price, String checkInTime, String checkOutTime, String location, RoomType roomType)
    {
        // Changed to String because we cannot print here
        // This feels the exact same as a toString method
        // We do not need to pass these if the class has attributes for them 
    }

    /**
     * 
     * @param checkInTime
     * @param checkOutTime
     * @param location
     * @param roomType
     * @return
     */
    public String printItinerary (String checkInTime, String checkOutTime, String location, RoomType roomType)
    {
        // Changed to String because we cannot print here
        // Seems like this would be toString as well
        // We don't need to pass this stuff 
    }

    /**
     * 
     * @param preferences
     */
    public void sortHotels (ArrayList <Preferences> preferences)
    {

    }

    /**
     * 
     * @param animal
     * @return
     */
    public boolean hasAnimal (boolean animal)
    {
        // Not sure what the purpose of this method is
    }
}