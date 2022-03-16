import java.util.ArrayList;

/**
 * The hotel preferences for the user
 * @author Andrew Paulen
 */
public class HotelPreference implements Preferences
{
    public Rating rating;
    public boolean none;
    public int numberOfBeds;
    public String bedType;
    public boolean smoking;
    public boolean petFriendly;
    public ArrayList <HotelPreference> preferences;

    // Call the set methods from UI to be added to the ArrayList of preferences, do not think we need any other methods in here

    public Rating getRating()
    {
        return rating;
    }

    public void setRating (Rating rating)
    {
        this.rating = rating;
    }

    public boolean getNone()
    {
        return none;
    }

    public void setNone (boolean none)
    {
        this.none = none;
    }

    public int getNumberOfBeds()
    {
        return numberOfBeds;
    }

    public void setNumberOfBeds (int numberOfBeds)
    {
        this.numberOfBeds = numberOfBeds;
    }

    public String getBedType()
    {
        return bedType;
    }

    public void setBedType (String bedType)
    {
        this.bedType = bedType;
    }

    public boolean getSmoking()
    {
        return smoking;
    }

    public void setSmoking (boolean smoking)
    {
        this.smoking = smoking;
    }

    public boolean getPetFriendly()
    {
        return petFriendly;
    }

    public void setPetFriendly (boolean petFriendly)
    {
        this.petFriendly = petFriendly;
    }

    public ArrayList <HotelPreference> getPreferences()
    {
        return preferences;
    }

    public void setPreferences (ArrayList <HotelPreference> preferences)
    {
        this.preferences = preferences;
    }
}
