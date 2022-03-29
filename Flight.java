import java.util.ArrayList;
import java.util.Properties;

/**
 * The flight class
 * 
 * @author Andrew Paulen
 */
public class Flight {
    protected String flightID;
    protected String airline;
    protected int capacity;
    protected String available;
    protected String departureLocation;
    protected String departureDate;
    protected String departureTime;
    protected String arrivalLocation;
    protected String arrivalDate;
    protected String arrivalTime;
    protected int duration;
    protected ArrayList<FlightType> flightType;
    protected Plane plane;
    protected boolean carryOn;
    protected int numOfLuggage;
    protected String seatNumber;
    protected String[] seatNumberArr;
    protected boolean hasTransfer;
    protected int numTransfers;
    protected String transferDuration;
    protected Location depLocation;
    protected Location arrLocation;
    protected String date;

    /**
     * An instance of a flight
     * 
     * @param flightID          The flight's ID
     * @param airline           The name of the airline
     * @param available         Checks if the flight's departure date has already
     *                          passed
     * @param departureLocation Where the flight is departing from
     * @param departureDate     What day the flight is departing
     * @param departureTime     What time the flight is departing
     * @param arrivalLocation   Where the flight is arriving
     * @param arrivalDate       What day the flight is arriving
     * @param arrivalTime       What time the flight is arriving
     * @param hasTransfer       If the flight has any transfer flights
     * @param numTransfers      The number of transfers a flight has
     * @param transferDuration  The duration of a transfer
     */
    public Flight(String flightID, String airline, String available, String departureLocation, String departureDate,
            String departureTime, String arrivalLocation, String arrivalDate, String arrivalTime, boolean hasTransfer,
            int numTransfers, String transferDuration, String seatNumber) {
        this.flightID = flightID;
        this.airline = airline;
        this.available = available;
        this.departureLocation = departureLocation;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalLocation = arrivalLocation;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.seatNumber = seatNumber;

    }
    public Flight(String flightID, String airline, String available, Location departureLocation, String departureDate, String departureTime, Location arrivalLocation, String arrivalDate, String arrivalTime, boolean hasTransfer, int numTransfers, String transferDuration, String seatNumber) {
        this.flightID = flightID;
        this.airline = airline;
        this.available = available;
        this.depLocation = departureLocation;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrLocation = arrivalLocation;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.seatNumber = seatNumber;
    }

    /**
     * An instance of a flight
     * 
     * @param aDeparting   The departing destination
     * @param aDestination The arrival destination
     * @param date         The date of the flight
     * @param airline      The name of the airline
     * @param duration     The duration of the flight
     * @param seatNumber   The seat number on the flight
     */
    public Flight(Location aDeparting, Location aDestination, String date, String airline, int duration,
            String seatNumber) {
        this.depLocation = aDeparting;
        this.arrLocation = aDestination;
        this.duration = duration;
        this.date = date;
        this.airline = airline;
        this.seatNumber = seatNumber;
    }

    /**
     * 
     */
    public void bookFlight() {

    }

    /**
     * Method that will allow the program to print out the users flight details
     * 
     * @return The users flight details
     */
    public String toString() {
        return depLocation + " to " + arrLocation + " on " + date + " with " + airline + ". Your flight will last "
                + duration + " minutes.";
    }

    /**
     * Sorts the flights
     * 
     * @param preferences
     */
    public void sortFlights(ArrayList<Preferences> preferences) {

    }

    /**
     * Adds baggage
     * 
     * @param carryOn      If the user has a carry on bag
     * @param numOfLuggage How much luggage the user has
     * @return null
     */
    public ArrayList<Object> addBaggage(boolean carryOn, int numOfLuggage) {
        return null;
    }

    /**
     * Gets the flight ID
     * 
     * @return flightID The flight's ID
     */
    public String getFlightID() {
        return flightID;
    }

    /**
     * Sets the flight ID
     * 
     * @param flightID The flight's ID
     */
    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    /**
     * Gets the name of the airline
     * 
     * @return airline The name of the airline
     */
    public String getAirline() {
        return airline;
    }

    /**
     * Sets the name of the airline
     * 
     * @param airline The name of the airline
     */
    public void setAirline(String airline) {
        this.airline = airline;
    }

    /**
     * Gets the capacity of the airline
     * 
     * @return capacity How many passangers can be on the flight
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the capacity of the airline
     * 
     * @param capacity How many passangers can be on the flight
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Gets the flight's availability
     * 
     * @return available Checks if the flight's departure date has already passed
     */
    public String getAvailable() {
        return available;
    }

    /**
     * Sets the flight's availability
     * 
     * @param available Checks if the flight's departure date has already passed
     */
    public void setAvailable(String available) {
        this.available = available;
    }

    /**
     * Gets the departure location
     * 
     * @return depLocation Where the flight is departing
     */
    public Location getDepartureLocation() {
        return depLocation;
    }

    /**
     * Sets the departure location
     * 
     * @param departureLocation Where the flight is departing
     */
    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    /**
     * Gets the date of departure
     * 
     * @return departureDate The day the flight is departing
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the date of departure
     * 
     * @param departureDate The day the flight is departing
     */
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    /**
     * Gets the time of departure
     * 
     * @return departureTime The time the flight departs
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the time of departure
     * 
     * @param departureTime The time the flight departs
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * Gets the arrival location
     * 
     * @return arrLocation The arrival location of the flight
     */
    public Location getArrivalLocation() {
        return arrLocation;
    }

    /**
     * Gets the arrival location
     */
    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    /**
     * Gets the date of arrival
     * 
     * @return arrivalDate The day the flight arrives
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the date of arrival
     * 
     * @param arrivalDate The day the flight arrives
     */
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    /**
     * Gets the arrival time
     * 
     * @return arrivalTime The time the flight arrives
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the arrival time
     * 
     * @param arrivalTime The time the flight arrives
     */
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * Gets the duration of the flight
     * 
     * @return duration How long the flight is
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets the duration of the flight
     * 
     * @param duration How long the flight is
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Gets the type of flight
     * 
     * @return flightType What kind of flight the flight is (international,
     *         national, etc.)
     */
    public ArrayList<FlightType> getFlightType() {
        return flightType;
    }

    /**
     * Sets the type of flight
     * 
     * @return flightType What kind of flight the flight is (international,
     *         national, etc.)
     */
    public void setFlightType(ArrayList<FlightType> flightType) {
        this.flightType = flightType;
    }

    /**
     * Gets the plane
     * 
     * @return plane The plane
     */
    public Plane getPlane() {
        return plane;
    }

    /**
     * Sets the plane
     * 
     * @param plane The plane
     */
    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    /**
     * Gets the carry on baggage
     * 
     * @return carryOn If the user has carry on baggage
     */
    public boolean getCarryOn() {
        return carryOn;
    }

    /**
     * Sets the carry on baggage
     * 
     * @param carryOn If the user has carry on baggage
     */
    public void setCarryOn(boolean carryOn) {
        this.carryOn = carryOn;
    }

    /**
     * Gets the amount of luggage the user has
     * 
     * @return numOfLuggage The amount of luggage the user has
     */
    public int getNumOfLuggage() {
        return numOfLuggage;
    }

    /**
     * Sets the amount of luggage the user has
     * 
     * @return numOfLuggage The amount of luggage the user has
     */
    public void setNumOfLuggage(int numOfLuggage) {
        this.numOfLuggage = numOfLuggage;
    }

    /**
     * Gets the seat number
     * 
     * @return this.seatNumber The seat number
     */
    public String[] getSeatNumberArr() {
        return this.seatNumberArr;
    }

    public String getSeatNumber(){
        return this.seatNumber;
    }

    public String getDepLocation(){
        return departureLocation;
    }

    public String getArrLocation(){
        return arrivalLocation;
    }

    public static String seatNumtoString(String [] seatNums){
        StringBuffer sb = new StringBuffer();

        for (String seat : seatNums) {
            sb.append(seat+", ");
        }
        String str = sb.toString();

        return str;
    }
}