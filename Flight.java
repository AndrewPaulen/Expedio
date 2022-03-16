import java.util.ArrayList;
import java.util.Properties;

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
    protected String departureDate;
    protected String departureTime;
    protected String arrivalLocation;
    protected String arrivalDate;
    protected String arrivalTime;
    protected int duration;
    protected ArrayList <FlightType> flightType;
    protected Plane plane;
    protected boolean carryOn;
    protected int numOfLuggage;

    public Flight(String flightID, String airline, boolean available, String departureLocation, String departureDate, String departureTime, String arrivalLocation, String arrivalDate, String arrivalTime) {
        this.flightID = flightID;
        this.airline = airline;
        this.available = available;
        this.departureLocation = departureLocation;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalLocation = arrivalLocation;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
    }

    /**
     * 
     */
    public void bookFlight ()
    {
        
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
        return null;
    }

    public String getFlightID()
    {
        return flightID;
    }

    public void setFlightID (String flightID)
    {
        this.flightID = flightID;
    }

    public String getAirline() 
    {
        return airline;
    }

    public void setAirline (String airline)
    {
        this.airline = airline;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity (int capacity)
    {
        this.capacity = capacity;
    }

    public boolean getAvailable()
    {
        return available;
    }

    public void setAvailable (boolean available)
    {
        this.available = available;
    }

    public String getDepartureLocation()
    {
        return departureLocation;
    }

    public void setDepartureLocation (String departureLocation)
    {
        this.departureLocation = departureLocation;
    }

    public String getDepartureDate()
    {
        return departureDate;
    }

    public void setDepartureDate (String departureDate)
    {
        this.departureDate = departureDate;
    }

    public String getDepartureTime()
    {
        return departureTime;
    }

    public void setDepartureTime (String departureTime)
    {
        this.departureTime = departureTime;
    }

    public String getArrivalLocation()
    {
        return arrivalLocation;
    }

    public void setArrivalLocation (String arrivalLocation)
    {
        this.arrivalLocation = arrivalLocation;
    }

    public String getArrivalDate()
    {
        return arrivalDate;
    }

    public void setArrivalDate (String arrivalDate)
    {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalTime()
    {
        return arrivalTime;
    }

    public void setArrivalTime (String arrivalTime)
    {
        this.arrivalTime = arrivalTime;
    }

    public int getDuration()
    {
        return duration;
    }

    public void setDuration (int duration)
    {
        this.duration = duration;
    }

    public ArrayList <FlightType> getFlightType()
    {
        return flightType;
    }

    public void setFlightType (ArrayList <FlightType> flightType)
    {
        this.flightType = flightType;
    }

    public Plane getPlane()
    {
        return plane;
    }

    public void setPlane (Plane plane)
    {
        this.plane = plane;
    }

    public boolean getCarryOn()
    {
        return carryOn;
    }

    public void setCarryOn (boolean carryOn)
    {
        this.carryOn = carryOn;
    }

    public int getNumOfLuggage()
    {
        return numOfLuggage;
    }

    public void setNumOfLuggage (int numOfLuggage)
    {
        this.numOfLuggage = numOfLuggage;
    }
}