/**
 * An individual planeSeat
 * 
 * @author Andrew Paulen
 */
public class PlaneSeat {
    private boolean hasPassenger;
    protected Orientation orientation;
    protected FlightClass flightClass;

    /**
     * Gets if a seat has a passenger or not
     * 
     * @return hasPassenger If a seat has a passenger or not
     */
    public boolean getHasPassenger() {
        return hasPassenger;
    }

    /**
     * Sets if a seat has a passenger or not
     * 
     * @param hasPassenger If a seat has a passenger or not
     */
    public void setHasPassenger(boolean hasPassenger) {
        this.hasPassenger = hasPassenger;
    }

    /**
     * Gets the seat's orientation
     * 
     * @return orientation The orientation of the seat (aisle, middle, or window)
     */
    public Orientation getOrientation() {
        return orientation;
    }

    /**
     * Sets the seat's orientation
     * 
     * @param orientation The orientation of the seat (aisle, middle, or window)
     */
    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    /**
     * Gets the class (economy or first)
     * 
     * @return flightClass The class where the user is sitting (economy or first)
     */
    public FlightClass getFlightClass() {
        return flightClass;
    }

    /**
     * Sets the class (economy or first)
     * 
     * @param flightClass The class where the user is sitting (economy or first)
     */
    public void setFlightClass(FlightClass flightClass) {
        this.flightClass = flightClass;
    }
}