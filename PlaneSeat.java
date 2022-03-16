/**
 * An individual planeSeat
 * @author Andrew Paulen
 */
public class PlaneSeat 
{
    private boolean hasPassenger;
    protected Orientation orientation;
    protected FlightClass flightClass;

    public boolean getHasPassenger()
    {
        return hasPassenger;
    }

    public void setHasPassenger (boolean hasPassenger)
    {
        this.hasPassenger = hasPassenger;
    }

    public Orientation getOrientation()
    {
        return orientation;
    }

    public void setOrientation (Orientation orientation)
    {
        this.orientation = orientation;
    }

    public FlightClass getFlightClass()
    {
        return flightClass;
    }

    public void setFlightClass (FlightClass flightClass)
    {
        this.flightClass = flightClass;
    }
}