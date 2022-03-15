import java.util.ArrayList;

/**
 * 
 */
public class Flight 
{
    protected String flightID;
    protected String airline;
    protected int capacity;
    protected boolean available;
    protected String departureLocation;
    protected String departureTime;
    protected String arrivalLocation;
    protected String arrivalTime;
    protected int duration;
    protected ArrayList <FlightType> flightType;
    protected ArrayList <Preferences> flightPreferences;
    protected Plane plane;
    // I say we don't worry about luggage but let's consult the requirements 
    protected boolean carryOn;
    protected int numOfLuggage;

    /**
     * 
     * @param departureLocation
     * @param departureTime
     * @param arrivalLocation
     * @param arrivalTime
     * @param flightType
     * @param preferences
     */
    public void bookFlight (String departureLocation, String departureTime, String arrivalLocation, String arrivalTime, FlightType flightType, ArrayList <Preferences> preferences)
    {
        // Why are we passing preferences in a book method?
        // If we have class attributes why are we passing them in?
        // Why in Hotel are we returning the HotelRoom bu aren't returning anything here?
    }

    /**
     * 
     * @return
     */
    public String printFlightDetail()
    {
        return "";
    }

    /**
     * 
     * @return
     */
    public String printTicket()
    {
        // Aren't this and printFlightDetail basically a toString method? Do we need both?
        return "";
    }

    /**
     * 
     * @param preferences
     */
    public void sortFlights (ArrayList <Preferences> preferences)
    {

    }

    /**
     * 
     * @return
     */
    public String displayLayover()
    {
        // Shouldn't this be included in the printFlightDetail?
        return "";
    }

    /**
     * 
     * @param carryOn
     * @param numOfLuggage
     * @return
     */
    public ArrayList <Object> addBaggage (boolean carryOn, int numOfLuggage)
    {
        // We would need a class for Baggage
        // Is this really necessary?
        return null;
    }
}