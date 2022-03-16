import java.util.ArrayList;

/**
 * The preferences of the user for flights
 * @author Andrew Paulen
 */
public class FlightPreference 
{
    public Rating minRating;
    public boolean none;
    public FlightClass classType;
    public Orientation seatOrientation;
    public String departureTime;
    public String departureLocation;
    public String airline;
    public boolean petFriendly;
    public ArrayList <FlightPreference> preferences;

    // Call the set methods from UI to be added to the ArrayList of preferences, do not think we need any other methods in here

    public Rating getMinRating()
    {
        return minRating;
    }

    public void setMinRating (Rating minRating)
    {
        this.minRating = minRating;
    }

    public boolean getNone()
    {
        return none;
    }

    public void setNone (boolean none)
    {
        this.none = none;
    }

    public FlightClass getClassType()
    {
        return classType;
    }

    public void setClassType (FlightClass classType)
    {
        this.classType = classType;
    }

    public Orientation getSeatOrientation()
    {
        return seatOrientation;
    }

    public void setSeatOrientation (Orientation orientation)
    {
        this.seatOrientation = seatOrientation;
    }

    public String getDepartureTime()
    {
        return departureTime;
    }

    public void setDepartureTime (String departureTime)
    {
        this.departureTime = departureTime;
    }

    public String getDepartureLocation()
    {
        return departureLocation;
    }

    public void setDepartureLocation (String departureLocation)
    {
        this.departureLocation = departureLocation;
    }

    public String getAirline()
    {
        return airline;
    }

    public void setAirline (String airline)
    {
        this.airline = airline;
    }

    public boolean getPetFriendly()
    {
        return petFriendly;
    }

    public void setPetFriendly (boolean petFriendly)
    {
        this.petFriendly = petFriendly;
    }

    public ArrayList <FlightPreference> getPreferences()
    {
        return preferences;
    }

    public void setPreferences (ArrayList <FlightPreference> preferences)
    {
        this.preferences = preferences;
    }
}
