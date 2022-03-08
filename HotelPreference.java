import java.util.ArrayList;

/**
 * 
 */
// Changed to HotelPreference to allow for enum file
public class HotelPreference implements Preferences
{
    public Rating rating;
    public String none;
    public int numberOfBeds;
    public String bedType;
    public boolean smoking;
    public ArrayList <HotelPreference> preferences;

    /**
     * 
     * @param NumberOfBeds
     * @param bedType
     * @param smoking
     * @param numGuests
     * @param animal
     * @return
     */
    public ArrayList <HotelPreference> newPreferences (int NumberOfBeds, String bedType, boolean smoking, int numGuests, boolean animal)
    {
        // If we are going to have it in the constructor it needs to be a class attribute
    }

    /**
     * 
     */
    public void setNumBeds()
    {
        // Needs to take in something
    }

    /**
     * 
     */
    public void setBedType()
    {
        // Needs to take in something
    }

    /**
     * 
     */
    public void setSmoking()
    {
        // Needs to take in something
    }
}
