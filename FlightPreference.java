import java.util.ArrayList;

/**
 * 
 */
public class FlightPreference 
{
    public Rating rating;
    public String none;
    // Class is a reserved word, need to change
    // Also this is not how enums work, need to fix
    // We can make reference to the enums that exists in the flight part for these two 
    public Class ClassType;
    public Orientaion seatOrientation;
    public String departureTime;
    public String departureLocation;
    public String airline;
    // What is this for?
    public int age;
    public ArrayList <FlightPreference> preferences;

    /**
     * 
     * @param classType
     * @param seatOrientation
     * @param departureTime
     * @param departureLocation
     * @param airline
     * @param animals
     * @return
     */
    public ArrayList <FlightPreference> newPreferences (Class classType, Orientation seatOrientation, String departureTime, String departureLocation, String airline, boolean animals)
    {
        // If we are going to have it in the constructor it needs to be a class attribute
    }

    /**
     * 
     */
    public void setClassType()
    {
        // Needs to take in something
    }

    /**
     * 
     */
    public void setSeatOrientation()
    {
        // Needs to take in something
    }

    /**
     * 
     */
    public void setDepartureTime()
    {
        // Needs to take in something
    }

    /**
     * 
     */
    public void setDepartureLocation()
    {
        // Needs to take in something
    }

    /**
     * 
     */
    public void setAirline()
    {
        // Needs to take in something 
    }

    /**
     * 
     */
    public void setArrivalLocation()
    {
        // Needs to take in something 
    }

    /**
     * 
     * @param age
     * @param numChildren
     */
    public void hasChildren (int age, int numChildren)
    {
        // Worded like it would be boolean, change method name
    }

    /**
     * 
     * @param numAnimals
     */
    public void hasAnimal (int numAnimals)
    {
        // Worded like it would be boolean, change method name
    }

    /**
     * 
     * @param minRating
     * @param maxRating
     */
    public void setRating (int minRating, int maxRating)
    {
        // No one has a max rating, we can drop that honestly
    }
}
