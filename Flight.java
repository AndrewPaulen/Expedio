import java.util.ArrayList;

/**
 * The flight class
 * @author Andrew Paulen
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
    protected Plane plane;
    protected boolean carryOn;
    protected int numOfLuggage;

    public Flight(String flightID, String airline, boolean available, String departureLocation, String departureTime, String arrivalLocation, String arrivalTime) {
        this.flightID = flightID;
        this.airline = airline;
        this.available = available;
        this.departureLocation = departureLocation;
        this.departureTime = departureTime;
        this.arrivalLocation = arrivalLocation;
        this.arrivalTime = arrivalTime;
    }

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
     * Method that will allow the program to print out the users flight details 
     * @return The users flight details
     */
    public String toString()
    {
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

    public String getFlightID(){
        return this.flightID;
    }
}